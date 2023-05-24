public class Main {

    public static void main(String[] adams, String String) {

        // objetos

        CatClass cat1 = new CatClass("Penélope", "frajola", 30, 7);
        DogHeran doguinho1 = new DogHeran("Bento", "branco e prata", 40, 6, String);

        // métodos
        cat1.soar();
        doguinho1.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(doguinho1);
        System.out.println(doguinho1.getHumor());

    }
}
