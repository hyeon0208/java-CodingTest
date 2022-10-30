import java.util.*;

public class Solution {
    public int[] solution(int []arr) {  
        List<Integer> list = new ArrayList<>();
        
        int num = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != num) {
            list.add(arr[i]);
            }
            num = arr[i];
        }

         return list.stream().mapToInt(i->i).toArray();
    }
}