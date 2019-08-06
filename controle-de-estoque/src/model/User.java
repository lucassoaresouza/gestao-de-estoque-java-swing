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
    
    int registration;
    String name;
    
    User(int registration, String name){
        this.registration = registration;
        this.name = name;
    }
    
    int getRegistration(){
        return this.registration;
    }
    
    String getName(){
        return this.name;
    }
    
}
