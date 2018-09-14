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
public class Animal {
    private int idade;
    private String raca;
    private String nome;
    
    public Animal(){
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(String tipo) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a idade do "+tipo+": ");
        this.idade = s.nextInt();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String tipo) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a raça do "+tipo+": ");
        this.raca = s.next();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String tipo) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do "+tipo+": ");
        this.nome = s.next();
    }
    
    public void comer(){
        System.out.println("Estou comendo");
    }
    
    public void dormir(){
        System.out.println("Estou dormindo");
    }
    
    public void emitirSom(){
        System.out.println("Estou emitindo som");
    }
    
    public void imprime(String tipo){
        System.out.println("O nome do "+tipo+" é:"+this.getNome());
        System.out.println("A idade do "+tipo+" é:"+this.getIdade());
        System.out.println("A raça do "+tipo+" é:"+this.getRaca());
    }
    
}
