/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3arreglos;

/**
 *
 * @author Teresa
 */
public class Cadenas {
    public static void main(String[] args) {
        String nombre = "Maria Teresa";
        String apellido = "\\Cardozo";
        
        String resultado1 = nombre + " "+ apellido;
        System.out.println("Resultado1: "+ resultado1);
        
        String resultado2 = resultado1.toLowerCase();
        System.out.println("Resultado 2: " +resultado2);
        
        String resultado3 = resultado1.toUpperCase();
        System.out.println("Resultado 3: " + resultado3);
        
        System.out.println("Cantidad de caracteres: " +  apellido.length());
        System.out.println(apellido.toUpperCase().charAt(3));
        
        System.out.println("Fragmento: "+apellido.substring(3, 5));
        
        System.out.println(resultado1.equals(resultado2));
        System.out.println(resultado3.contains("Te"));
        
        System.out.println(resultado1.startsWith("Ma"));
        System.out.println(resultado3.endsWith("CARDOOZO"));
        
        System.out.println(resultado3.replace("MARIA", "MARTA").replace("CARDOZO", "PEREZ"));
        
        String resultadoCadena [] = resultado3.split(" ");
        
        for(String cadena : resultadoCadena ){
            System.out.println(cadena.trim().toLowerCase());
            System.out.println(cadena.trim().length());
        }
        
        
        
    }
    
}
