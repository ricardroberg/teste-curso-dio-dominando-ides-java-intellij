package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Garfield", "Preto e Laranja Rajado", 9);  // primeira forma
//        gato.setNome("Garfield");
//        gato.setCor("Preto e Laranja Rajado");  // segunda forma
//        gato.setIdade(9);
        System.out.println("Este é " + gato.getNome() + "\nsua cor é " + gato.getCor() + ", bem bacana" +
                "e ele já " + "tem " + gato.getIdade() + " anos.");

        Livro livro1 = new Livro("O Problema dos 3 corpos", 300);
        System.out.println(livro1);

/*        int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }
}
class Livro {
        private String nome;
        private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}
