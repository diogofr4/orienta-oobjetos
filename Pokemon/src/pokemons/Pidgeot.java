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
public class Pidgeot extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Normal","Nada","Nada");
    }
    
    @Override
    public double usarHabilidade(){return 0;};
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Gust",40,35,tipo,100);
        habilidade[1] = new Habilidade("Wing_Attack",35,35,tipo,100);
    }
    
    public void setNome() {
        this.nome = "Pidgeot";
    }
    
    public void setVida() {
        this.vida = 83;
    }
    
    public void setAtaque() {
        this.ataque = 80;
    }
    
    public void setDefesa() {
        this.defesa = 75;
    }
    
     public void setEspecial(){
        this.especial = 70;
    }
   
}
