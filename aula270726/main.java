/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prj_poo1_270726;

/**
 *
 * @author Iftm
 */
public class Prj_POO1_270726 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Teste t = new Teste();
        t.mostrar();
        t.somar();
        t.mostrarValor(t.somar("1", "4"));
        t.subtrair();
        t.mostrarValorSub(t.subtrair("2", "1"));
        t.mult();
        t.mostrarValorMult(t.mult("5", "4"));
        t.div();
        t.mostrarValorDiv(t.div("6", "3"));
    }
}
