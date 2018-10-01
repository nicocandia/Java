/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera_version_1;

/**
 *
 * @author Candia family
 */
public class Juego {
    
    private Jugador j1,j2;
    
    public Juego(String nombre1,String nombre2)
    {
    j1 = new Jugador (nombre1);
    j2 = new Jugador (nombre2);
    }
    
    public void jugar() 
    {
        int cj1 = 0;
        int cj2 = 0;
        Jugador  x;

        while (cj1 < 2 && cj2 < 2) 
        {
            j1.hacerGesto();System.out.println(j1);
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
    
    

    private Jugador quienGana()
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
