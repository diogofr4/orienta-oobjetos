/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavrascruzadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Tabela {
    private String[] tabelagabarito = new String[10]; 
    private String tabeladicas[] = new String [10];
    private String[] tabelaresposta = new String[10];
    
    
    public Tabela() throws FileNotFoundException{
        this.setTabelas();
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

    
}
