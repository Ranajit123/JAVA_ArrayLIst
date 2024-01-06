import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MinMaxSum {
  static void findMaxMinSum(List<Integer> arr){
    Collections.sort(arr);
    long sum = 0;
    for(Integer nums: arr){
      sum += nums;
    }
    System.out.println("sum: "+sum);
    long minSum = sum - arr.get(arr.size()-1);
    long maxSum = sum - arr.get(0);
    System.out.println("minSum: "+minSum);
    System.out.println("maxSum: "+maxSum);
  }
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(256741038);//256741038 623958417 467905213 714532089 938071625
    list.add(623958417);
    list.add(467905213);
    list.add(714532089);
    list.add(938071625);
    findMaxMinSum(list);
  }
}
