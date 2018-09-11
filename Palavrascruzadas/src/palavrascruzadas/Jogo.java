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
    private String tabelaresposta[] = new String[10];  
    private String tabelapalpite[] = new String [10];
    
    public Jogo() throws FileNotFoundException{
        int i=0;
        Jogador jogador[] = new Jogador[2];
        Scanner s= new Scanner(System.in);
        while(i<2){
            jogador[i]=new Jogador();
            System.out.println("Digite o nome do jogador "+i+": ");
            jogador[i].setNome(s.next());
            i++;
        }
        
    }
    
    public void iniciatabela() throws FileNotFoundException{
        int i;
        Scanner palavras = new Scanner(new BufferedReader(new FileReader("palavras.txt")));
            for (i=0; i<tabelaresposta.length && palavras.hasNextLine() ; i++) {
                String line = palavras.nextLine();
                tabelaresposta[i] = line;
            }
        i=0;
        while(i<tabelapalpite.length){
            tabelapalpite[i]="_";
            i++;
        }
        System.out.println(Arrays.deepToString(tabelaresposta));
        System.out.println(Arrays.deepToString(tabelapalpite));
    }
    
}
