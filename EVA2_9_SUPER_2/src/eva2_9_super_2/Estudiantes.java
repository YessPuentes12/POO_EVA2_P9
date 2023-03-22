/*

 */
package eva2_9_super_2;

//Clase derivada extends clase base
//subclase extends superclase

public class Estudiantes extends Persona{
 private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
//------------------------------------------------------------------------------   

    public Estudiantes(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    public Estudiantes(String noControl) {
        this.noControl = noControl;
    }
    
    
    
    
}
