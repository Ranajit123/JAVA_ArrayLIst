import java.util.ArrayList;

public class Swap2Num {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    System.out.println(list);
    int temp1 = list.get(1);
    list.set(1, list.get(3));
    list.set(3, temp1);
    System.out.println(list);
  }
}
