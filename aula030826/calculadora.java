package com.poo.prj_calculadoraeqseggrau_poo1;

import com.poo.prj_calculadoraeqseggrau_poo1.bo.CalculoEqSegGrau;
import com.poo.prj_calculadoraeqseggrau_poo1.models.DadosEntrada;
import com.poo.prj_calculadoraeqseggrau_poo1.models.DadosSaida;
import java.util.Scanner;

public class Prj_CalculadoraEqSegGrau_POO1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        DadosEntrada de = new DadosEntrada();
        
        System.out.println("Digite um n: ");
        de.setA(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite um n: ");
        de.setB(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite um n: ");
        de.setC(Double.parseDouble(sc.nextLine()));
        
        CalculoEqSegGrau esg = new CalculoEqSegGrau();
        DadosSaida ds = esg.calcularDelta(de);
        ds = esg.calcularX1L(de);
        
        System.out.println("Delta: "+ds.getDelta());
        System.out.println("x ': "+ds.getX1L());
        System.out.println("x '': "+ds.getX2L());
        System.out.println("xV ': "+ds.getxV());
        System.out.println("yV ': "+ds.getyV());
 
    }
}
