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
    public Jogo() throws FileNotFoundException{
        this.setJogador();
    }
    public void setJogador() throws FileNotFoundException{
        Scanner s= new Scanner(System.in);
        int i=0;
        int j=0;
        while(i < 2){
            this.jogador[i] = new Jogador();
            System.out.println("Digite o nome do jogador "+ (i+1) +":");
            jogador[i].setNome(s.next());
            System.out.println("Digite o sexo do jogador "+ (i+1) +":");
            jogador[i].setSexo(s.next());
            while(j<4){
                System.out.println(jogador[i].getNome()+" selecione seu pokemon (5 necessários): ");
                controlador.imprimelistapokemons();
                jogador[i].setPokemons(s.nextInt());
            }    
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
            i=0;
            controlador.menuCombate(jogador[i]);
            i++;
            controlador.menuCombate(jogador[i]);
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
