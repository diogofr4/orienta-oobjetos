/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3oo;
import java.util.*;

/**
 *
 * @author ice
 */
public class Jogador {
    private String nome;
    private int palpite;

    
    public Jogador() {
        Scanner S = new Scanner (System.in); 
        System.out.println("Digite o nome do jogador: ");
        this.nome = S.next();
        this.palpite = -1;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    
}
