package tp1utn;

import java.util.List;




public class Inscripcion {
    
    
    private Alumno alumno;
    private Materia materia;
    private boolean aprobada;

    public Inscripcion(Alumno alumno, Materia materia, boolean aprobada) {
        this.alumno = alumno;
        this.materia = materia;
        this.aprobada = aprobada;
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }
    
    
       
    
    public Materia getMateria() {
        return materia;
    }

    public boolean aprobada() {
        for (Materia correlativa : this.materia.getCorrelativas()) {
            boolean correlativaAprobada = false;
            for (Inscripcion inscripcion : this.alumno.getInscripciones()) {
                if (inscripcion.getMateria().equals(correlativa) && inscripcion.isAprobada()) {
                    correlativaAprobada = true;
                    break;
                }
            }
            if (!correlativaAprobada) {
                return false;
            }
        }
        return true;
    }

   

public static void verificarInscripcion(Alumno alumno, Materia materia) {
    if (alumno.cumpleCorrelativas(materia)) {
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " puede inscribirse en " + materia.getNombre());
        alumno.inscripcion(materia);
    } else {
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " no cumple con las correlativas para " + materia.getNombre());
    }
}

 
    
    

}