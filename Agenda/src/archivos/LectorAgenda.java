/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.Agenda;

/**
 *
 * @author usuario
 */
public class LectorAgenda {
    private ObjectInputStream lectorDeObjetos;
    private String nombreArchivo;
    
    public LectorAgenda() {
        this.nombreArchivo = "datos.bin";
    }
    
    public Agenda cargar() {
        Agenda agendita = null;
        try {
            FileInputStream lectorDeBytes = new FileInputStream(this.nombreArchivo);
            lectorDeObjetos = new ObjectInputStream(lectorDeBytes);
            agendita = (Agenda)lectorDeObjetos.readObject();
            System.out.println("Tiene una agenda");
            agendita = (Agenda)lectorDeObjetos.readObject();
            System.out.println("Tiene dos agendas");
            
            
            lectorDeObjetos.close();
        }
        catch(ClassNotFoundException e) {
            System.err.println("Hubo un error con la clase a leer: " + e.getMessage());
        }
        catch(IOException e) {
            System.err.println("Hubo un error leyendo el archiv: " + e.getMessage());
        }
        finally {
            return agendita;
        }
    }
}
