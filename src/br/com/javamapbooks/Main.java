package br.com.javamapbooks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, livros> meusLivros = new HashMap<>() {{
            put("T.T. Alves", new livros("Correr ou Morrer.", 869));
            put("J.R. Tolkin", new livros("O senhor dos anéis.", 432));
            put("B. Gramhan", new livros("Valution.", 386));
        }};

        for (Map.Entry<String, livros> Livro : meusLivros.entrySet()) {
            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());
        }

        System.out.println("\n");

        Map<String, livros> meusLivrosList = new LinkedHashMap<>() {{
            put("T.T. Alves", new livros("Correr ou Morrer.", 869));
            put("J.R. Tolkin", new livros("O senhor dos anéis.", 432));
            put("B. Gramhan", new livros("Valution.", 386));
        }};

        for (Map.Entry<String, livros> Livro : meusLivrosList.entrySet()) {
            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());
        }

        System.out.println("\n");

        Map<String, livros> meusLivrosTreeMap = new TreeMap<>(meusLivros) {{
            put("T.T. Alves", new livros("Correr ou Morrer.", 869));
            put("J.R. Tolkin", new livros("O senhor dos anéis.", 432));
            put("B. Gramhan", new livros("Valution.", 386));
        }};

        for (Map.Entry<String, livros> Livro : meusLivrosTreeMap.entrySet()) {
            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());
        }

    }

    static class livros {

        private String nome;
        private Integer numeroPaginas;

        public livros(String nome, Integer numeroPaginas) {
            this.nome = nome;
            this.numeroPaginas = numeroPaginas;
        }

        public String getNome() {
            return nome;
        }

        public Integer getNumeroPaginas() {
            return numeroPaginas;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            livros livros = (livros) o;
            return nome.equals(livros.nome) && numeroPaginas.equals(livros.numeroPaginas);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, numeroPaginas);
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", numeroPaginas=" + numeroPaginas +
                    '}';
        }
    }
}
