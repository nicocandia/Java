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
public abstract class Electrodomestico {
    
    public static final double PRECIO_DEFAULT = 100.0;
    public static final int    PESO_DEFAULT = 15;
    public static final String COLOR_DEFAULT = "BLANCO";
    public static final char CONSUMO_DEFAULT = 'F';
    public static final String [] COLORES = {"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
    public static final char   [] CONSUMOS         = {'A'  ,'B' ,'C' ,'D' ,'E' ,'F','G'};
    public static final double [] VALORES_CONSUMOS = {100.0,80.0,60.0,50.0,30.0,10.0,5.0};
    
    
    private double precioBase;
    private String color;
    private char consumo;
    private int peso;

    public Electrodomestico(double precioBase, int peso)
    {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumo, int peso) 
    {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumo(consumo);
        this.peso = peso;
    }

    public Double elValorDelConsumo()
    {
        return VALORES_CONSUMOS[consumo - 'A'];
    }
    
    public Electrodomestico()
    {
        precioBase    = PRECIO_DEFAULT;
        color   = COLOR_DEFAULT;
        consumo = CONSUMO_DEFAULT;
        peso    = PESO_DEFAULT;
    }
    
    

    public double getPrecioBase() {
        return precioBase;
    }


    public String getColor() {
        return color;
    }


    public char getConsumo() {
        return consumo;
    }


    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() 
    {
        return  "Pecio Base: " + precioBase + "\nColor: " + color 
                              + "\nConsumo: " + consumo + "\nPeso: " + peso;
    }

    private char comprobarConsumo(char consumo)
    {
        consumo = Character.toUpperCase(consumo);
        
        for (int i = 0; i < CONSUMOS.length; i++)
        {
            if(consumo==CONSUMOS[i])
            {
                return consumo;
            }
        }
        return CONSUMO_DEFAULT;
    }
    
    private String comprobarColor(String color)
    {
        color = color.toUpperCase();
        
        for (int i = 0; i < CONSUMOS.length; i++)
        {
            if(color.equals(COLORES[i]))
            {
                return color;
            }
        }
        return COLOR_DEFAULT;
    }

    public Double elValorDelPeso()
    {
        if(peso < 20)
        {
            return 10.0;
        }
        else
        {
            if (peso < 50)
            {
                return 50.0; 
            }
            else
            {
                if (peso < 80)
                {
                    return 80.0;
                }
            }
        }
        return 100.0;
    }
    
    public abstract double precioFinal();
}
