package com.poo.prj_calculadoraeqseggrau_poo1.bo;

import com.poo.prj_calculadoraeqseggrau_poo1.models.DadosEntrada;
import com.poo.prj_calculadoraeqseggrau_poo1.models.DadosSaida;

public class CalculoEqSegGrau 
{
    public DadosSaida calcularDelta(DadosEntrada de)
    {
        DadosSaida ds = new DadosSaida();
        ds.setDelta((de.getB()*de.getB()) - 4 * de.getA()*de.getC());      
        return ds;
    }
    
    public DadosSaida calcularX1L(DadosEntrada de)
    {
        DadosSaida ds = new DadosSaida();
        ds = calcularDelta(de);
        
        double x1L = (-de.getB() + Math.sqrt(ds.getDelta()))/2*de.getA();
        ds.setX1L(x1L);
        return ds;
    }
    
}
