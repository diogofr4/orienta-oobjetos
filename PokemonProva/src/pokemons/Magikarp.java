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
public class Magikarp extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Normal","Nada","Nada");
    }

    public Magikarp() {
        this.setAtaque(10);
        this.setDefesa(55);
        this.setEspecial(20);
        this.setNome("Magikarp");
        this.setTipo();
        this.setVida(20);
        this.setnumeroForma(1);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Blub!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Splash",0,40,tipo,0);
        habilidade[1] = new Habilidade("Tackle",35,35,tipo,95);
    }
    
}
