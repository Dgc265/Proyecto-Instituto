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
public class Alumno extends Persona {

    private Set<Asignatura> asignatura = new HashSet<>();
    private String grupo="";

    public Alumno(String nombre, String direccion, int fechaNacimiento,String dni) {
        super(nombre, direccion, fechaNacimiento,dni);
    }

   

    
    
        public void setAsignatura(Set<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }

    public boolean setGrupo(String grupo) {
        boolean comprobar=false;
        if(grupo!=null || grupo.length()>0){
        this.grupo = grupo;
        comprobar=true;
        }
        return comprobar;
    }

    public Set<Asignatura> getAsignatura() {
        return asignatura;
    }

    public String getGrupo() {
        return grupo;
    }

    public double horas() {
        double horaTotal = 0;
        for (Asignatura asignatura1 : asignatura) {
            horaTotal += asignatura1.getHora();

        }
        return horaTotal;
    }

    public void matricular(Asignatura asig) {
        if (comprobarHoras(asig)) {
            asignatura.add(asig);
        }
    }
    public int totalAsignaturas(){
       int total=0;
        for (Asignatura asignatura1 : asignatura) {
          total+=1;  
            
        }return total;
    }

    public boolean comprobarHoras(Asignatura asig) {
        boolean comprobar = false;

        if (horas()+asig.getHora() <= 30) {
            comprobar = true;
        }
        return comprobar;
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.grupo + " Numero de horas matriculadas: " + horas();
    }

}
