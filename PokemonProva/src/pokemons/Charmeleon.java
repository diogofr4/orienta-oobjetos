/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import pokemon.*;

/**
 *
 * @author Fernanda
 */
public class Charmeleon extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fogo","Agua","Grama");
    }

    public Charmeleon() {
        this.setAtaque(64);
        this.setDefesa(58);
        this.setEspecial(80);
        this.setNome("Charmeleon");
        this.setTipo();
        this.setVida(58);
        this.setnumeroForma(2);
        this.setHabilidade();
    }
  
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Char-Charmeleon!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Ember",40,25,tipo,100);
        habilidade[1] = new Habilidade("Flamethrower",95,15,tipo,100);
    }
    
}
