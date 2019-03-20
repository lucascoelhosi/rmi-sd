/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connection.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Sequency;

/**
 *
 * @author Daniel
 */
public class SequencyDAO {
    
    Connect cc = new Connect();
    Connection cn = cc.conexion();

    public void adiciona(Sequency s){
        
        try {
            PreparedStatement pst = cn.prepareStatement("insert into numbers (sequency) value (?)");
            pst.setString(1, s.getSequency());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }

    }
    
    
}
