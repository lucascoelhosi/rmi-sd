package server;

import server.*;
import java.rmi.RemoteException;
import model.Sequency;

public class ServerTest {
	public static void main(String[] args) {
		String ip = "127.0.0.1", name = "Test";
		try {
			Calculator calc = new Calculator();
			Server server = new Server(calc, ip, name);
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
                
                
	}
}
