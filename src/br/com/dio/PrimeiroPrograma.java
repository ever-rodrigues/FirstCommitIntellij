package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {


    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.setCor("marrom");
        gato.setIdade(45);
        gato.setNome("Alfredo");
        int a=5;
        int b=3;
        System.out.println("Testando primeiro programa em Java");
        System.out.println("Soma:"+(a+b));
        System.out.println(gato.getCor());
        System.out.println(gato.getIdade()+ " anos de Idade");
        System.out.println(gato.getNome());
    }

}
