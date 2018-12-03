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
public class Haunter extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fantasma","Nada","Grama");
    }

    public Haunter() {
        this.setAtaque(50);
        this.setDefesa(45);
        this.setEspecial(115);
        this.setNome("Haunter");
        this.setTipo();
        this.setVida(45);
        this.setnumeroForma(1);
        this.setHabilidade();
    }
      
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Buuuuuuhhhh!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Lick",20,30,tipo,100);
        habilidade[1] = new Habilidade("Dream_Eater",100,15,tipo,100);
    }
      
}
