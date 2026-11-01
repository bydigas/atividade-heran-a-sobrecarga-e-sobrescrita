public class TesteAcademia {
    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[2];
        atletas[0] = new Corredor("Lia", 10);
        atletas[1] = new Nadador("Paulo", "crawl");

        for (int i = 0; i < atletas.length; i++) {
            System.out.println(atletas[i].apresentar());
        }

        System.out.println(atletas[0].registrarTempo(55.2));
        System.out.println(atletas[0].registrarTempo(58, "100m"));
    }
}
