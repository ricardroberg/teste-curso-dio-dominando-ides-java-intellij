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

/*        int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }
}
