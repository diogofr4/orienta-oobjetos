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
public class Tipo {
    private String nome;
    private String [] fraqueza = new String[5];
    private String [] efetivo = new String[5];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String[] fraqueza) {
        this.fraqueza = fraqueza;
    }

    public String[] getEfetivo() {
        return efetivo;
    }

    public void setEfetivo(String[] efetivo) {
        this.efetivo = efetivo;
    }
}
