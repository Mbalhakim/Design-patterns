import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Object 1 ");

        singleton1.PrintSingletonObject();

        System.out.println("Object 2 ");

        singleton2.PrintSingletonObject();


    }
}