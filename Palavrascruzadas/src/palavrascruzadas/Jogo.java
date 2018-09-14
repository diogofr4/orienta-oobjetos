/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavrascruzadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author ice
 */
public class Jogo {
    private String[] tabelagabarito = new String[10]; 
    private String tabeladicas[] = new String [10];
    private String[] tabelaresposta = new String[10];
    Jogador jogador = new Jogador();
    
    public Jogo() throws FileNotFoundException{
        this.setJogador();
        this.setTabelas();
    }
//Cria o jogador//   
    private void setJogador(){
        Scanner s= new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        jogador.setNome(s.next());
    }
 //Inicializa as tabelas com os valores iniciais. Tabelas de gabarito e dicas através do txt.//
 //Resposta conta quantas letras em cada palavra e coloca na tabela resposta com um "_"// 
    private void setTabelas() throws FileNotFoundException{
        int i;
        Scanner palavras = new Scanner(new BufferedReader(new FileReader("palavras.txt")));
        for (i=0; i<tabelagabarito.length && palavras.hasNextLine() ; i++) {
            tabelagabarito[i] = palavras.nextLine();
        }
        Scanner dicas = new Scanner(new BufferedReader(new FileReader("dicas.txt")));
        for (i=0; i<tabeladicas.length && dicas.hasNextLine() ; i++) {
            tabeladicas[i] = dicas.nextLine();
        }
        for(i=0;i<tabelaresposta.length;i++){
            tabelaresposta[i]=(i+1)+". ";
            for(int j=0;j<tabelagabarito[i].length();j++){
                tabelaresposta[i]=tabelaresposta[i]+("_ ");
            }
            tabelaresposta[i]=tabelaresposta[i]+"Dica: "+tabeladicas[i];
        }
    }
    
    public String getTabelagabarito(int i){
        return this.tabelagabarito[i];
    }
    
    public String [] getTabelagabarito(){
        return this.tabelagabarito;
    }
    
    public String[] getTabeladicas(){
        return this.tabeladicas;
    }
    
    public String getTabeladicas(int i){
        return this.tabeladicas[i];
    }
    
    public String[] getTabelaresposta(){
        return this.tabelaresposta;
    }
    
    public String getTabelaresposta(int i){
        return this.tabelaresposta[i];
    }
    
    public void setTabelaresposta(String resposta, int indice){
        this.tabelaresposta[indice]=(indice+1)+". "+resposta+" Dica: "+this.getTabeladicas(indice);
    }

//Inicia o jogo//
    public void menu(){
        int i;
        System.out.println("Bem vindo ao Caça Palavras "+jogador.getNome()+"!");
        System.out.println("Abaixo estão as 10 palavras que você precisa adivinhar e suas respectivas dicas!");
        for(i=0;i<this.getTabelaresposta().length;i++){
            System.out.println(getTabelaresposta(i));
        }
        System.out.println("Para trocar de palavra, simplesmente digite o número da palavra desejada a qualquer momento.");
        joga(0);
    }
//Utilizado para registrar o palpite ou escolher outra palavra//  
    public void joga(int numeropalavra){
        int indice;
        Scanner s=new Scanner(System.in);
        System.out.println("Digite seu palpite para a palavra "+(numeropalavra+1));
        if(s.hasNextInt()){
          indice=s.nextInt();
          if(indice<1 || indice>10){
              System.out.println("Digite um número de palavra válido!");
              this.joga(numeropalavra);
            }
          else{
            joga((indice-1));
          }
        }
        else{   
            jogador.setPalpite(s.next());
            this.verifica(numeropalavra);
        }
    }
//Verifica se o palpite do jogador foi correto ou se venceu o jogo.//    
    public void verifica(int numeropalavra){
        boolean fim=false;
        if(jogador.getPalpite().equals(this.getTabelagabarito(numeropalavra))){
            jogador.setPontuacao();
            System.out.println("Parabéns, você acertou!");
            this.setTabelaresposta(jogador.getPalpite(), numeropalavra);
            if(jogador.getPontuacao()==this.getTabelagabarito().length){
                System.out.println("Parabéns, você venceu o jogo!");
            }
            else{
                if(numeropalavra==9 && jogador.getPontuacao()!=this.getTabelagabarito().length){
                    fim=true;
                    this.menu(numeropalavra,true);
                }
                else{
                    this.menu(numeropalavra);
                }
            }
        }
        else{
            System.out.println("Que pena, você errou!");
            this.joga(numeropalavra);
        }
    }
//Exibe as informações do menu inicial, porém com as palavras que foram acertadas//    
    public void menu(int resposta){
        int i;
        for(i=0;i<this.getTabelaresposta().length;i++){
            System.out.println(getTabelaresposta(i));
        }
        System.out.println("Para trocar de palavra, simplesmente digite o número da palavra desejada a qualquer momento.");
        joga(resposta+1);
    }   
             
    public void menu(int resposta, boolean fim){
        int i;
        Scanner s= new Scanner(System.in);
        for(i=0;i<this.getTabelaresposta().length;i++){
            System.out.println(getTabelaresposta(i));
        }
        System.out.println("Você chegou na última palavra, digite o número da palavra que deseja tentar adivinhar!");
        joga(s.nextInt()-1);
    }   
}
