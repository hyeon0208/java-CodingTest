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
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                answer[cnt]=arr[i];
                cnt++;
            }
        }
        
        Arrays.sort(answer);
        
        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}