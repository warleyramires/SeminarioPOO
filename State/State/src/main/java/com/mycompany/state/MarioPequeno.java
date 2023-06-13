/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author Warley Ramires
 */
public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegarFlor() {
        
        System.out.println("Mario grande com Fogo");
        return new MarioFogo();
    
    }

    @Override
    public MarioState pegarPena() {
    
        System.out.println("Mario Grande com Capa");
        
        return new MarioCapa();
    }
    

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Morto - Game Over");
        return new MarioMorto();
    }
    
}
