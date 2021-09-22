package br.com.lojinha;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {

        //String joias = "100g de ouro 50k";
        //int minhaIdade = 35;
        //double meuSalario = 29500.900;
        //boolean minhaResposta = false;

        //System.out.println(joias);
        //System.out.println(minhaIdade);
        //System.out.println(meuSalario);
        //System.out.println(minhaResposta);

        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);
        //System.out.println(meuProduto.getMarca());

        //meuProduto.nome = "Play Station 4";
        //meuProduto.marca ="FG";
        //meuProduto.setValor(20);
        //meuProduto.tamanho = (Tamanho.PEQUENO);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        //itensInclusos.add("2 Controles"); //0
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle",2);
        //primeiroItemIncluso.setNome("Controle");
        //primeiroItemIncluso.setQuantidade(2);
        itensInclusos.add(primeiroItemIncluso);

        //itensInclusos.add("3 Jogos"); //1
        ItemIncluso segundoItemIncluso = new ItemIncluso("3 Jogos",3);
        //segundoItemIncluso.setNome("3 Jogos");
        //segundoItemIncluso.setQuantidade(3);
        itensInclusos.add(segundoItemIncluso);

        //itensInclusos.add(" 2 Cabos de Energia"); //2
        ItemIncluso terceiroItemIncluso = new ItemIncluso("2 Cabos de Energia",2);
        //terceiroItemIncluso.setNome("2 Cabos de Energia");
        //terceiroItemIncluso.setQuantidade(2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        //System.out.println(meuProduto.getItensInclusos());
        //System.out.println(meuProduto.getItensInclusos().size());
        //System.out.println(meuProduto.getItensInclusos().get(1));
        //System.out.println(meuProduto.getValor());
        //System.out.println(meuProduto.getTamanho());
        //System.out.println(meuProduto.nome);
        //System.out.println(meuProduto.getMarca());

        System.out.println("Começando a apresentar os itens");
        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("Acabaram-se os itens ");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.555);

        System.out.println(meuProdutoNacional.getMarca());

    }

}
