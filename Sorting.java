import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(9);
    list.add(0);
    /* "Collections" is a function use for sorting and "Collection" is a interface it gives error if we try to sort using collection */
    Collections.sort(list); // assending order
    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder()); //desending order
    System.out.println(list);
  }
}
