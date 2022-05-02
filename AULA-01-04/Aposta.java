package codigos;

import java.util.Random;

public class Aposta {
	
	private int senha;
	
    public int getDezena1() {
		return dezena1;
	}

	public void setDezena1(int dezena1) {
		if(dezena1 >= 10 && dezena1 <= 99)
			this.dezena1 = dezena1;
	}

	public int getDezena2() {
		return dezena2;
	}

	public void setDezena2(int dezena2) {
		this.dezena2 = dezena2;
	}

	public int getDezena3() {
		return dezena3;
	}

	public void setDezena3(int dezena3) {
		this.dezena3 = dezena3;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeDeApostadores() {
		return quantidadeDeApostadores;
	}

	public void setQuantidadeDeApostadores(int quantidadeDeApostadores) {
		this.quantidadeDeApostadores = quantidadeDeApostadores;
	}

	private int dezena1;
    private int dezena2;
    private int dezena3;
    private double valor;
    private int quantidadeDeApostadores;

    // Composição
    private Apostador apostadores[];
    
    
    Aposta() {
        apostadores = new Apostador[50];
        quantidadeDeApostadores = 0;
        
        senha = (new Random()).nextInt();
    }
    
    void adicionaApostador(Apostador apostador) {
    	if(quantidadeDeApostadores > apostadores.length) {
    		// Aumentar o tamanho do vetor de apostador
    		Apostador apostadoresNovo[] = new Apostador[apostadores.length*2];
    		
    		for(int i = 0 ; i < apostadores.length ; i++) {
    			apostadoresNovo[i] = apostadores[i];
    		}
    		
    		apostadores = apostadoresNovo;
    	}
    	
    	apostadores[quantidadeDeApostadores] = apostador;
    	quantidadeDeApostadores++;
    }
    
    Apostador[] recuperaApostadores() {
    	return this.apostadores;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    Aposta(int dezena1, int dezena2, double valor, String nome, String cpf, String endereco) {
        this.dezena1 = dezena1;
        this.dezena2 = dezena2;
        this.valor = valor;
        this.dono1 = new Apostador(nome, cpf, endereco);
    }

    Aposta(int dezena1, int dezena2, int dezena3, double valor, String nome, String cpf, String endereco) {
        this(dezena1, dezena2, valor, nome, cpf, endereco);
        this.dezena3 = dezena3;
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

    double confereAposta(int dezenaVencedora1, int dezenaVencedora2) {
    	double ganho = 0;
        if(this.dezena1 == dezenaVencedora1 || this.dezena1 == dezenaVencedora2) {
            ganho += this.valor * 0.60;
        }
        if(this.dezena2 == dezenaVencedora1 || this.dezena2 == dezenaVencedora2) {
            ganho += this.valor * 0.60;
        }
        return ganho;
	}





	void mudaDono1(String nome, String cpf, String endereco) {
		this.dono1.nome = nome;
		this.dono1.cpf = cpf;
		this.dono1.endereco = endereco;
	}
	
	void mudaDono2(String nome, String cpf, String endereco) {
		this.dono2.nome = nome;
		this.dono2.cpf = cpf;
		this.dono2.endereco = endereco;
	}



}
