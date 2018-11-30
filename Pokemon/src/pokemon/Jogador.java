/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokemons.*;

/**
 *
 * @author Administrador
 */
public class Jogador {
    private String nome;
    private String sexo;
    private Pokemons pokemons[] = new Pokemons[5];
    private int qtdpokemonsderrotados = 0;   
    private int indicePokemon;

    public Jogador() {
    }

    public Jogador(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setPokemons(String nomepokemon, int j){
        try {
            try {
                try {
                    pokemons[j]=(Pokemons) Class.forName("pokemons."+nomepokemon).getConstructor().newInstance();
                } catch (NoSuchMethodException | SecurityException ex) {
                    Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pokemon selecionado!");
    }
    
    public Pokemons getPokemonAtual(){
        return pokemons[indicePokemon];
    }
    
    public int getQtdpokemonsderrotados() {
        return qtdpokemonsderrotados;
    }
    
    public void setQtdpokemonsderrotados(){
        this.qtdpokemonsderrotados = this.qtdpokemonsderrotados+1;
    }
    
    public void imprimePokemons(){
        for(int i=0;i<5;i++){
            System.out.println(i+". Pokemon: "+pokemons[i].getNome()+" Tipo: "+pokemons[i].getTipo().getNome()+" Vida: "+pokemons[i].getVida());
        }
    }
    
    public void selecionaPokemon(){
        int i=-1;
        Scanner s = new Scanner(System.in);
        while(i==-1){
            System.out.println(this.getNome()+" selecione o pokemon que irá batalhar.");
            this.imprimePokemons();
            i = s.nextInt();
            if(this.pokemons[i].getVida()==0 || i<0 || i > 5){
                System.out.println("Este pokemon não pode ser selecionado!");
                i=-1;
            }
            else{
                this.indicePokemon=i;
            }
        }

    }
}
