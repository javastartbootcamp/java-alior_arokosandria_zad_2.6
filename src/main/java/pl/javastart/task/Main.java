package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println("Czy liczba 10 jest parzysta:" + methods.isEven(10));
        System.out.println("Czy liczba 11 jest parzysta:" + methods.isEven(11));
        System.out.println("Czy liczba 13 jest nieparzysta:" + methods.isOdd(13));
        System.out.println("Czy liczba 4 jest nieparzysta:" + methods.isOdd(4));
        System.out.println("Pole koła dla r = 3 jest równy: " + methods.circleField(3));
        System.out.println("Kwadrat liczby 6 jest równy: " + methods.power(6));
    }
}
