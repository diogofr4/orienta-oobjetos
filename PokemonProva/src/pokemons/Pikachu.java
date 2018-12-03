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
public class Pikachu extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Eletrico","Agua","Grama");
    }
    
    public Pikachu() {
        this.setAtaque(55);
        this.setDefesa(30);
        this.setEspecial(50);
        this.setNome("Pikachu");
        this.setTipo();
        this.setVida(35);
        this.setnumeroForma(2);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Pika-Pika!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("ThunderShock",40,30,tipo,100);
        habilidade[1] = new Habilidade("Thunder",120,10,tipo,70);
    }
   
}
