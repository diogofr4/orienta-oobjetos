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
public class Jogo {
    
    private int numero;
    private Jogador jogadores[]= new Jogador[3];

    public Jogo() {
        this.setNumero();
        int i=0;
        while(i < 3){
            this.jogadores[i] = new Jogador();
            i++;
        } 
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        Random rand = new Random();
        this.numero = rand.nextInt(9);
    }
    
    public void iniciajogo(){
        int i = 0;
        int aux = 0;
        Scanner S = new Scanner (System.in);
        while(aux == 0){
            System.out.println("Jogador "+jogadores[i].getNome()+", digite seu palpite!");
            jogadores[i].setPalpite(S.nextInt());
            
            if(jogadores[i].getPalpite() == this.getNumero()) {
                aux = 1;
            }
            
            else {
                
                if(i==2) {
                    i=0;
                }
                
                else {
                i++;
                }
            }
        }
        
        if(jogadores[i-1].getPalpite() != this.getNumero()){
            System.out.println("Parabéns, o jogador "+jogadores[i].getNome()+" é o vencedor!");
            this.imprime();
        }
        
    }
    
    public void imprime(){
        System.out.println("O número correto é: "+this.getNumero());
    }
    
}
