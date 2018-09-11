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
public class Fibonacci {
    
    /**
     * Esta función devuelve el fibonacci de un número
     * El calculo lo hace de forma recursiva
     * @param n es el número al que se calculará el fibonacci
     * @return retorna el fibonacci de n
     */
    public int fibonacci(int n){
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n-1)+fibonacci (n-2);
    }
}
