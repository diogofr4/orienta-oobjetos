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
public class Raichu extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Eletrico","Agua","Grama");
    }

    public Raichu() {
        this.setAtaque(90);
        this.setDefesa(55);
        this.setEspecial(90);
        this.setNome("Raichu");
        this.setTipo();
        this.setVida(60);
        this.setnumeroForma(3);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Raichuuuuuuu!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("ThunderShock",40,30,tipo,100);
        habilidade[1] = new Habilidade("Thunder",120,10,tipo,70);
    }
    
}
