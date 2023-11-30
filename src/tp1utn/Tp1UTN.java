package tp1utn;

import java.util.ArrayList;
import java.util.Arrays;
import tp1utn.Inscripcion;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static tp1utn.Inscripcion.verificarInscripcion;

public class Tp1UTN {

    public static void main(String[] args) {
//
//        Alumno alu = new Alumno("Mark", "Sloan");
//        Alumno alu1 = new Alumno("Meredith", "Grey");
//        Alumno alu2 = new Alumno("Cristina", "Yang");
//        Alumno alu3 = new Alumno("Owen", "Hunt");
//        Alumno alu4 = new Alumno("Amelia", "Sheperd");
//        Alumno alu5 = new Alumno("Richard", "Webber");
//
//        List<Alumno> alumnos = Arrays.asList(alu, alu1, alu2, alu3, alu4, alu5);
//
////        System.out.println(alumnos);
//
//        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
//        Materia paradigmas = new Materia("Paradigmas de Programación");
//        Materia diseñoSistemas = new Materia("Diseño de Sistemas");
//
//        // Establecer correlatividades
//        algoritmos.agregarCorrelativa(paradigmas);
//        paradigmas.agregarCorrelativa(diseñoSistemas);
//
//        // Crear inscripciones para el alumno
//        Inscripcion inscripcionAlgoritmos = new Inscripcion(alu1, algoritmos, true);
//        Inscripcion inscripcionParadigmas = new Inscripcion(alu1, paradigmas, false); // Si pongo false acá igual me la toma aprobada en el if
//        Inscripcion inscripcionDiseñoSistemas = new Inscripcion(alu1, diseñoSistemas, false);// Si pongo false acá recién ahí no me daja inscribir
//
//        
//// Agregar inscripciones al alumno utilizando la lista de inscripciones del alumno
//        alu1.getInscripciones().add(inscripcionAlgoritmos);
//        alu1.getInscripciones().add(inscripcionParadigmas);
//        alu1.getInscripciones().add(inscripcionDiseñoSistemas);
//
//        // Verificar si el alumno puede inscribirse a Diseño de Sistemas
//        
//        if (inscripcionParadigmas.aprobada()) {
//            System.out.println("El alumno "+alu1.getNombre() +", "+alu1.getApellido() +" puede inscribirse a Diseño de Sistemas.");
//        } else {
//            System.out.println("EL alumno no cumple con las correlativas necesarias para Diseño de Sistemas.");
//        }
//    }



        
    Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
    Materia paradigmas = new Materia("Paradigmas de Programación");
    Materia diseñoSistemas = new Materia("Diseño de Sistemas");
    Materia redesComputadoras = new Materia("Redes de Computadoras");
    Materia sistemasOperativos = new Materia("Sistemas Operativos");

    algoritmos.agregarCorrelativa(paradigmas);
    paradigmas.agregarCorrelativa(diseñoSistemas);
    redesComputadoras.agregarCorrelativa(sistemasOperativos); // Redes de Computadoras necesita Sistemas Operativos como correlativa

    Alumno alumno1 = new Alumno("Mark", "Sloan");
    Alumno alumno2 = new Alumno("Meredith", "Grey");
    Alumno alumno3 = new Alumno("Owen", "Hunt");

    alumno1.inscripcion(algoritmos);
    alumno2.inscripcion(paradigmas);
    alumno3.inscripcion(redesComputadoras); // Owen intenta inscribirse en Redes de Computadoras sin haber aprobado Sistemas Operativos

    verificarInscripcion(alumno1, diseñoSistemas);
    verificarInscripcion(alumno2, diseñoSistemas);
    verificarInscripcion(alumno3, redesComputadoras);
}


}

    

   
      

        
              
   

