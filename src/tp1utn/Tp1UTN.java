package tp1utn;


import static tp1utn.Inscripcion.verificarInscripcion;

public class Tp1UTN {

    public static void main(String[] args) {


        
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

    

   
      

        
              
   

