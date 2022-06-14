public class SistemaDeOracoes {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        Oracao PessoasPets[] = new Oracao[50];
        int cont = 0;

        int opcao;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("(1) Cadastrar esportista");
            System.out.println("(2) Cadastrar político");
            System.out.println("(3) Cadastrar professor");
            System.out.println("(4) Cadastrar gato");
            System.out.println("(5) Cadastrar cachorro");
            System.out.println("(6) Enviar oração entre cadastrados");
            System.out.println("(7) Sair");
            opcao = leitor.leInteiro();

            if(opcao == 1) {
                System.out.println("Nome: ");
                String nome = leitor.leString();
                System.out.println("CPF: ");
                int cpf = leitor.leInteiro();
                System.out.println("Nome esporte: ");
                String nomeEsporte = leitor.leString();
                PessoasPets[cont] = new Esportista(nome, cpf, nomeEsporte);
                cont++;
            }
            else if(opcao == 2) {
                System.out.println("Nome: ");
                String nome = leitor.leString();
                System.out.println("CPF: ");
                int cpf = leitor.leInteiro();
                System.out.println("Valor aproximado de propina: ");
                double valorPropina = leitor.leDouble();
                PessoasPets[cont] = new Politico(nome, cpf, valorPropina);
                cont++;
            }
            else if(opcao == 3) {
                System.out.println("Nome: ");
                String nome = leitor.leString();
                System.out.println("CPF: ");
                int cpf = leitor.leInteiro();
                System.out.println("Valor que está devendo ao banco: ");
                double valorDivida = leitor.leDouble();
                PessoasPets[cont] = new Professor(nome, cpf, valorDivida);
                cont++;
            }
            else if(opcao == 4) {
                System.out.println("Raça: ");
                String nome = leitor.leString();
                System.out.println("Idade: ");
                int idade = leitor.leInteiro();
                System.out.println("Ração favorita: ");
                String racaoFavorita = leitor.leString();
                PessoasPets[cont] = new Gato(nome, idade, racaoFavorita);
                cont++;
            }
            else if(opcao == 5) {
                System.out.println("Raça: ");
                String nome = leitor.leString();
                System.out.println("Idade: ");
                int idade = leitor.leInteiro();
                System.out.println("Quantidade de mordidas: ");
                int qtdMordidas = leitor.leInteiro();               
                PessoasPets[cont] = new Cachorro(nome, idade, qtdMordidas);
                cont++;
            }
            else if(opcao == 6) {
                System.out.println("Digite o número do seu usuário");
                int numeroSend = leitor.leInteiro();
                System.out.println("Digite o número do usuário que deseja enviar uma oracao");
                int numeroReceive = leitor.leInteiro();

                if(PessoasPets[numeroSend] != null && PessoasPets[numeroReceive] != null) {
                    PessoasPets[numeroSend].fazerOracao(PessoasPets[numeroReceive]);
                } else {
                    System.out.println("Algum dos usuários informados não existe! Cadastre-o e tente novamente.");
                }
            }
            else if(opcao == 7) {
                System.out.println("Bye!");
            }
        } while (opcao != 7);
    }
}
