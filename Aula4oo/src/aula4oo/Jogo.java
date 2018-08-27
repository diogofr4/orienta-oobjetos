/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4oo;
import java.util.*;

/**
 *
 * @author ice
 */
public class Jogo {
    
    private int tabuleiro[][] = new int[11][11];
    private Jogador jogadores[]= new Jogador[2];

    public Jogo() {
        this.setBarco();
        int i=0;
        while(i < 2){
            this.jogadores[i] = new Jogador();
            i++;
        } 
    }
    
    public void resetaTabuleiro() {
        int i=1,j=1;
        while(i<=10){
            while(j<=10){
                this.tabuleiro[i][j]=0;
                j++;
            }
            i++;
        }
    }

    public int getNumero() {
        return 0;
    }

    public void setBarco() {
        int linhainicial, colunainicial, proxlinha, proxcoluna, i=0;
        Random rand = new Random();
        linhainicial = rand.nextInt(10) + 1;
        System.out.println("linha inicial "+linhainicial);
        colunainicial = rand.nextInt(10) + 1;
        System.out.println("coluna inicial "+colunainicial);
        this.tabuleiro[linhainicial][colunainicial]=1;
        proxcoluna = rand.nextInt(colunainicial+1) + colunainicial-1;
        proxlinha=linhainicial;
        while(i<=3){ 
            if(proxcoluna==colunainicial){
                proxlinha = rand.nextInt(proxlinha+1-proxlinha) + proxlinha-1;
                System.out.println("prox linha "+proxlinha);
                if(this.tabuleiro[proxlinha][proxcoluna]==0){
                    this.tabuleiro[proxlinha][proxcoluna]=1;
                    i++;
                }
            }
            else{
                proxcoluna = rand.nextInt(proxcoluna+1-proxcoluna) + proxcoluna-1;
                if(this.tabuleiro[proxlinha][proxcoluna]==0){
                    this.tabuleiro[proxlinha][proxcoluna]=1;
                    System.out.println("prox coluna"+proxcoluna);
                    i++;
                }
            }
        }
        
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
        int i=1,j=1;
        while(j<10){
            while(i<10){
                System.out.println("["+this.tabuleiro[i][j]+"]");
                i++;
            }
            i=1;
            j++;
        }
    }
    
}
