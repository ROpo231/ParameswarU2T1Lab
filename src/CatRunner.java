public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jhon", 5, 10.5);
        cat1.introduce();
        cat1.printCatInfo();


        Cat cat2 = new Cat("Tom", 7, 15.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
