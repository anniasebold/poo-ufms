class Loterica {
    public static void main(String[] args) {

        Aposta[] apostas;
        apostas = new Aposta[3];

        // Resultado oficial de 2 dígitos: 10,20

        Aposta ap;
        ap = new Aposta(10, 20, 1000.0, "Wallace","123.456.789-10","Rua Bla");
        ap.confereAposta(10, 20, 0);

        Aposta ap2;
        ap2 = new Aposta();

        Aposta a21 = new Aposta(10,30,500.0,"Ziguifrido","123.456.789-10","Rua Balbúrdia");
        System.out.println(a21.confereAposta(10,20));

        Aposta a22 = new Aposta(12,31,500.0,"Ziguifrido","123.456.789-10","Rua Balbúrdia");
        System.out.println(a22.confereAposta(10,20));
        Aposta a23 = new Aposta(80,34,500.0,"Ziguifrido","123.456.789-10","Rua Balbúrdia");
        System.out.println(a23.confereAposta(10,20));

        Aposta a31 = new Aposta(10,20,30,900.0,"Pafuncio","145.678.231.32","Rua Plaquinuria");
        System.out.println(a31.confereAposta(12,45,55));
        Aposta a32 = new Aposta(12,21,33,900.0,"Pafuncio","145.678.231.32","Rua Plaquinuria");
        System.out.println(a32.confereAposta(12,45,55));
        Aposta a33 = new Aposta(14,19,31,900.0,"Pafuncio","145.678.231.32","Rua Plaquinuria");
        System.out.println(a33.confereAposta(12,45,55));

    }
}
