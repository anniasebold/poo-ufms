public class TestePessoa {
    public static void main(String[] args) {
        try {
            Pessoa pmk = new Pessoa("123.123.123-12", "Pedro Matheus Kelven Tiago Wallace Lara Gustavo Asdrubal Praquinúrio");
        }
        catch(InvalidCpfException e) {
            System.out.println(e.getMessage());
        }
        catch(InvalidNameException e) {
            System.out.println("Nome inválido");
        }
    }
}
