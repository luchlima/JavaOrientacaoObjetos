public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int somaDasAvaliacoes;
    int totalAvaliacoes;

    void fichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoLancamento);
    }
    void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaGeral(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
