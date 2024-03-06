package animal;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Gato", "Bonny", '4');

        System.out.println(a1.getnome());
        System.out.println(a1.getqtdePatas());
        System.out.println(a1.getespecie());
    }
}
