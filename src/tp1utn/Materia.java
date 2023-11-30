package tp1utn;

import java.util.ArrayList;
import java.util.List;


public class Materia {

    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia correlativa) {
        if (!correlativas.contains(correlativa)) {
            correlativas.add(correlativa);
        } else {
            System.out.println("La materia " + correlativa.getNombre() + " ya está como correlativa.");
        }
    }
    

}
    
