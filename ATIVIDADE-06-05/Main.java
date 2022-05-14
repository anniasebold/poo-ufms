public class Main {
  public static void main(String[] args) {
    Veiculo v = new Veiculo(1200);
    VeiculoTerrestre vt = new VeiculoTerrestre(1900, true);
    Tanque t = new Tanque(1000, true, "20/08/2001");

    F_22 f22 = new F_22(100, 1000, true);

    f22.voar();
    v.setPeso(1000);
    t.andar();
  }
}