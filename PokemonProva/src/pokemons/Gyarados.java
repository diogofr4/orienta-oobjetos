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
        this.setAtaque(125);
        this.setDefesa(79);
        this.setEspecial(100);
        this.setNome("Gyarados");
        this.setTipo();
        this.setVida(95);
        this.setnumeroForma(2);
        this.setHabilidade();
    }
    
    @Override
    public double atacar(){return 0;};
    
    @Override
    public String emitirSom(){
        return "Roaar!";
    }
    
    public void setHabilidade(){
        habilidade[0] = new Habilidade("Hydro_Pump",80,5,tipo,80);
        habilidade[1] = new Habilidade("Surf",50,15,tipo,100);
    }
}
