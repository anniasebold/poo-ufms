public class P1 {
  public static void main(String[] args) {
    Cancelado c1 = new Cancelado("Monark", 31);

    Cancelamento canc1 = new Cancelamento("Nazismo", true);
    Cancelamento canc2 = new Cancelamento("Homofobia", true);
    Cancelamento canc3 = new Cancelamento("Assédio", true);

    c1.setCancelamento(canc1);
    c1.setCancelamento(canc2);
    c1.setCancelamento(canc3);

    System.out.println(c1.cancelamento[0].getMotivo());

    System.out.println(c1.getNome());
  }
}
