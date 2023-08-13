import java.util.ArrayList;

public class PainSum1 {

  public static ArrayList<Integer> pairSum(ArrayList<Integer> list, int terget){
    ArrayList<Integer> newList = new ArrayList<>();
    int lp = 0; 
    int rp = list.size()-1;

    while(lp<rp){
      if(list.get(lp)+list.get(rp)==terget){
        newList.add(lp);
        newList.add(rp);
      }

      if(list.get(lp)+list.get(rp)<terget){
        lp++;
      }else{
        rp--;
      }
    }
    return newList;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(8);
    list.add(10);
    list.add(12);

    int target = 20;
    System.out.println(pairSum(list, target));
    

  }
}
