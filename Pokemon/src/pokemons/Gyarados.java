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
public class Gyarados extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Agua","Eletrico","Fogo");
    }

    public Gyarados() {
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
        habilidade[0] = new Habilidade("Hydro_Pump",80,5,tipo,80);
        habilidade[1] = new Habilidade("Surf",50,15,tipo,100);
    }
    
    public void setNome() {
        this.nome = "Gyarados";
    }
    
    public void setVida() {
        this.vida = 95;
    }
    
    public void setAtaque() {
        this.ataque = 125;
    }
    
    public void setDefesa() {
        this.defesa = 79;
    }
    
     public void setEspecial(){
        this.especial = 100;
    }
   
}
