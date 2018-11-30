/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
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
    
    public void setPokemons(int i){
        
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
    
    public void selecionaPokemon(){
        
    }
}
