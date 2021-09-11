package br.com.lojinha;
import br.com.lojinha.pojo.Produto;

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

        Produto meuProduto = new Produto();

        meuProduto.nome = "Play Station 4";
        meuProduto.marca ="Sony";
        meuProduto.setValor(23.33);
        meuProduto.tamanho = "Medio";
        meuProduto.itensInclusos = " 2 Controle e 3 Jogos";

        System.out.println(meuProduto.nome);
        System.out.println(meuProduto.getValor());

    }

}
