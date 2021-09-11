package br.com.lojinha.pojo;

public class Produto {

    public String nome;
    public String marca;
    private double valor;
    public String tamanho;
    public String itensInclusos;

    public double getValor() {
        return this.valor;
    }

    public double setValor ( double novoValor ){
        return  this.valor = novoValor;
    }
}
