public class TesteTransporte {
    public static void main(String[] args) {
        Transporte[] transportes = new Transporte[2];
        transportes[0] = new Van("Centro", 15);
        transportes[1] = new OnibusEscolar("Bairro", 2);

        for (int i = 0; i < transportes.length; i++) {
            System.out.println(transportes[i].anunciar());
        }

        System.out.println(transportes[0].lotacao(12));
        System.out.println(transportes[0].lotacao(12, 15));
    }
}
