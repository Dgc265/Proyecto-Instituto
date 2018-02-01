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
public class Profesor extends Persona {
   private String departamento="";
   private int añoIncorporacionCentro=0;
   private Set<Asignatura> asignaturaClase = new HashSet<>();

    public Profesor(String nombre, String direccion, int fechaNacimiento,String dni) {
        super(nombre, direccion, fechaNacimiento,dni);
    }
     public double horas() {
        double horaTotal = 0;
        for (Asignatura asignatura1 : asignaturaClase) {
            horaTotal += asignatura1.getHora();

        }
        return horaTotal;
    }
        public void Impartir(Asignatura asig) {
        if (comprobarHoras(asig)) {
            asignaturaClase.add(asig);
        }
    }
      public boolean comprobarHoras(Asignatura asig) {
        boolean comprobar = false;

        if (horas()+asig.getHora() <= 15) {
            comprobar = true;
        }
        return comprobar;
    }
        public String nombreAsignaturas(){
       String total="";
        for (Asignatura asignatura1 : asignaturaClase) {
          total+=asignatura1.getNombre()+" ";
            
        }return total;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setAñoIncorporacionCentro(int añoIncorporacionCentro) {
        this.añoIncorporacionCentro = añoIncorporacionCentro;
    }

    public void setAsignaturaClase(Set<Asignatura> asignaturaClase) {
        this.asignaturaClase = asignaturaClase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAñoIncorporacionCentro() {
        return añoIncorporacionCentro;
    }

    public Set<Asignatura> getAsignaturaClase() {
        return asignaturaClase;
    }
    @Override
    public String toString(){
    return super.toString()+" "+this.departamento+" Numero de horas impartidas: "+horas();
    }
    
}
