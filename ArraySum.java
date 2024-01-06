import java.util.ArrayList;
public class ArraySum {
  public static int elementSum(ArrayList<Integer> arr){
    int sum = 0;
    for(int i=0; i<arr.size(); i++){
      sum += arr.get(i);
    }
    return sum;
  }
  public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<>();
    List.add(10);
    List.add(20);
    List.add(30);
    List.add(40);
    System.out.println(elementSum(List));
  }
}