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
public class Piedra_Papel_Tijer_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el nombre del jugador");
        
        Scanner jugadorNombre = new Scanner (System.in);
        
        String b ; 
        b = jugadorNombre.nextLine();
        
        new Juego(b,"Maquina").jugar();
    }
    
}
