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
public class Televisor extends Electrodomestico 
{
    private int pulgadas;
    private boolean sintonizador;
    
    
    private static final boolean SINTONIZADOR_DEFAULT  =  false;
    private static final int PULGADAS_DEFAULT  =  20;
    private static final int LIMITE_PULGADAS = 40;
    private static final int CON_SINTONIZADOR = 50;
    private static final double PORCENTAJE_INCREMENTO = 1.3;
    
    /**
     *
     * @return
     */
    
    
    
    
    @Override
        public double precioFinal()
    {     
        double precio;
        precio = getPrecioBase() + elValorDelConsumo() + elValorDelPeso();
        
        if(isSintonizador()){
            precio = precio + CON_SINTONIZADOR;
            }
        return pulgadas>LIMITE_PULGADAS ? precio * PORCENTAJE_INCREMENTO : precio;
    }
    

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public Televisor() 
    {
        super();
        pulgadas = PULGADAS_DEFAULT;
        sintonizador = SINTONIZADOR_DEFAULT;
       
    }

    
    
    public Televisor(int pulgaadas, boolean sintonizador, double precioBase, int peso) {
        super(precioBase, peso);
       this.pulgadas = pulgaadas;
        this.sintonizador = sintonizador;
        
    }

    @Override
    public String toString() {
        return super.toString() + "\npulgadas: " + pulgadas+"\nsintonizador: " + sintonizador;
    }

    public Televisor(int pulgadas, boolean sintonizador, double precioBase, String color, char consumo, int peso) {
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }
    
    
    
}
