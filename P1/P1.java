public class P1 {
  public static void main(String[] args) {
    Cancelado c1 = new Cancelado("Monark", 31);

    Cancelamento canc1 = new Cancelamento("Nazismo", true);

    c1.setCancelamento(0,canc1);

    System.out.println(c1.cancelamento[0].getMotivo());

    System.out.println(c1.getNome());
  }
}
