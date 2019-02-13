/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import logica.Agenda;
import logica.Contacto;
/**
 *
 * @author usuario
 */
public class VentanaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda cuadernito = new Agenda(3);
        System.out.println("Inicio");
        Contacto padre = new Contacto("123", "Humberto", "Leal", "3012511943", "Las Gaviotas Mz34 Lte15");
        Contacto hijo = new Contacto("122", "Gregorio", "Leal", "3103265151", "Las Gaviotas Mz 34 Lte15");
        Contacto madrecita = new Contacto("124", "Mariana", "Gutierrez", "303123456", "bocagrande");
        
        if (cuadernito.agregar(padre))
            System.out.println("Se agregó el usuario: " + padre.toString());
        else
            System.out.println("Hubo un error agregando a: " + padre.toString());
        
        if (cuadernito.agregar(hijo))
            System.out.println("Se agregó el usuario: " + hijo.toString());
        else
            System.out.println("Hubo un error agregando a: " + hijo.toString());
        
        if (cuadernito.agregar(madrecita))
            System.out.println("Se agregó el usuario: " + madrecita.toString());
        else
            System.out.println("Hubo un error agregando a: " + madrecita.toString());
        
        if (!cuadernito.agregar(hijo))
            System.out.println("No se dejó agregar, bien!");
        else
            System.out.println("Se dejó agregar, Mal!");
        
        System.out.println("Buscando a mi hijo:");
        if (cuadernito.buscar(hijo.getId()) != null)
            System.out.println("Hijo encontrado");
        
        if (cuadernito.modificar(new Contacto("123", "", "", "", "cuchicuchi")))
            System.out.println("Padre modificado: " + padre.toString());
        
        if (cuadernito.eliminar(padre.getId()))
            System.out.println("padre eliminado");
        
        System.out.println("Buscando al hijo.");
        if (cuadernito.buscar(hijo.getId()) != null)
            System.out.println("Hijo encontrado");
    }
    
}
