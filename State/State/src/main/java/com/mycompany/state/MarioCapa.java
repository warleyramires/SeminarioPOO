/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author Warley Ramires
 */
public class MarioCapa implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario Grande com Fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario Ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    
}
