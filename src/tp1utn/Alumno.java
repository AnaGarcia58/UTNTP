
package tp1utn;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Inscripcion> inscripciones;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.inscripciones = new ArrayList<>();
    }

    private Alumno() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
    
    public boolean cumpleCorrelativas(Materia materia) {
    for (Materia correlativa : materia.getCorrelativas()) {
        boolean encontrada = false;
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getMateria().equals(correlativa) && inscripcion.isAprobada()) {
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            return false;
        }
    }
    return true;
}



    public void inscripcion(Materia materia) {
        
        for (Inscripcion inscripcionExistente : inscripciones) {
            if (inscripcionExistente.getMateria().equals(materia)) {
                System.out.println("El alumno ya está inscrito en la materia " + materia.getNombre());
                return; 
            }
        }

        Inscripcion inscripcion = new Inscripcion(this, materia);
        inscripciones.add(inscripcion);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
    
    
}
