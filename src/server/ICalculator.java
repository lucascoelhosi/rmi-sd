package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ICalculator extends Remote {
	ArrayList<Integer> ordenar(ArrayList<Integer> arrays) throws RemoteException;
}
