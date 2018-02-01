/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

/**
 *
 * @author 53253095e
 */
public class Asignatura {

    
    private String codigo="";
    private String nombre="";
    private double hora;
    
    
    
    public Asignatura(double hora,String codigo,String nombre) {
        this.hora = hora;
        this.codigo=codigo;
        this.nombre=nombre;
    }
    @Override
public String toString(){
return this.codigo.toUpperCase();
}    

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHora() {
        return hora;
    }
    
}
