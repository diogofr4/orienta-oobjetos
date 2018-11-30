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
        this.setAtaque();
        this.setDefesa();
        this.setEspecial();
        this.setNome();
        this.setTipo();
        this.setVida();
        this.setHabilidade();
    }
      
    @Override
    public double atacar(){return 0;};
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Lick",20,30,tipo,100);
        habilidade[1] = new Habilidade("Dream_Eater",100,15,tipo,100);
    }
    
    public void setNome() {
        this.nome = "Haunter";
    }
    
    public void setVida() {
        this.vida = 45;
    }
    
    public void setAtaque() {
        this.ataque = 50;
    }
    
    public void setDefesa() {
        this.defesa = 45;
    }
    
     public void setEspecial(){
        this.especial = 115;
    }
   
}
