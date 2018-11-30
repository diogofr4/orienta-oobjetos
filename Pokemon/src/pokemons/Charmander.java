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
public class Charmander extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Fogo","Agua","Grama");
    }
    
    @Override
    public double usarHabilidade(){return 0;};
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Ember",40,25,tipo,100);
        habilidade[1] = new Habilidade("Flamethrower",95,15,tipo,100);
    } 
    
    public void setNome() {
        this.nome = "Charmander";
    }
    
    public void setVida() {
        this.vida = 39;
    }
    
    public void setAtaque() {
        this.ataque = 52;
    }
    
    public void setDefesa() {
        this.defesa = 43;
    }
    
     public void setEspecial(){
        this.especial = 60;
    }
}
