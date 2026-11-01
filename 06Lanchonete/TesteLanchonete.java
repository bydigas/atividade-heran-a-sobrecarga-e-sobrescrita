public class TesteLanchonete {
    public static void main(String[] args) {
        Item[] itens = new Item[2];
        itens[0] = new Lanche("X-burguer", 18, 2);
        itens[1] = new Bebida("Suco", 8, 300);

        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].descrever());
        }

        System.out.println(itens[0].total());
        System.out.println(itens[0].total(2));
    }
}
