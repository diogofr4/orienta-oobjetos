/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brinquedo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class Colecao {
    private String [] pokemon;
    private double valortotal;
    
    public Colecao(Venda [] pokemon){
        this.setpokemon(pokemon);
        this.setvalortotal(pokemon);
        try {
            this.salvacolecao();
        } catch (IOException ex) {
            Logger.getLogger(Colecao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setpokemon(Venda [] pokemon){
        this.pokemon = new String[pokemon.length];
        for(int i = 0;i<pokemon.length;i++){
            this.pokemon[i] = pokemon[i].getPokemon().getNome();
        }
    }
    
    public void setvalortotal(Venda [] pokemon){
        this.valortotal=pokemon[0].getValor();
    }
    
    public void salvacolecao() throws IOException{
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("colecao.txt"), "utf-8"))) {
            for (String pokemon1 : this.pokemon) {
                writer.write("\n" + pokemon1);
            }
                writer.write("\n"+this.valortotal);
            }
    }
}
