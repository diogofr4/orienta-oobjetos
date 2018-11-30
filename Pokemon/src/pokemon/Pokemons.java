package pokemon;

import java.util.*;

public abstract class Pokemons implements AcoesPokemon{
    protected String nome;
    protected Tipo tipo;
    protected Habilidade habilidade[] = new Habilidade[2];
    protected double vida;
    protected int ataque;
    protected int defesa;
    protected int especial;
    public double atacar(int habil,Jogador atacante,Jogador defensor){
        Random ran = new Random();
        int r = ran.nextInt(106);
        double r2 = (ran.nextInt(16) + 85);
        double t = 0;
        double bonus = 1;
        if(atacante.getPokemonAtual().getHabilidade(habil).getTipo().getEfetivo().equals(defensor.getPokemonAtual().getTipo().getNome())){
            bonus = 1.5;
        }
        if(r<this.getHabilidade(habil).getPrecisao()){
            t = (((this.getHabilidade(habil).getAtaque()*(atacante.getPokemonAtual().getAtaque()/defensor.getPokemonAtual().getDefesa()))/5)+2)*((r2/100)*bonus);
            atacante.getPokemonAtual().gastaEspecial(this.getHabilidade(habil).getCusto());
            if(bonus>1){
                System.out.println("Foi super efetivo!");
            }
        }
        if(t==0){
            System.out.println("O ataque falhou!");
        }
        return t;
    }
    
    public Tipo getTipo(){
        return this.tipo;
    }
    
    public boolean verificaMorte(){
        boolean i = false;
        if(this.vida<=0){
            this.vida=0;
            i=true;
        }
        return i;
    }
    
    public void perdeHP(double dano){
        this.vida=this.vida-dano;
        
    }
    
    public void setTipo(String nome, String fraqueza, String efetivo){
        this.tipo=new Tipo(nome,fraqueza,efetivo);
    }
    
    public Habilidade getHabilidade(int i){
        return habilidade[i];
    }
    
    public void setHabilidade(String nome, int ataque, int custo, Tipo tipo, int precisao, int i){
        habilidade[i] = new Habilidade(nome,ataque,custo,tipo,precisao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
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

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }
    
    public void gastaEspecial(int gasto){
        this.especial = this.especial-gasto;
    }

}