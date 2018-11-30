/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.io.FileNotFoundException;
import java.util.*;

/**'
 *
 * @author Administrador
 */
public class Jogo {
    private Jogador jogador[] = new Jogador[2];
    private Controlador controlador = new Controlador();
    
    public Jogo(Jogador jogador1,Jogador jogador2) throws FileNotFoundException{
        this.jogador[0]=jogador1;
        this.jogador[1]=jogador2;
        this.setJogador();
    }
    
    public void setJogador() throws FileNotFoundException{
        Scanner s= new Scanner(System.in);
        int i=0;
        int j=0;
        while(i < 2){
            while(j<5){
                System.out.println(jogador[i].getNome()+" selecione seu pokemon (5 necessários): ");
                controlador.imprimelistapokemons();
                jogador[i].setPokemons(controlador.getnomepokemon(s.nextInt()), j);
                j++;
            }
            j=0;
            i++;
        }
    }
    
    public void iniciajogo(){
        int i=0;
        while(i<2){
            jogador[i].selecionaPokemon();
            i++;
        }
        i=0;
        
        while(jogador[i].getQtdpokemonsderrotados()<3 && jogador[i+1].getQtdpokemonsderrotados()<3){
            controlador.menuCombate(jogador[i],jogador[i+1]);
            i++;
            if(jogador[i].getQtdpokemonsderrotados()<3){
                controlador.menuCombate(jogador[i],jogador[i-1]);
            }
            i=0;
        }
        this.vitoria();
    }
    
    public void vitoria(){
        int i=0;
        while(i<2){
            if(jogador[i].getQtdpokemonsderrotados()<3){
                System.out.println("Parabéns "+jogador[i].getNome()+" você venceu!");
            }
            i++;
        }
    }
        
}
