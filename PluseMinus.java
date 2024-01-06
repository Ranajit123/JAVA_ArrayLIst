import java.util.ArrayList;
 public class PluseMinus {
  static void ration(ArrayList<Integer> arr){
    int posCount = 0;
    int negCount = 0;
    int zeroCount = 0;
    for(Integer nums: arr){
      if(nums > 0){
        posCount++;
      }else if(nums < 0){
        negCount++;
      }else{
        zeroCount++;
      }
    }
    System.out.println(String.format("%.6f", (double)posCount/arr.size()));
    System.out.println(String.format("%.6f", (double)negCount/arr.size()));
    System.out.println(String.format("%.6f", (double)zeroCount/arr.size()));
  }
  public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<>();
    List.add(-4);
    List.add(3);
    List.add(-9);
    List.add(0);
    List.add(4);
    List.add(1);
    ration(List);

  }
 }
