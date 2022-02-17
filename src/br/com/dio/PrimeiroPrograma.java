package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        livro Livro1 = new livro("As tramças do rei careca", 300);
        System.out.println(Livro1);
       /* int a = 5;
        int b = 3;

        System.out.println("Hello Word" + (a+b));*/


    }

}

class livro {

    private String nome;
    private Integer npg;

    public livro(String nome, Integer npg) {
        this.nome = nome;
        this.npg = npg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpg() {
        return npg;
    }

    public void setNpg(Integer npg) {
        this.npg = npg;
    }


    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", npg=" + npg +
                '}';
    }
}