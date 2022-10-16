import java.util.*;

// ArrayList 사용
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                answer.add(arr[i]);
            } 
        }
            Collections.sort(answer);
        
            if (answer.size() == 0) {
             int [] result = new int [1];
            result[0]=-1;
            return result;
        } else {
             int [] result = new int[answer.size()];
            for(int i=0;i<answer.size();i++){
                result[i] = answer.get(i);
            }
            return result;

            }
            }
    
    }

// 배열만 사용
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
      int[] temp = arr.clone();
                Arrays.sort(temp);
        int min =temp[0];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                list.add(arr[i]); // list에 값을 넣고
            }
        }
        
        int[] answer;
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {        
            answer[i] = list.get(i);  // list(i)의 값을 빼서 배열 answer에 대입.
        }
        }
        
        
        return answer;
    }
}