package pokemon;
public abstract class Pokemons implements AcoesPokemon{
    protected String nome;
    protected Tipo tipo;
    protected Habilidade habilidade[] = new Habilidade[1];
    protected double vida;
    protected int ataque;
    protected int defesa;
    protected int especial;
    public void morrer(){}
    public void atacar(int i){}
    public void perdeHP(double dano){
        this.vida=this.vida-dano;
        if(this.vida<=0){
            this.vida=0;
            this.morrer();
        }
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

}