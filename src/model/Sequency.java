/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author firmi
 */
public class Sequency {
    
    private int id;
    private String sequency;

    public Sequency(int id, String sequency) {
        this.id = id;
        this.sequency = sequency;
    }

    public Sequency(String sequency) {
        this.id = id;
        this.sequency = sequency;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSequency() {
        return sequency;
    }

    public void setSequency(String sequency) {
        this.sequency = sequency;
    }
    
    
    
}
