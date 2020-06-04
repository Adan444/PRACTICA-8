/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adan Sanchez
 */
public class Practica8 {
    
    public Practica8(){
        Principal();
    
    }
    
    public void Principal(){
        List<Datos> lista = new ArrayList<>();
        Datos datos = new Datos();
        
        datos.setNombre("Adan");
        datos.setEdad(20);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre("Fernando");
        datos.setEdad(25);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre("javier");
        datos.setEdad(30);
        
        lista.add(datos);
        
        lista.forEach(element -> {
            System.out.println("Nombre  " + element.getNombre());
            System.out.println("Edad  " + element.getEdad());
        });
        
        System.out.println("\n\nOtra forma de recorrer los datos");
        
        for (Datos contenido : lista){
            System.out.println("Nombre " + contenido.getNombre());
            System.out.println("Edad " + contenido.getEdad());
        }
        
        datos = new Datos();
        
        datos.setNombre("Gustabo");
        datos.setEdad(18);
        
        lista.add(datos);
        
        System.out.println("\n\n Tercera forma de visualizar el contenido");
        lista.stream().forEach((valores) -> {
            System.out.println("Nombre " + valores.getNombre());
            System.out.println("Edad " + valores.getEdad());
            
            if(valores.getNombre().equals("Fernando"))
                System.out.println("Se encontro el dato...");
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Practica8();
        
        // TODO code application logic here
    }
}
