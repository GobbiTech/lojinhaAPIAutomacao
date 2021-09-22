package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaImportacao;

    public double setValor ( double novoValor ){

        if (novoValor > 0) {
            return this.valor = novoValor;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    // PS4, Sony e 30
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e " + this.getValor();
    }
}
