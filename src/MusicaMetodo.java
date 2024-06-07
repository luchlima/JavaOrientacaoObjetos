public class MusicaMetodo {
    public static void main(String[] args) {
        Musica musicaRecebe = new Musica();
        musicaRecebe.anoLancamento = 2022;
        musicaRecebe.artista = "lucas";
        musicaRecebe.titulo = "abcdefg";

        musicaRecebe.fichaTecnica();
        musicaRecebe.avalia(10);
        musicaRecebe.avalia(3);
        musicaRecebe.avalia(6);
        System.out.println("Total de avaliacoes: " + musicaRecebe.totalAvaliacoes);
        System.out.println("Soma das Avaliacoes: " + musicaRecebe.somaDasAvaliacoes);

        System.out.println("Media das avaliacoes: " + musicaRecebe.pegaGeral());
    }
}
