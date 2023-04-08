package HASHING;
import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1, 5, 5};
        int num;
        int size = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
          /*  if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);*/
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

        }

        //Set<Integer> keySet = hm.keySet();
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > size) {
                System.out.println(key);
            }


        }
    }
}


