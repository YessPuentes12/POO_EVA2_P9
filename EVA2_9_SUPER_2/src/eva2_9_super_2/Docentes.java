/*

 */
package eva2_9_super_2;


public class Docentes extends Persona{
 private String plaza;

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
  
//------------------------------------------------------------------------------   

    public Docentes(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public Docentes(String plaza) {
        this.plaza = plaza;
    }
    
    

    
    
    
    
}
