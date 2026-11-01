public class TesteCinema {
    public static void main(String[] args) {
        Ingresso[] ingressos = new Ingresso[2];
        ingressos[0] = new MeiaEntrada("Divertida Mente", 40, "carteira 123");
        ingressos[1] = new Vip("Duna", 40, "A");

        for (int i = 0; i < ingressos.length; i++) {
            System.out.println(ingressos[i].valorFinal());
        }

        System.out.println(ingressos[0].resumo());
        System.out.println(ingressos[0].resumo(true));
    }
}
