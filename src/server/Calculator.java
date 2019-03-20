/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author firmi
 */
import DAO.SequencyDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import model.Sequency;

public class Calculator extends UnicastRemoteObject implements ICalculator{
	protected Calculator() throws RemoteException {
		
	}
	
	public ArrayList<Integer> ordenar(ArrayList<Integer> array) throws RemoteException {
		System.out.println("Lista de numeros desordenados");
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i) + "  ");
		}
		
		
//		Arrays.sort(array);
                Collections.sort(array);
		
		System.out.println("\nLista de numeros ordenados");
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i) + "  ");
		}
		System.out.println("\n");
                
                String test="";
                
                for(int i=0; i<array.size(); i++){
                    test = test + " "+ array.get(i);
                }
                
                Sequency s = new Sequency(test);
                SequencyDAO sdao = new SequencyDAO();
                sdao.adiciona(s);
		
		return array;
	}
}