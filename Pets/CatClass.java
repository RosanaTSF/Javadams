public class CatClass extends pets {

    public CatClass(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    static int numberCats;

    // atributos

    // Construtores

    // métodos
    public static int getNumberCats() {
        return numberCats;
    }

    public static void setNumberCats(int numberCats) {
        CatClass.numberCats = numberCats;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
    }

public String interagir(String acao) {

        switch (acao){
            case "carinho": this.humor = "Happy!";break;
            case "não brinque": this.humor = "Miauú Miauú Miaúú!";break;
            case "zZZ": this.humor = "Angry!";break;

        }
        return this.humor;
    }

    public void soar() {
        System.out.println("miau miau miau");
    
    }

}

