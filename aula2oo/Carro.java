
/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private int qtd_portas;
    private float preco;
    private float velocidade;
    

    /**
     * COnstrutor para objetos da classe Carro
     */
    public Carro(String modelo, String marca, int ano, String cor, int qtd_portas, float preco)
    {
        this.modelo=modelo;
        this.marca=marca;
        this.ano=ano;
        this.cor=cor;
        this.qtd_portas=qtd_portas;
        this.preco=preco;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void imprime()
    {
        System.out.println("Modelo: "+modelo+ "\n Marca: "+marca+"\n Ano: "+ano+"\n Cor: "+cor+"\n Quantidade de portas: "+
        qtd_portas+"\n Preço: "+preco+"\n Velocidade: "+velocidade+"\n");
    }
    
    public void acelerar(){
        this.velocidade=this.velocidade+20;
        System.out.println("O carro esta acelerando \n");
    }
        
}
