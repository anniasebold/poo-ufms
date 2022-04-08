class Aposta {
    int dezena1;
    int dezena2;
    int dezena3;
    double valor;

    // Composição
    Apostador donoDaAposta;

    Aposta(int dezena1, int dezena2, double valor, String nome, String cpf, String endereco) {
        this.dezena1 = dezena1;
        this.dezena2 = dezena2;
        this.valor = valor;
        this.donoDaAposta = new Apostador(nome, cpf, endereco);
    }

    Aposta(int dezena1, int dezena2, int dezena3, double valor, String nome, String cpf, String endereco) {
        this(dezena1, dezena2, valor, nome, cpf, endereco);
        this.dezena3 = dezena3;
    }

    Aposta() {



      
        this.donoDaAposta = new Apostador();
    }

    double confereAposta(int dezenaVencedora1, int dezenaVencedora2, int dezenaVencedora3) {
        double ganho = 0;
        if(this.dezena1 == dezenaVencedora1 || this.dezena1 == dezenaVencedora2 || this.dezena1 == dezenaVencedora3) {
            ganho += this.valor * 0.45;
        }
        if(this.dezena2 == dezenaVencedora1 || this.dezena2 == dezenaVencedora2 || this.dezena2 == dezenaVencedora3) {
            ganho += this.valor * 0.45;
        }
        if(this.dezena3 == dezenaVencedora1 || this.dezena3 == dezenaVencedora2 || this.dezena3 == dezenaVencedora3) {
            ganho += this.valor * 0.45;
        }
        return ganho;
    }



}
