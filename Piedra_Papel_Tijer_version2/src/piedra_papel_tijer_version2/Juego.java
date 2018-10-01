/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijer_version2;
import java.util.Scanner;
/**
 *
 * @author Candia family
 */
public class Juego {
    private Jugador j2;
    private JugadorHumano j1;
    
    public Juego(String nombre1,String nombre2)
    {
    j1 = new JugadorHumano (nombre1);
    j2 = new Jugador (nombre2);
    }
    
    public void jugar() 
    {
        int cj1 = 0;
        int cj2 = 0;
        JugadorAbstracto  x;

        while (cj1 < 2 && cj2 < 2) 
        {
            System.out.println("Ingrese 1 para piedra ,2 para papel o 3 para tijera");
            Scanner teclado = new Scanner (System.in);
            int a;
            a = teclado.nextInt();
            
            j1.hacerGesto(a);System.out.println(j1);
            j2.hacerGesto();System.out.println(j2);
            x = quienGana();
            if (x == j1)
            {
                cj1 ++;
                System.out.println("Gana: "+j1.getNombre());
            } 
            else 
            {
                if (x == j2)
                {
                    cj2++;
                    System.out.println("Gana: "+j2.getNombre());
                }
                else
                {
                    System.out.println("Empate ");
                }
            }
        }
        if (cj1==2) 
        {
            System.out.println("GANADOR!!!!!"+j1.getNombre());
        }
        else
        {
           System.out.println("GANADOR!!!!!"+j2.getNombre());
        }
    }
    
    

    private JugadorAbstracto quienGana()
    {
        if (j1.getLaMano().getGesto() == j2.getLaMano().getGesto())
        {
            return null;
        }
        else
        {
            if(j1.getLaMano().getGesto() == Mano.PIEDRA && 
                    j2.getLaMano().getGesto() == Mano.TIJERA)
            {
                return j1;
            }
            else
            {
                if(j1.getLaMano().getGesto() == Mano.PAPEL 
                        && j2.getLaMano().getGesto() == Mano.PIEDRA)
                {
                    return j1;
                }
                else
                {
                    if (j1.getLaMano().getGesto() == Mano.TIJERA 
                            && j2.getLaMano().getGesto() == Mano.PAPEL)
                    {
                      return j1;  
                    }
                }
            }
        }
        return j2;
    }
}
