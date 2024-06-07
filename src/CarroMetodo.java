public class CarroMetodo {
    public static void main(String[] args) {
        Carro carroRecebe = new Carro();
        carroRecebe.ano = 2008;
        carroRecebe.cor = "Branca";
        carroRecebe.modelo = "Fiat";

        carroRecebe.fichaTecnica();
        System.out.println("idade do carro: " + carroRecebe.calculaIdade() + " anos");

    }
}
