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
public class Pidgey extends Pokemons {
    public void setTipo(){
        this.tipo=new Tipo("Normal","Nada","Nada");
    }

    public Pidgey() {
        this.setAtaque(45);
        this.setDefesa(40);
        this.setEspecial(35);
        this.setNome("Pidgey");
        this.setTipo();
        this.setVida(40);
        this.setnumeroForma(1);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Piu!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Gust",40,35,tipo,100);
        habilidade[1] = new Habilidade("Wing_Attack",35,35,tipo,100);
    }
}
