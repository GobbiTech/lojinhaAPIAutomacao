package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {

    public String nome;
    public String marca;
    protected double valor;
    public Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    // Definir comandos qu serão iniciados durante a instanciação
    //public Produto(){
    //    this.marca = "Sony";
    //}
    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        this.marca =  marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public List<ItemIncluso> getItensInclusos(){
        return itensInclusos;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }

    public double getValor() {
        return this.valor;
    }

    public double setValor ( double novoValor ){

        if (novoValor > 0) {
            return this.valor = novoValor;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }
}
