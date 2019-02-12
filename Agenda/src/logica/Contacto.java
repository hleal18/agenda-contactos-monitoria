/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author usuario
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    
    public Contacto() {
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.direccion = "";
    }

    public Contacto(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        StringBuilder informacionContacto = new StringBuilder();
        
        informacionContacto.append("Nombre: ").append(this.nombre).append('\n');
        informacionContacto.append("Apellido: ").append(this.apellido).append('\n');
        informacionContacto.append("Telefono: ").append(this.telefono).append('\n');
        informacionContacto.append("Direccion: ").append(this.direccion).append('\n');
        
        return informacionContacto.toString();
    }
}
