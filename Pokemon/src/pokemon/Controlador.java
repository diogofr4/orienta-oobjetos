/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Controlador {
    private String [][] listapokemons= new String[15][2];
    public Controlador() throws FileNotFoundException{
        this.setlistaPokemons();
    }
    
    public void setlistaHabilidades(){
        
    }
    
    public void setlistaPokemons() throws FileNotFoundException{
        int i,j;
        Scanner pokemons = new Scanner(new BufferedReader(new FileReader("pokemons.txt")));
        for (i = 0, j = 0; i<listapokemons.length && pokemons.hasNextLine() ; i++) {
            listapokemons[i][j] = Integer.toString(i);
            listapokemons[i][j+1] = pokemons.nextLine();
        }
    }
    
    public void imprimelistapokemons() throws FileNotFoundException{
        int i,j;
        for (i = 0, j=0;i<listapokemons.length;i++){
            System.out.println(listapokemons[i][j]+". "+listapokemons[i][j+1]);
        }
    }
    
    public void menuCombate(Jogador jogador){
        int i=0;
        int j=0;
        Scanner s = new Scanner(System.in);
        System.out.println(jogador.getNome()+" digite o número da opção desejada:");
        System.out.println((i+1)+"- Habilidades");
        System.out.println((i+2)+"- Esperar");
        i = s.nextInt();
        if(i==1){
            System.out.println(jogador.getNome()+" digite o número da opção desejada:");
            while(j<2){
                System.out.println((j+1)+"- "+jogador.getPokemonAtual().getHabilidade(j).getNome());  
                j++;
            }
            j = s.nextInt();
            jogador.getPokemonAtual().atacar(j);
        }
    }
}
