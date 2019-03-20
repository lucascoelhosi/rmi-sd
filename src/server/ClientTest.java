package server;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class ClientTest {
	public static void main(String[] args) {
		String ip = "127.0.0.1", name = "Test";
		
//		int[] array = {1,4,3,2,7,9,0};
                ArrayList<Integer> array = new ArrayList<>();
                array.add(1);
                array.add(3);
                array.add(2);
		
                ArrayList<Integer> array_ord = new ArrayList<>();
		try {
			Client<ICalculator> client = new Client<ICalculator>(ip, name);
			array_ord = client.getRemoteObj().ordenar(array);
			
			System.out.println("Array Ordenado ");
			for(int i=0; i<array_ord.size(); i++) {
				System.out.print(array_ord.get(i) + "   ");
			}
			
		} catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (NotBoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
