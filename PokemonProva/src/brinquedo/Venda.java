/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brinquedo;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokemon.Controlador;
import pokemon.Jogador;
import pokemon.Pokemons;

/**
 *
 * @author ice
 */
public class Venda {
    private Controlador controlador;
    private String pokemon;
    private Pokemons pokemons;
    private int qtdPokemon = 0;
    private static double valor;
    Colecao colecao;

    public Venda(String pokemon,int qtdPokemon) throws FileNotFoundException {
        this.controlador = new Controlador();
        this.setPokemon(pokemon);
        this.setQtdPokemon(qtdPokemon);
        this.calculaVenda();
    }
    
    public void calculaVenda(){
        if(pokemons.getnumeroForma()==1){
            Venda.valor = Venda.valor + (this.qtdPokemon*9.99);
        }
        if(pokemons.getnumeroForma()==2){
            Venda.valor = Venda.valor + (this.qtdPokemon*19.99);
        }
        if(pokemons.getnumeroForma()==3){
            Venda.valor = Venda.valor + (this.qtdPokemon*29.99);
        }
    }
    
    public double getValor(){
        return this.valor;
    }

    public Pokemons getPokemon() {
        return pokemons;
    }

    public void setPokemon(String pokemon) {
        try {
            try {
                try {
                    pokemons=(Pokemons) Class.forName("pokemons."+pokemon).getConstructor().newInstance();
                } catch (NoSuchMethodException | SecurityException ex) {
                    Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getQtdPokemon() {
        return qtdPokemon;
    }

    public void setQtdPokemon(int qtdPokemon) {
        this.qtdPokemon = qtdPokemon;
    }
    
    
    
    
}
