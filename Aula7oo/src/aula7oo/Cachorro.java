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
public class Cachorro {
    private String cor,nome,raca,sexo;
    private int idade;
    private static int contador = 0;
    
    public Cachorro(){
        contador++;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("O nome do cachorro é: "+getNome()+"\nA raça do cachorro é: "+getRaca()+"\nA cor do cachorro é: "+getCor()+"O sexo do cachorro é: "+getSexo()+"\nA idade do cachorro é: "+getIdade());
    }
    
    public static int getContador(){
        return contador;
    }
    
    public Cachorro remove(){
        contador--;
        return null;
    }
    
    
}
