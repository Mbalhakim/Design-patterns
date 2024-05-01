package Singleton;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class Singleton {
    private Integer[] numbers = {1,2,3,4,5,6,7,8,9};
    private List<Integer> listOfNumbers = Arrays.asList(numbers);
private static Singleton instance;
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    private Singleton(){
        System.out.println("Obecjt Created");
        Collections.shuffle(listOfNumbers);
        System.out.println(this.hashCode());

    }
    public void PrintSingletonObject(){
        for (Integer i : listOfNumbers){
            System.out.println(i.toString() + " ");
        }
        System.out.println();
    }


}
