/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import pokemon.*;

/**
 *
 * @author ice
 */
public class Bulbasaur extends Pokemons {
    
    public Bulbasaur(){
        this.setAtaque(49);
        this.setDefesa(49);
        this.setEspecial(65);
        this.setNome("Bulbasaur");
        this.setTipo();
        this.setVida(45);
        this.setnumeroForma(1);
        this.setHabilidade();
    }
    
    public void setTipo(){
        this.tipo=new Tipo("Grama","Fogo","Fantasma");
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Wine_Whip",35,10,tipo,100);
        habilidade[1] = new Habilidade("Razor_Leaf",55,25,tipo,100);
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Bulba-Bulbasaur!";
    }
    

   
}
