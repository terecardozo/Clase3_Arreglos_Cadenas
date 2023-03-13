/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3arreglos;

/**
 *
 * @author Teresa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[10];
        char letras [] = {'a', 'b', 'c'}; 
        
        numeros[0] = 5;
        numeros[1]= 8;
        numeros[2] = 9;
        numeros[6] = 4;
        //numeros[12] = 9;
        int resultado = numeros[1]/2;
        
//        System.out.println("El resultado es: " + resultado);
//        
//        for( int indice = 0; indice < numeros.length; indice++){
//            if(indice % 2 != 0)
//                System.out.println("numeros["+indice+"] = "+ numeros[indice]);
//            
//        }
        int contador = 0;
        for(char letra : letras){
            if(contador % 2 ==0)
                System.out.println(letra);
                contador++;
        }
        int indice = 0;
        for(int n : numeros){
            if(n % 2 != 0){
                System.out.println("Indice"+ indice );
                System.out.println( "Contenido"+ n);
            }    
            
                indice++;
        }
        
    }
    
}
