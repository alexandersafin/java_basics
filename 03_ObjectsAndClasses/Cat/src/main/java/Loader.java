
public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = getKitten();
        Cat cat7 = getKitten();
        Cat cat8 = getKitten();
        Cat cat9 = new Cat();
        Cat cat10 = Cat.copy(cat9);
        System.out.println("Initial quantity cat's: " + Cat.getCount());

        System.out.println("==================================");

        System.out.println("Cat1 weight: " + cat1.getWeight());
        System.out.println("Cat2 weight: " + cat2.getWeight());
        System.out.println("Cat3 weight: " + cat3.getWeight());
        System.out.println("Cat4 weight: " + cat4.getWeight());
        System.out.println("Cat5 weight: " + cat5.getWeight());

        System.out.println("==================================");

        System.out.println("Cat6 weight: " + cat6.getWeight());
        System.out.println("Cat7 weight: " + cat7.getWeight());
        System.out.println("Cat8 weight: " + cat8.getWeight());

        System.out.println("=================================");

        System.out.println("Cat9 weight: " + cat9.getWeight());
        System.out.println("Cat10 weight: " + cat10.getWeight());

        System.out.println("=================================");

        cat1.feed(10.0);
        cat2.feed(15.0);
        System.out.println("Cat1 weight: " + cat1.getWeight());
        System.out.println("Cat2 weight: " + cat2.getWeight());

        System.out.println("=================================");

        System.out.println("Condition cat1 before feeding: " + cat1.getStatus());

        while (cat1.getWeight() < 9000) {
            cat1.feed(100.0);
        }
        System.out.println("Condition cat1 after feeding: " + cat1.getStatus());
        cat1.feed(100.0);

        System.out.println("=================================");

        System.out.println("Condition cat2 before meow: " + cat2.getStatus());
        while (cat2.getWeight() > 1000) {
            cat2.meow();
        }
        System.out.println("Condition cat2 after meow: " + cat2.getStatus());

        System.out.println("=================================");

        cat3.feed(150.0);
        cat3.feed(100.0);
        System.out.println(cat3.getAllEating());

        System.out.println("=================================");

        System.out.println("Cat4 weight before pee: " + cat4.getWeight());
        cat4.pee(20.0);
        System.out.println("Cat4 weight after pee: " + cat4.getWeight());
        cat4.pee(20.0);
        cat4.pee(60.0);
        System.out.println("Cat4 weight after pee: " + cat4.getWeight());

        System.out.println("=================================");

        System.out.println("Final quantity cat's: " + Cat.getCount());
    }

    private static Cat getKitten() {
        return new Cat(1100);
    }
}