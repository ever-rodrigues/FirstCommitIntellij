package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    static class Livro{
        private String nome;
        private Integer numeroPaginas;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(Integer numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }

        public Livro() {
        }

        public Livro(String nome, Integer numeroPaginas) {
            this.nome = nome;
            this.numeroPaginas = numeroPaginas;
        }
    }

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



        Livro livro1= new Livro();
        livro1.setNome("a");
        livro1.setNumeroPaginas(300);
        System.out.println("Livro"+ livro1.getNome() + livro1.getNome());
    }


}
