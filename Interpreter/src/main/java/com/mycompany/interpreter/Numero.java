/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreter;

/**
 *
 * @author warley
 */
public class Numero implements Operador {
    private int numero;
    
    public Numero(int numero){
        this.numero = numero;
    }

    @Override
    public int interpretar() {
        return this.numero;
    }
}
