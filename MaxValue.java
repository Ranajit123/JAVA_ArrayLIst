import java.util.ArrayList;
public class MaxValue {
  static int findMaxValue(ArrayList<Integer> arr){
    int maxValue = Integer.MIN_VALUE;
    for(Integer nums : arr){
      if(maxValue<nums){
        maxValue = nums;
      }
    }
    return maxValue;
  }
  public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<>();
    List.add(1);
    List.add(3);
    List.add(5);
    List.add(9);
    List.add(6);
    List.add(7);
    System.out.println(findMaxValue(List));
  }
}