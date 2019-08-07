/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas-souza
 */
public class User {
    
    private int registration;
    private String name;
    
    public User(int registration, String name){
        this.registration = registration;
        this.name = name;
    }
    
    public int getRegistration(){
        return this.registration;
    }
    
    public String getName(){
        return this.name;
    }
    
}
