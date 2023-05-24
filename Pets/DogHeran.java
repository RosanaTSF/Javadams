public class DogHeran extends pets {
    static int numberDoguinhos;

    public DogHeran(String nome, String cor, int altura, double peso, String string) {
        super(nome, cor, altura, peso);
    }

    @Override
    public void soar() {
        System.out.println("au au au");
    }

    public void setHumor(String string) {
    }

    public char[] getHumor() {
        return null;
    }
}
