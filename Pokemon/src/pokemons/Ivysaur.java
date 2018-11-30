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
public class Ivysaur extends Pokemons {
   public void setTipo(){
        this.tipo=new Tipo("Grama","Fogo","Fantasma");
    }
    
    @Override
    public double usarHabilidade(){return 0;};
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Wine_Whip",35,10,tipo,100);
        habilidade[1] = new Habilidade("Razor_Leaf",55,25,tipo,100);
    }
    
    public void setNome() {
        this.nome = "Ivysaur";
    }
    
    public void setVida() {
        this.vida = 60;
    }
    
    public void setAtaque() {
        this.ataque = 62;
    }
    
    public void setDefesa() {
        this.defesa = 63;
    }
    
     public void setEspecial(){
        this.especial = 80;
    }
    
}
