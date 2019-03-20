package server;

import server.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Cliente.
 * Respons�vel por acessar um objeto remotamente por meio de um ip e um nome.
 *
 * @param <T> Tipo do objeto a ser acessado.
 */

public class Client<T extends Remote> {
	private static final int PORT = 6001;
    private final T remote;

    /**
     * Cria uma inst�ncia da classe Client.
     *
     * @param ip   Endere�o IP do local onde se quer acessar o objeto.
     * @param name Nome do objeto a ser acessado.
     */
    public Client(String ip, String name)
            throws RemoteException, NotBoundException, MalformedURLException
    {
        //Acessa um objeto remotamente atrav�s do ip do local onde est� o objeto e seu nome.
        remote = (T)Naming.lookup("rmi://" + ip + ":" + PORT + "/" + name);
    }

    /**
     * Obt�m o objeto remoto.
     */
    public T getRemoteObj()
    {
        return remote;
    }
}
