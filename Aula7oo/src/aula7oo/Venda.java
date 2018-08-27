/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7oo;
import java.util.*;
/**
 *
 * @author ice
 */
public class Venda {
    private float valor;
    private static int contador;
    public Venda(){
       contador++;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public static int getContador(){
        return contador;
    }
    
    public void vender(Cachorro x){
        x=x.remove();
    }
}
