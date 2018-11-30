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
public class Charizard extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fogo","Agua","Grama");
    }
    
    @Override
    public double atacar(){return 0;};

    public Charizard() {
        this.setAtaque();
        this.setDefesa();
        this.setEspecial();
        this.setNome();
        this.setTipo();
        this.setVida();
        this.setHabilidade();
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Ember",40,25,tipo,100);
        habilidade[1] = new Habilidade("Flamethrower",95,15,tipo,100);
    }
    
    public void setNome() {
        this.nome = "Charizard";
    }
    
    public void setVida() {
        this.vida = 78;
    }
    
    public void setAtaque() {
        this.ataque = 84;
    }
    
    public void setDefesa() {
        this.defesa = 78;
    }
    
     public void setEspecial(){
        this.especial = 109;
    }
    
}
