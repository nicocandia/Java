/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra_papel_tijer_version2;

/**
 *
 * @author Candia family
 */
public class JugadorHumano extends JugadorAbstracto {
    
    private String nombre;
    private Mano laMano;

    public JugadorHumano(String nombre) {
        this.nombre = nombre;
        
    }

    
    
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

    @Override
    public String toString() {
        return "JugadorHumano{" + "nombre=" + nombre + laMano.toString(); 
    }

    
    

    //public String toString() {
      //  return nombre + " " + laMano.toString();


    //void hacerGesto() {
     //   laMano=new Mano();
  //  }

void hacerGesto(int eleccion) {
    
 
        this.laMano=new Mano(eleccion);
        
     
        
    }
        
}
