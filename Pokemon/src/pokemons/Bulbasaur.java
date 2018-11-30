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
public class Bulbasaur extends Pokemons {
    
    public Bulbasaur(){
        this.setAtaque();
        this.setDefesa();
        this.setEspecial();
        this.setNome();
        this.setTipo();
        this.setVida();
        this.setHabilidade();
    }
    
    public void setTipo(){
        this.tipo=new Tipo("Grama","Fogo","Fantasma");
    }
    
    @Override
    public double atacar(){return 0;};
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Wine_Whip",35,10,tipo,100);
        habilidade[1] = new Habilidade("Razor_Leaf",55,25,tipo,100);
    }
    
    public void setNome() {
        this.nome = "Bulbasaur";
    }
    
    public void setVida() {
        this.vida = 45;
    }
    
    public void setAtaque() {
        this.ataque = 49;
    }
    
    public void setDefesa() {
        this.defesa = 49;
    }
    
     public void setEspecial(){
        this.especial = 65;
    }
   
}
