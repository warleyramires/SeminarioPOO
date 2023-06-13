/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author Warley Ramires
 */
public class MarioFogo implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario ganha 1000 pontos");
        return this;
    
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario Grande com Capa");
        return new MarioCapa();
    
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
        
    }
    
}
