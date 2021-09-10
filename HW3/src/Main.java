public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> boxA = new Box<>(apple1, apple2, apple3);
        Box<Orange> boxO = new Box<>(orange1, orange2, orange3);

        System.out.println(boxA.compare(boxO));
        System.out.println("Вес коробки с яблоками: " + boxA.getWeight());

        boxA.add(apple4);
        System.out.println("Вес коробки с апельсинами: " + boxO.getWeight());


        Box<Orange> boxO1 = new Box<>();
        boxO.change(boxO1);
        System.out.println("Вес коробки с апельсинами: " + boxO1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxO.getWeight());

        System.out.println("Вес коробки с яблоками: " + boxA.getWeight());
    }
}