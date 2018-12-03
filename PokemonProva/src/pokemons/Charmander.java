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
public class Charmander extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fogo","Agua","Grama");
    }

    public Charmander() {
        this.setAtaque(52);
        this.setDefesa(43);
        this.setEspecial(60);
        this.setNome("Charmander");
        this.setTipo();
        this.setVida(39);
        this.setnumeroForma(1);
        this.setHabilidade();
    }
    
    
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Char-Charmander";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Ember",40,25,tipo,100);
        habilidade[1] = new Habilidade("Flamethrower",95,15,tipo,100);
    } 

}
