package fravega;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Candia family
 */
public class Lavadora extends Electrodomestico

{
    private static final int    CARGA_DEFAULT = 5;
    private static final int    LIMITE_CARGA  = 30;
    private static final double PLUS_CARGA  =  50.0;
    
    private int carga;

    public Lavadora() 
    {
        super();
        carga = CARGA_DEFAULT;
        
    }

    public Lavadora(double precioBase, int peso) 
    {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(int carga, double precioBase, String color, char consumo, int peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    @Override
    public String toString() 
    {
        return  super.toString() + "\nCarga: " + carga;
    }

  
    
    public int getCarga() 
    {
        return carga;
    }
    
    @Override
    public double precioFinal()
    {     
        double precio  = getPrecioBase() + elValorDelConsumo() + elValorDelPeso();
   
        return carga>LIMITE_CARGA ? precio + PLUS_CARGA : precio;
    }
}
