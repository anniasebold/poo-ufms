public class ATIVIDADE1 {
  public static void main(String[] args) {
      
  // Apostas de 2 dezenas
  System.out.println("\nAposta 1 de 2 dezenas");
  Aposta apostaDuasDez1 = new Aposta(10, 20, 10, "149.920.750-61", "José Saramago", "Campo Grande, MS");
  
  System.out.println("\nAposta 2 de 2 dezenas");
  Aposta apostaDuasDez2 = new Aposta(1, 20, 10, "836.258.540-40", "Rosalia", "Bonito, MS");
  
  System.out.println("\nAposta 3 de 2 dezenas");
  Aposta apostaDuasDez3 = new Aposta(4, 8, 10, "008.482.550-20", "Maria Rosa", "Itajaí, SC");
  
  //Apostas de 3 dezenas
  System.out.println("\nAposta 1 de 3 dezenas");
  Aposta apostaTresDez1 = new Aposta(45, 55, 12, 10, "272.515.880-05", "Flavio Augusto", "São Paulo, SP");
  
  System.out.println("\nAposta 2 de 3 dezenas");
  Aposta apostaTresDez2 = new Aposta(1, 4, 45, 10, "452.410.380-51", "Paola Oliveira", "São Paulo, SP");

  System.out.println("\nAposta 3 de 3 dezenas");
  Aposta apostaTresDez3 = new Aposta(45, 2, 12, 10, "972.353.150-08", "Annia Sebold", "Itajaí, SC");
  }
}
