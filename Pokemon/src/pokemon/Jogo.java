/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.*;

/**'
 *
 * @author Administrador
 */
public class Jogo {
    private Jogador jogador[] = new Jogador[2];
    public Jogo(){
        this.setJogador();
    }
    public void setJogador(){
        Scanner s= new Scanner(System.in);
        int i=0;
        while(i < 2){
            this.jogador[i] = new Jogador();
            System.out.println("Digite o nome do jogador "+ (i+1) +":");
            jogador[i].setNome(s.next());
            System.out.println("Digite o sexo do jogador "+ (i+1) +":");
            jogador[i].setSexo(s.next());
            i++;
        }
    }
    
    public void setPokemons(){
        
    }
    
    public void atacar(){
        int indice;
        Scanner s= new Scanner(System.in);
        System.out.println("Digite o número da habilidade desejada: ");
        indice = s.nextInt();
        
    }
    
}
