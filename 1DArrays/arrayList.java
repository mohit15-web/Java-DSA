import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("fortuner");
        cars.add("scorpio");
        System.out.println("arrayList before sorting");
        System.out.print(cars+" ");
        System.out.println("arraylist after swapping");
        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        
    }
    
}
