/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca;
import java.util.*;
/**
 *
 * @author ice
 */
public class AulaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.setNome("cachorro");
        cachorro.setIdade("cachorro");
        cachorro.setRaca("cachorro");
        gato.setNome("gato");
        gato.setIdade("gato");
        gato.setRaca("gato");
        cachorro.emitirSom();
        gato.emitirSom();
        cachorro.imprime("cachorro");
        gato.imprime("gato");
        
    }
    
}
