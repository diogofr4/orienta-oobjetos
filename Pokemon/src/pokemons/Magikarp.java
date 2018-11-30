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
        habilidade[0] = new Habilidade("Splash",0,40,tipo,0);
        habilidade[1] = new Habilidade("Tackle",35,35,tipo,95);
    }
    
    public void setNome() {
        this.nome = "Magikarp";
    }
    
    public void setVida() {
        this.vida = 20;
    }
    
    public void setAtaque() {
        this.ataque = 10;
    }
    
    public void setDefesa() {
        this.defesa = 55;
    }
    
     public void setEspecial(){
        this.especial = 20;
    }
   
}
