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
public class Charizard extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fogo","Agua","Grama");
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Char-Char!";
    }
    
    public Charizard() {
        this.setAtaque(84);
        this.setDefesa(78);
        this.setEspecial(109);
        this.setNome("Charizard");
        this.setTipo();
        this.setVida(78);
        this.setnumeroForma(3);
        this.setHabilidade();
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Ember",40,25,tipo,100);
        habilidade[1] = new Habilidade("Flamethrower",95,15,tipo,100);
    }
    
}
