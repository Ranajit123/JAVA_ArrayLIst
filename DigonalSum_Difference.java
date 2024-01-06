import java.util.ArrayList;
public class DigonalSum_Difference {
  static int findSumDiff(ArrayList<ArrayList<Integer>> arr){
    int lrDigonalSum = 0;
    int rlDigonalSum = 0;
    for(int i=0; i<arr.size(); i++){
      ArrayList<Integer> curList = arr.get(i);
      for(int j=0; j<curList.size(); j++){
        if(i==j){
          lrDigonalSum += curList.get(i);
        }else if(i+j == (curList.size()-1)){
          rlDigonalSum += curList.get(j);
        }
      }
    }
    return lrDigonalSum-rlDigonalSum;
  }
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> List1 = new ArrayList<>();
    List1.add(1); List1.add(2); List1.add(3);

    ArrayList<Integer> List2 = new ArrayList<>();
    List2.add(4); List2.add(5); List2.add(6);

    ArrayList<Integer> List3 = new ArrayList<>();
    List3.add(7); List3.add(8); List3.add(9);

    mainList.add(List1);
    mainList.add(List2);
    mainList.add(List3);

    System.out.println(findSumDiff(mainList));
  }
}
