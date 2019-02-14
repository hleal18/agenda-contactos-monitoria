/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author usuario
 */
public class DuplicateContactException extends RuntimeException {
    public DuplicateContactException() {
        super("Contacto ya existe");
    }
    
    public DuplicateContactException(String message) {
        super(message);
    }
}
