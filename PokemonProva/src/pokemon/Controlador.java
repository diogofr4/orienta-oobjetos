/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import brinquedo.Colecao;
import brinquedo.ValorInvalidoException;
import brinquedo.Venda;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Controlador {
    private String [][] listapokemons= new String[15][2];
    private Venda [] venda;
    public Controlador() throws FileNotFoundException{
        this.setlistaPokemons();
    }
    
    
    
    public void setlistaPokemons() throws FileNotFoundException{
        int i,j;
        Scanner pokemons = new Scanner(new BufferedReader(new FileReader("pokemons.txt")));
        for (i = 0, j = 0; i<listapokemons.length && pokemons.hasNextLine() ; i++) {
            listapokemons[i][j] = Integer.toString(i);
            listapokemons[i][j+1] = pokemons.nextLine();
        }
    }
    
    public String[][] getListapokemons(){
        return listapokemons;
    }
    
    public String getnomepokemon(int i){
        return listapokemons[i][1];
    }
    
    public void imprimelistapokemons() throws FileNotFoundException{
        int i,j;
        for (i = 0, j=0;i<listapokemons.length-1;i++){
            System.out.println(listapokemons[i][j]+". "+listapokemons[i][j+1]);
        }
    }
    
    public void menuVenda() throws FileNotFoundException, ValorInvalidoException{
        Scanner s = new Scanner(System.in);
        int i = 0;
        System.out.println("Digite quantos pokemons deseja comprar:");
        i = s.nextInt();
        if(i <= 0){
           throw new ValorInvalidoException(); 
        }
        venda = new Venda[i];
        String pokemon;
        int qtdPokemon = 0;
        for(int j=0;j<i;j++){
            System.out.println("Selecione o pokemon que deseja comprar:");
            this.imprimelistapokemons();
            pokemon=this.getnomepokemon(s.nextInt());
            System.out.println("Digite a quantidade do pokemon selecionado que deseja comprar:");
            qtdPokemon = s.nextInt();
            venda[j] = new Venda(pokemon,qtdPokemon);
        }
        if(venda[0].getValor()<0){
            throw new ValorInvalidoException();
        }
        Colecao colecao = new Colecao(venda);
        System.out.println("O valor total da sua compra foi de: "+venda[0].getValor());
        
    }
    
    public void menuCombate(Jogador atacante, Jogador defensor) throws FileNotFoundException{
        int i=0;
        int j=0;
        int aux=-1;
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        System.out.println("Pokemon adversário: "+defensor.getPokemonAtual().getNome()+" Vida: "+formatador.format(defensor.getPokemonAtual().getVida()));
        System.out.println("Pokemon: "+atacante.getPokemonAtual().getNome()+" Vida: "+formatador.format(atacante.getPokemonAtual().getVida())+" PP: "+atacante.getPokemonAtual().getEspecial());
        System.out.println(atacante.getNome()+" digite o número da opção desejada:");
        System.out.println(i+"- Habilidades");
        System.out.println((i+1)+"- Esperar");
        i = s.nextInt();
        if(i==0){
            opcaoHabilidadeEsperar(atacante,defensor);       
        }
        if(i==1){
            menuCombate(atacante,defensor);
        }
        if(i != 0 && i != 1){
               valorInvalido(atacante, defensor);
            }
        }
    public void opcaoHabilidadeEsperar(Jogador atacante, Jogador defensor) throws FileNotFoundException{
       int i=0;
       int j=0;
       int aux=-1;
       DecimalFormat formatador = new DecimalFormat("0.00");
       Scanner s = new Scanner(System.in);
       if(i==0 && (atacante.getPokemonAtual().getEspecial()>atacante.getPokemonAtual().getHabilidade(0).getCusto() || atacante.getPokemonAtual().getEspecial()>atacante.getPokemonAtual().getHabilidade(1).getCusto())){
            System.out.println(atacante.getNome()+" digite o número da opção desejada:");
            while(aux==-1){
                while(j<2){
                    System.out.println(j+"- "+atacante.getPokemonAtual().getHabilidade(j).getNome()+" Gasto: "+atacante.getPokemonAtual().getHabilidade(j).getCusto());  
                    j++;
                }
                j = s.nextInt();
                if(j != 0 && j != 1){
                    {
                        do{
                           j = habilidadeInvalida();
                        }while(j != 0 && j != 1);
                    }
                }
                if(atacante.getPokemonAtual().getHabilidade(j).getCusto()<atacante.getPokemonAtual().getEspecial()){
                    aux=0;
                }
                else{
                    System.out.println("Você não possui PP suficientes para usar esta habilidade!");
                    j=0;
                }
            }
           
            defensor.getPokemonAtual().perdeHP(atacante.getPokemonAtual().atacar(j,atacante,defensor));
            if(defensor.getPokemonAtual().verificaMorte()){
                System.out.println(defensor.getNome()+" seu pokemon desmaiou!");
                defensor.setQtdpokemonsderrotados();
                if(defensor.getQtdpokemonsderrotados()<3){
                    defensor.selecionaPokemon();
                }
            }
        }
        if(atacante.getPokemonAtual().getEspecial()<atacante.getPokemonAtual().getHabilidade(0).getCusto() && atacante.getPokemonAtual().getEspecial()<atacante.getPokemonAtual().getHabilidade(1).getCusto()){
            System.out.println(atacante.getNome()+" você não possui PP suficiente para usar habilidades! Passando a vez para o próximo jogador!");
        }
        atacante.getPokemonAtual().gastaEspecial(-5);
   }
   public int habilidadeInvalida(){
       int j;
       Scanner s = new Scanner(System.in);
       System.out.println("Valor invalido, digite 0 ou 1: ");
       j = s.nextInt();
       if( j == 1){
           return 1;
       }
       if( j == 0){
           return 0;   
       }
       return 2;
   } 
   public void valorInvalido(Jogador atacante, Jogador defensor) throws FileNotFoundException{
       int i;
       Scanner s = new Scanner(System.in);
       System.out.println("Valor invalido! Digite 0 ou 1:");
       i = s.nextInt();
       if(i != 0 && i != 1){
           valorInvalido(atacante, defensor);
       }
       if(i==1){
            menuCombate(atacante, defensor);
        }
       if(i==0){
            opcaoHabilidadeEsperar(atacante, defensor);

       }
   }
   public void ataqueFalho(){
       System.out.println("O ataque falhou!");
   }
   public void ataqueEfetivo(){
       System.out.println("Foi super efetivo!");
   }
   public void selecionaPokemon(String nomeJogador){
       System.out.println(nomeJogador+" selecione seu pokemon (5 necessários): ");
   }
   public void parabensJogador(String nomejogador){
       System.out.println("Parabéns "+ nomejogador+ " você venceu!");
   }
}
