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
    private int ultimoElemento;
    private int capacidad;
    
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new Contacto[capacidad];
        this.ultimoElemento = -1;
    }
    
    public void agregar(Contacto nuevo) throws NullPointerException, IndexOutOfBoundsException {
        String idNuevo = nuevo.getId();
        // Usar excepciones.
        if (buscar(idNuevo) != null) {
            throw new NullPointerException("Usuario ya existe");
        }
        // Usar excepciones.
        if (ultimoElemento + 1 == capacidad) { throw new IndexOutOfBoundsException("Capacidad máxima de contactos"); }
        
        contactos[++ultimoElemento] = nuevo;
    }
    
    public void modificar(Contacto modificaciones) throws NullPointerException {
        Contacto contActualizar = buscar(modificaciones.getId());
        // Usar excepciones.
        if (contActualizar == null) throw new NullPointerException("Usuario a modificar no existe.");
        
        if (!"".equals(modificaciones.getNombre())) 
            contActualizar.setNombre(modificaciones.getNombre());
        if (!"".equals(modificaciones.getApellido())) 
            contActualizar.setApellido(modificaciones.getApellido());
        if (!"".equals(modificaciones.getDireccion())) 
            contActualizar.setDireccion(modificaciones.getDireccion());
        if (!"".equals(modificaciones.getTelefono())) 
            contActualizar.setTelefono(modificaciones.getTelefono());
    }
    
    public void eliminar(String id) throws NullPointerException {
        Contacto contEliminar = buscar(id);
        int indice = 0;
        
        // Usar excepciones.
        if (contEliminar == null) throw new NullPointerException("Usuario a eliminar no existe.");
        
        // Se encuentra la posición del contacto a eliminar.
        for (int i = 0; i < ultimoElemento + 1; i++) {
            if (contEliminar == contactos[i]) {
                indice = i;
                break;
            }
        }
        
        // Util para cuando ultimoElemento = 0
        contactos[indice] = null;
        
        // Reorganizar la porción restante del arreglo.
        for(int i = indice; i < ultimoElemento; i++) {
            contactos[i] = contactos[i + 1];
        }
        
        ultimoElemento--;
    }
    
    public Contacto buscar(String id) {
        for(Contacto contActual : this.contactos) {
            if (contActual == null) return null;
            else if (contActual.getId().equals(id)) return contActual;            
        }
        
        return null;
    }
}
