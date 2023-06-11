/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreter;

/**
 *
 * @author warley
 */
public class Dividir implements Operador{
    
    private Operador esquerda;
    private Operador direita;
    
    public Dividir(Operador esquerda, Operador direita){
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    
    @Override
    public int interpretar() {
        return this.esquerda.interpretar() / this.direita.interpretar();
    }
    
}
