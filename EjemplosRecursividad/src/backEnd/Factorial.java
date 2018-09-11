/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

/**
 *
 * @author tavoberry
 */
public class Factorial {
    
    private int numero;
    
    /**
     * Constructor Normal de la Clase Factorial
     */
    public Factorial(){
        numero = 0;
    }
    
    /**
     * Constructor que recibe el valor del cual se calculará el factorial
     * @param numero es el valor a calcularle el factorial
     */
    public Factorial(int numero){
        this.numero = numero;
    }
    
   
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    /**
     * Esta función realiza el calculo del factorial de un número 
     * de manera recursiva
     * @param n es el número al cual se le calculará el factorial
     * @return retorna el valor correspondiente al factorial de n
     */
    public long factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
   
}
