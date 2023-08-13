import java.util.*;

public class KeyWords {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // "add" function is use for add new element in arrayList
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    // System.out.println(list);
    /* add element in a index */
    list.add(1, 10);
    // System.out.println(list);

    /* "get" function is use for find the element of a index*/
    // int element= list.get(2);
    // System.out.println(element);

    /* "remove" function is use for remove a element of a index */
    list.remove(2);
    // System.out.println(list);

    /* "set" funtion set element at particular position */
    list.set(0, 2);
    // System.out.println(list);

    /* "contains" function find a value is present in arraylist or not */
    System.out.println(list.contains(15));

  }
}
