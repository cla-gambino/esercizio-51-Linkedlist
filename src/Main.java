import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruit = new LinkedList<>();

        fruit.add(new Fruit("Arancia"));
        fruit.add(new Fruit("Banana"));
        fruit.add(new Fruit("Fragola"));
        fruit.add(new Fruit("Anguria"));
        fruit.add(new Fruit("Mandarino"));
        fruit.add(new Fruit("Mela"));
        fruit.add(new Fruit("Ciliegia"));
        fruit.add(new Fruit("Albicocca"));

        System.out.println("lista di frutti: " + fruit);

        fruit.addFirst(new Fruit("Ananas"));
        fruit.addLast(new Fruit("Kiwi"));

        System.out.println("lista di frutti aggiornata: " + fruit);

    }
}