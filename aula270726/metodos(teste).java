package com.poo.prj_poo1_270726;

public class Teste
{
    public void mostrar()
    {
        System.out.println("Ola mundo !!!");
    }
    
    public void somar()
    {
        int nro1 = 5;
        int nro2 = 4;        
        int resultado = nro1 + nro2;        
        System.out.println(resultado);
    }
    
    public int somar(String nro1, String nro2)
    {
        int resultado = Integer.parseInt(nro1) + Integer.parseInt(nro2);
        return resultado;
    }
    
    public void mostrarValor (int valor)
    {
        System.out.println("O valor encontrado na soma eh: "+valor);        
    }
    
    public void subtrair()
    {
        int nro1 = 5;
        int nro2 = 2;        
        int resultado = nro1 - nro2;        
        System.out.println(resultado);
    }
    
    public int subtrair(String nro1, String nro2)
    {
        int resultado = Integer.parseInt(nro1) - Integer.parseInt(nro2);        
        return resultado;
    }
    
    public void mostrarValorSub (int valor)
    {
        System.out.println("O valor encontrado na subtracao eh: "+valor);        
    }
    public void mult()
    {
        int nro1 = 2;
        int nro2 = 3;        
        int resultado = nro1 * nro2;        
        System.out.println(resultado);            
    }
    
    public int mult(String nro1, String nro2)
    {
        int resultado = Integer.parseInt(nro1) * Integer.parseInt(nro2);
        return resultado;
    }
    
    public void mostrarValorMult (int valor)
    {
        System.out.println("O valor encontrado na multiplicao eh: "+valor);        
    }
    
    public void div()
    {
        int nro1 = 10;
        int nro2 = 5;        
        int resultado = nro1 / nro2;        
        System.out.println(resultado);            
    }
    
    public int div(String nro1, String nro2)
    {
        int resultado = Integer.parseInt(nro1) / Integer.parseInt(nro2);
        return resultado;
    }
    
    public void mostrarValorDiv (int valor)
    {
        System.out.println("O valor encontrado na divisao eh: "+valor);        
    }
    
}
