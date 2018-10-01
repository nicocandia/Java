/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravega;

import java.util.ArrayList;
/**
 *
 * @author Candia family
 */
public class Fravega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Electrodomestico e = new Lavadora(1250.33,120);
        Electrodomestico p = new Lavadora(28,125.10, "negro", 'N', 360);
        
        Electrodomestico t = new Televisor (46, false, 1500, "azul", 'b', 20);
        
         System.out.println(e +"\nPRECIO FINAL: "+e.precioFinal());
         System.out.println(p +"\nPRECIO FINAL: "+p.precioFinal());
         System.out.println(t +"\nPRECIO FINAL: "+t.precioFinal());
         
         ArrayList<Electrodomestico> lista = new ArrayList();
         
         lista.add(e);
         lista.add(p);
         lista.add(t);
         lista.add(new Lavadora());
         lista.add(new Televisor());
         
         ArrayList<Electrodomestico> losTelevisores = dameLosTelevisores(lista);
         
         
         System.out.println("\nLISTA DE ELECTRODOMESTICOS\n" +lista);
         
         System.out.println("\nLISTA DE TEEVISORES\n" +losTelevisores);
         
         //System.out.println("PRECIO DE LOS TELEVISORES: " +elPrecioDeLosTelevisores(lista,t.getClass()));
         
         
     }

    private static ArrayList<Electrodomestico> dameLosTelevisores(ArrayList<Electrodomestico> lista) 
    {
        ArrayList<Electrodomestico> elQueSale = new ArrayList();
        
        for (int i = 0; i < lista.size(); i++)
        {
            if (lista.get(i) instanceof Televisor)
            {
                elQueSale.add(lista.get(i));
            }
        }
                
       return elQueSale;
    }

    /*private static double elPrecioDeLosTelevisores(ArrayList<Electrodomestico> lista, 
            Class aClass)
    {  
        for (int i = 0; i < lista.size(); i++) 
        {
            if(lista.get(i).getClass().getSimpleName().equals(aClass.getSimpleName()))
            {
                
            }        
        }
        return 
    }*/
    
    
}
