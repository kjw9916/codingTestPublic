import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> intArr = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                intArr.add(arr[i]);
            }else if(i > 0) {
                if (arr[i] == arr[i - 1]) {

                } else {
                    intArr.add(arr[i]);
                }
            }
        }

        int[] arr2 = new int[intArr.size()];
        for(int j = 0; j < arr2.length; j++){
            arr2[j] = intArr.get(j);
        }
        
        return arr2;
    }
}