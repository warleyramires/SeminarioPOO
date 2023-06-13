/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author Warley Ramires
 */
public interface MarioState {
    
    MarioState pegarCogumelo();
    
    MarioState pegarFlor();
    
    MarioState pegarPena();
    
    MarioState levarDano();
}
