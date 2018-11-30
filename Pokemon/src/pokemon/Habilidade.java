/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Administrador
 */
public class Habilidade {
    private String nome;
    private int ataque;
    private int custo;
    private Tipo tipo;
    private int precisao;
    
    public Habilidade(String nome, int ataque, int custo, Tipo tipo, int precisao){
        this.setNome(nome);
        this.setAtaque(ataque);
        this.setCusto(custo);
        this.setPrecisao(precisao);
        this.setTipo(tipo);
    }

    public String getNome() {
        return nome;
    }
    
    public Tipo getTipo(){
        return this.tipo;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }
    
    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }
}   
