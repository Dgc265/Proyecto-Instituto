/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

import java.time.LocalDateTime;

/**
 *
 * @author 53253095e
 */
public class Persona {
   protected String nombre;
   protected String dni="";
   protected String direccion;
   protected int fechaNacimiento;

    public Persona(String nombre, String direccion, int fechaNacimiento,String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.dni=dni;
    }

  
   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
   
   @Override
   public String toString(){
   return this.nombre+" Direccion: "+this.direccion+" Año de nacimiento: "+this.fechaNacimiento;
   }
   
    
    
}
