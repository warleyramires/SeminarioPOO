/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author Warley Ramires
 */
public class Mario {
    protected MarioState estado;
    
    public Mario(){
        estado = new MarioPequeno();
    }
    
    public void pegarCogumelo(){
        estado = estado.pegarCogumelo();
    }
    
    public void pegarFlor(){
        estado = estado.pegarFlor();
    }
    
    public void pegarPena(){
        estado = estado.pegarPena();
    }
    
    public void levarDano(){
        estado = estado.levarDano();
    }
}
