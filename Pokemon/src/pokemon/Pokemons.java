package pokemon;
public abstract class Pokemons implements AcoesPokemon{
    protected String nome;
    protected String sexo;
    protected Tipo tipo[] = new Tipo[2];
    protected Habilidade habilidade[] = new Habilidade[4];
    protected int tamanho;
    protected int peso;
    protected int captura;
    protected double vida;
    protected int ataque;
    protected int defesa;
    protected int ataque_especial;
    protected int defesa_especial;    
    public void morrer(){}
    public void perdeHP(double dano){
        this.vida=this.vida-dano;
        if(this.vida<=0){
            this.vida=0;
            this.morrer();
        }
    }

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