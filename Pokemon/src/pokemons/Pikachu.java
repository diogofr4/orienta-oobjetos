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
        habilidade[0] = new Habilidade("ThunderShock",40,30,tipo,100);
        habilidade[1] = new Habilidade("Thunder",120,10,tipo,70);
    }
   
    public void setNome() {
        this.nome = "Pikachu";
    }
    
    public void setVida() {
        this.vida = 35;
    }
    
    public void setAtaque() {
        this.ataque = 55;
    }
    
    public void setDefesa() {
        this.defesa = 30;
    }
    
     public void setEspecial(){
        this.especial = 50;
    }
}
