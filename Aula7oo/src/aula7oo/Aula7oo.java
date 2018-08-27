/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7oo;

import java.util.*;

/**
 *
 * @author ice
 */
public class Aula7oo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0,j=0;
        int cao=0,vend=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Digite a quantidade de cachorros que serão adicionados: ");
        cao=s.nextInt();
        Cachorro cachorros[]= new Cachorro[cao];
        while(i<cao){
            cachorros[i]= new Cachorro();
            System.out.println("Digite o nome do cachorro "+(i+1)+":");
            cachorros[i].setNome(s.next());
            System.out.println("Digite a cor do cachorro "+(i+1)+":");
            cachorros[i].setCor(s.next());
            System.out.println("Digite a raça do cachorro "+(i+1)+":");
            cachorros[i].setRaca(s.next());
            System.out.println("Digite o sexo do cachorro "+(i+1)+":");
            cachorros[i].setSexo(s.next());
            System.out.println("Digite a idade do cachorro "+(i+1)+":");
            cachorros[i].setIdade(s.nextInt());
            i++;
        }
        i=0;
        System.out.println("Quantas vendas deseja fazer?");
        vend = s.nextInt();
        Venda vendas[] = new Venda[vend];
        while(i<vend){
            j = vend;
            if(vend>0){
                System.out.println("Digite o valor da venda "+(i+1)+":");
                vendas[i]=new Venda();
                vendas[i].setValor(s.nextFloat());
                vendas[i].vender(cachorros[j]);
            }
            i++;
            j--;
        }
        System.out.println("Existem "+Cachorro.getContador()+" cachorros à venda.");
        System.out.println("Foram feitas "+Venda.getContador()+" vendas.");
    }
    
}
