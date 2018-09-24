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
public class Pokemons {
    private String nome;
    private String sexo;
    private Tipo tipo[] = new Tipo[2];
    private Habilidade habilidade[] = new Habilidade[4];
    private int tamanho;
    private int peso;
    private int captura;
    private int vida;
    private int ataque;
    private int defesa;
    private int ataque_especial;
    private int defesa_especial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCaptura() {
        return captura;
    }

    public void setCaptura(int captura) {
        this.captura = captura;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque_especial() {
        return ataque_especial;
    }

    public void setAtaque_especial(int ataque_especial) {
        this.ataque_especial = ataque_especial;
    }

    public int getDefesa_especial() {
        return defesa_especial;
    }

    public void setDefesa_especial(int defesa_especial) {
        this.defesa_especial = defesa_especial;
    }
}
