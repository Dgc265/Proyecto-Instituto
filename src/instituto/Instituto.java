/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 53253095e
 */
public class Instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura matematicas = new Asignatura(5, "1", "Matematicas");
        Asignatura ingles = new Asignatura(3, "2", "Ingles");
        Asignatura biologia = new Asignatura(10, "3", "Biología");
        Alumno alumno = new Alumno("juan perez", "calle perez", 1992,"53253098R");
        Alumno alumno2 = new Alumno("Alex perez", "calle pereza", 1994,"53253098V");
        Profesor profesor = new Profesor("Gonzalo mendez", "calle pardo", 1965,"53253098T");
        Profesor profesor2 = new Profesor("Rodrigo diaz de vivar", "ciudad de valencia", 1977,"Señor de valencia numero 1");

        alumno.matricular(ingles);
        alumno.matricular(biologia);
        alumno2.matricular(matematicas);
        alumno2.matricular(biologia);
        profesor.Impartir(ingles);
        profesor.Impartir(biologia);
        profesor2.Impartir(biologia);
        profesor2.Impartir(matematicas);
        profesor2.Impartir(ingles);
        alumno.setGrupo("DAW");
        alumno2.setGrupo("DAW");
        profesor.setDepartamento("Informatica");
        profesor2.setDepartamento("Reconquista");

//        System.out.println("El alumno 1: " + alumno);
//        System.out.println("El alumno 2: " + alumno2);
//        System.out.println("El Profesor 1: " + profesor);
//        System.out.println("El profesor 2 :" + profesor2);
        Set<Persona> lista = new HashSet<>();
        lista.add(profesor);
        lista.add(profesor2);
        lista.add(alumno);
        lista.add(alumno2);

        for (Persona persona : lista) {
            String nombre;
            nombre = persona.getClass().getSimpleName();
            System.out.print(nombre + ": ");
            if (persona instanceof Alumno) {
                alumno = (Alumno) persona;
                System.out.println(alumno.getNombre() + " esta matriculado en " + alumno.getGrupo() + " de " + alumno.totalAsignaturas() + " asignaturas (total horas " + alumno.horas() + "h)");
            }
            if (persona instanceof Profesor) {
                profesor = (Profesor) persona;
                System.out.println(profesor.getNombre() + " Pertenece al departeamento " + profesor.getDepartamento() + " e imparte las asignaturas: " + profesor.nombreAsignaturas() + " (total horas " + profesor.horas() + "h)");
            }

        }

    }

}
