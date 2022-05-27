public class Main {
  public static void main(String[] args) {
    FaixaMusical faixas[] = new FaixaMusical[200];
    BemMaterial bens[] = new BemMaterial[100];

    faixas[0] = new Funk("Oi, princesa", "01/12/2020", 20000, false, "VALESCA POPOZUDA");
    faixas[1] = new Funk("TCHAU PRINCESA", "01/12/2021", 200000, true, "Charlie Brown JR");
    faixas[2] = new Pop("Popzao do catra", "01/12/2015", 200, 1000, 3);

    bens[0] = new Camiseta(2020, true, 32, "Amarelo");

    System.out.println("Herança total = " + BensHeranca.getValor());

    double valorEsposas = (BensHeranca.getValor() / 2) / 3;
    System.out.println("Esposa = " + valorEsposas);

    double valorFilhos = (BensHeranca.getValor() / 4) / 32;
    System.out.println("Filho = " + valorFilhos);

    double valorNetos = (BensHeranca.getValor() / 4) / 4;
    System.out.println("Neto = " + valorNetos);
  }

}