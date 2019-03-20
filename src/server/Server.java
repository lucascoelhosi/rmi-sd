package server;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	private static final int PORT = 6001;

    /**
     * Cria uma inst�ncia da classe Server.
     *
     * @param remote Objeto que ser� acessado remotamente.
     * @param ip     Endere�o IP.
     * @param name   Nome do objeto.
     */
    public Server(Remote remote, String ip, String name)
            throws IllegalAccessException, InstantiationException
    {
        init(remote, ip, name);
    }

    private void init(Remote remote, String ip, String name)
    {
        try
        {
            //Cria um registro que aceita pedidos pela porta especificada.
            Registry registry = LocateRegistry.createRegistry(PORT);
            //Caminho com o ip, porta e nome.
            String uri = "rmi://" + ip + ":" + PORT + "/" + name;
            System.out.println(uri);
            //Vincula o caminho com um objeto que ser� acessado remotamente.
            Naming.rebind(uri, remote);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
