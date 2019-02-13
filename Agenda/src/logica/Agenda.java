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
public class Agenda {
    private Contacto[] contactos;
    private int ultimoIndice;
    private int capacidad;
    
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new Contacto[capacidad];
        this.ultimoIndice = -1;
    }
    
    public boolean agregar(Contacto nuevo) {
        String idNuevo = nuevo.getId();
        // Usar excepciones.
        if (buscar(idNuevo) != null) {
            return false;
        }
        // Usar excepciones.
        if (ultimoIndice + 1 == capacidad) { return false; }
        
        contactos[++ultimoIndice] = nuevo;
        
        return true;
    }
    
    public boolean modificar(Contacto modificaciones) {
        Contacto contActualizar = buscar(modificaciones.getId());
        // Usar excepciones.
        if (contActualizar == null) return false;
        
        if (!"".equals(modificaciones.getNombre())) 
            contActualizar.setNombre(modificaciones.getNombre());
        if (!"".equals(modificaciones.getApellido())) 
            contActualizar.setApellido(modificaciones.getApellido());
        if (!"".equals(modificaciones.getDireccion())) 
            contActualizar.setDireccion(modificaciones.getDireccion());
        if (!"".equals(modificaciones.getTelefono())) 
            contActualizar.setTelefono(modificaciones.getTelefono());
        
        return true;
    }
    
    public boolean eliminar(String id) {
        Contacto contEliminar = buscar(id);
        int indice = 0;
        
        // Usar excepciones.
        if (contEliminar == null) return false;
        
        // Se encuentra la posición del contacto a eliminar.
        for (int i = 0; i < ultimoIndice + 1; i++) {
            if (contEliminar == contactos[i]) {
                indice = i;
                break;
            }
        }
        
        // Util para cuando ultimoIndice = 0
        contactos[indice] = null;
        
        // Reorganizar la porción restante del arreglo.
        for(int i = indice; i < ultimoIndice; i++) {
            contactos[i] = contactos[i + 1];
        }
        
        ultimoIndice--;
        
        return true;
    }
    
    public Contacto buscar(String id) {
        for(Contacto contActual : this.contactos) {
            if (contActual == null) return null;
            else if (contActual.getId().equals(id)) return contActual;            
        }
        
        return null;
    }
}
