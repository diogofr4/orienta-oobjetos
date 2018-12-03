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
public class Ivysaur extends Pokemons {
   public void setTipo(){
        this.tipo=new Tipo("Grama","Fogo","Fantasma");
    }

    public Ivysaur() {
        this.setAtaque(62);
        this.setDefesa(63);
        this.setEspecial(80);
        this.setNome("Ivysaur");
        this.setTipo();
        this.setVida(60);
        this.setnumeroForma(2);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Ivy-Ivysaur!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Wine_Whip",35,10,tipo,100);
        habilidade[1] = new Habilidade("Razor_Leaf",55,25,tipo,100);
    }
    
}
