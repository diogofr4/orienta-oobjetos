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
public class Venusaur extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Grama","Fogo","Fantasma");
    }

    public Venusaur() {
        this.setAtaque(82);
        this.setDefesa(83);
        this.setEspecial(100);
        this.setNome("Venusaur");
        this.setTipo();
        this.setVida(80);
        this.setnumeroForma(3);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Venu-Venusaur!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Wine_Whip",35,10,tipo,100);
        habilidade[1] = new Habilidade("Razor_Leaf",55,25,tipo,100);
    }
   
}
