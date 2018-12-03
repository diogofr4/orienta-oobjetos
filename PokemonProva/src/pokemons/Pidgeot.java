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
public class Pidgeot extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Normal","Nada","Nada");
    }

    public Pidgeot() {
        this.setAtaque(80);
        this.setDefesa(75);
        this.setEspecial(70);
        this.setNome("Pidgeot");
        this.setTipo();
        this.setVida(83);
        this.setnumeroForma(2);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Kakaaa!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Gust",40,35,tipo,100);
        habilidade[1] = new Habilidade("Wing_Attack",35,35,tipo,100);
    }
   
}
