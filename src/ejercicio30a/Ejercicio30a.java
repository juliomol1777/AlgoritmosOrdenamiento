/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30a;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio30a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        //System.out.print("Ingrese el numero de elementos del vector: ");
        //int n=entrada.nextInt();
        //int [] vector=crearVector(n);
        int [] vector={6,5,2,7,1,5};
        mostrarVector(vector); 
        ordenamientoBurbuja(vector); 
        mostrarVector(vector); 
    }
    
    
    /*public static int [] crearVector(int n){
        Scanner entrada=new Scanner(System.in);
        int [] vector=new int[n];
        for (int i=0; i<vector.length; i++){
            System.out.print("Ingrese el elemento: ");
            vector[i]=entrada.nextInt();
            }
        return vector;
        }  */
    
    public static void ordenamientoBurbuja( int [] vector){
        int piv;
        for (int i=0; i<vector.length-1; i++){
            for (int j=0; j<vector.length-i-1; j++){
                if(vector[j]>vector[j+1]){
                    piv=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=piv;
                    mostrarVector(vector);
                    System.out.print(" ");
                }
                
            }
            System.out.println(" ");
        }
    }
    
    public static void mostrarVector(int [] vector){
        for (int elemento:vector){
            System.out.print(elemento + " ");
        }
        System.out.print(" ");
    }
}
