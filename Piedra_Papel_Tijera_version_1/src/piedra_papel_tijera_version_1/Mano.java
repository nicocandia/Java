/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijera_version_1;
import java.util.Random;
/**
 *
 * @author Candia family
 */
public class Mano {
    
 private  int gesto;
 public static final int PIEDRA=1;
 private static final String NOMBRE_PIEDRA ="PIEDRA";
 public static final int PAPEL=2;
 private static final String NOMBRE_PAPEL ="PAPEL";
 public static final int TIJERA=3;
 private static final String NOMBRE_TIJERA ="TIJERA";
 static Random ran = new Random();
 
    public Mano() 
    {
      gesto = ran.nextInt(3)+1;  
    }

    public String toString() 
    {
        return elNombreDelGesto();
    }

    private String elNombreDelGesto() 
    {
        switch (gesto) 
        {
            case PIEDRA:
                return NOMBRE_PIEDRA;
            case PAPEL:
                return NOMBRE_PAPEL;
        }
        return NOMBRE_TIJERA;
   
    }

    public int getGesto() {
        return gesto;
    }

    public void setGesto(int gesto) {
        this.gesto = gesto;
    }

}
