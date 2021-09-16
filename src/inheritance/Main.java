package inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        Host host = new Host();
        host.getAnimals()[0] = cat;
        host.getAnimals()[1] = dog;
        System.out.println(host);
        Cat cat1 = (Cat) host.getAnimals()[1];
        cat1.meow();
//        System.out.println(dog.getName());
//        System.out.println(cat.getName());
//        dog.setName("dog1");
//        System.out.println(dog.getName());
    }
}
