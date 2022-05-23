public class TesteSuperHeroi {
  public static void main(String[] args) {
    HomemDeFerro hf = new HomemDeFerro("Homem de Ferro", "Lala", "Brasil", 80, 10, 9);
    Wolverine wolverine = new Wolverine("Wolverine", "Lala", "EUA", 90, 10.90, 15);
    Ciclope ciclope = new Ciclope("Ciclope", "Lala", "India", 70);
    System.out.println(hf.getQtdNamoradas());
    System.out.println(wolverine.getTempoCicatrizacao());
    wolverine.machucar(hf);
    ciclope.machucar(wolverine);

    System.out.println(hf.getQtdNamoradas());
    System.out.println(wolverine.getTempoCicatrizacao());

    Coringa co = new Coringa("Brasil");
    co.machucar(ciclope);
    System.out.println(ciclope.getNivelDeResistencia());
  }
}