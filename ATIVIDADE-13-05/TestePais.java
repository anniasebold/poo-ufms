public class TestePais {
    public static void main(String[] args) {
      Pais pais1 = new Pais("BRA", "Brasil", 10000);
      pais1.setPopulacao(15000);


      Pais pais2 = new Pais("ARG", "Argentina", 1000);
      pais2.setPopulacao(1500);

      Pais pais3 = new Pais("CHI", "Chile", 100);
      pais3.setPopulacao(150);

      Pais pais4 = new Pais("PAR", "Paraguai", 10000);
      pais4.setPopulacao(15000);


      pais1.setPaisFronteira(pais2);
      pais1.setPaisFronteira(pais3);
      pais1.setPaisFronteira(pais4);
      pais1.getPaisesFronteira();
      // System.out.println(pais1.getDensidadePopulacional());
      
      pais2.setPaisFronteira(pais4);
      pais2.setPaisFronteira(pais3);
      pais1.listPaisesVizinhos(pais2);

      System.out.println(pais1.fazFronteira(pais2));
      // System.out.println(Pais.getContador());
    } 
}