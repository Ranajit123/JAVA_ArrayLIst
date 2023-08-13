/* Algo
 * 2 point apporch will bw applied
 * STEP 1 -> Find the pivot point.
 * in a sorted array ith element is always < (i+1)th element, in 
 * Sorted Rotated Array avobe condition is not true, the pivot will be the largest value
 * 
 * STEP 2 -> lp = smallest value and rp = largest value
 * STEP 3 -> while(lp != rp){
 *             check the target value is found or not
 *             check condition and increment lp or decrement rp in rotated mainer using
 *             Modulo Arithmatic
 *              lp = (lp +1)%n
 *              rp = (n+rp-1)%n
 *              n is the size of list
 *           }
 */

import java.util.ArrayList;


public class PairSum2 {

  public static boolean findTargetSum(ArrayList<Integer> list, int target){
    int n = list.size();
    int lp = 0; 
    int rp = 0;
    for(int i=0; i<n; i++){
      if(list.get(i)>list.get(i+1)){
        rp = i;
        lp = i+1;
        break;
      }
    }

    while(lp != rp){
      int sum = list.get(lp)+list.get(rp);
      if(sum == target){
        return true;
      }
      if(sum < target){
        lp = (lp+1)%n;
      }else{
        rp = (n+rp-1)%n;
      }
      
    }

    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(12);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);

    int target = 26;
    System.out.println(findTargetSum(list, target));

  }
  
}
