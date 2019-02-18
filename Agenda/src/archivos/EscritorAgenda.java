/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import logica.Agenda;

/**
 *
 * @author usuario
 */
public class EscritorAgenda {
    private ObjectOutputStream escritorDeObjetos;
    private String nombreArchivo;
    
    public EscritorAgenda() {
        this.nombreArchivo = "datos.bin";
    }
    
    public void guardar(Agenda agendita) {
        try {
            // Se conecta el escritor de bytes con el escritor de objetos.
            FileOutputStream escritorDeBytes = new FileOutputStream(nombreArchivo);
            escritorDeObjetos = new ObjectOutputStream(escritorDeBytes);
            
            // Se guarda el objeto de tipo Agenda.
            escritorDeObjetos.writeObject(agendita);
            
            // Se cierra la conexión.
            if (escritorDeObjetos != null) {
                escritorDeObjetos.close();
            }
        }catch(IOException e) {
            System.err.println("Hubo un error guardando información en el archivo: " + e.getMessage());
        }
    }
}
