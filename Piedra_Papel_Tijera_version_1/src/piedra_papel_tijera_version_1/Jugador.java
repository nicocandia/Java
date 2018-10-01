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
public class Jugador {
    
    private String nombre;
    private Mano laMano;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Mano getLaMano()
    {
        return laMano;
    }

    public void setLaMano(Mano laMano) 
    {
        this.laMano = laMano;
    }

    public Jugador(String nombre) 
    {
        this.nombre = nombre;
        laMano = new Mano();
    }

    public String toString() {
        return nombre + " " + laMano.toString();
    }

    void hacerGesto() {
        laMano=new Mano();
    }

}
