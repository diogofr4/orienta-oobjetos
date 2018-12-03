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
public class Growlithe extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fogo","Agua","Grama");
    }

    public Growlithe() {
        this.setAtaque(70);
        this.setDefesa(45);
        this.setEspecial(70);
        this.setNome("Growlithe");
        this.setTipo();
        this.setVida(55);
        this.setnumeroForma(1);
        this.setHabilidade();
    }
       
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Rawr!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Ember",40,25,tipo,100);
        habilidade[1] = new Habilidade("Flamethrower",95,15,tipo,100);
    }    
}
