/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavrascruzadas;
import java.util.*;
/**
 *
 * @author ice
 */
public class Jogador{
    private String nome;
    private String palpite;
    private int pontuacao;
    
    public Jogador(){
        this.setNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        Scanner s= new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        this.nome = s.next();
    }

    public String getPalpite() {
        return palpite;
    }

    public void setPalpite(String palpite) {
        this.palpite = palpite;
    }
    
    public void setPontuacao(){
        pontuacao++;
    }
    
    public int getPontuacao(){
        return this.pontuacao;
    }
       
    
    
}
