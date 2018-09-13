/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavrascruzadas;

/**
 *
 * @author ice
 */
public class Jogador{
    private String nome;
    private String palpite;
    private int pontuacao;
    
    public Jogador(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
