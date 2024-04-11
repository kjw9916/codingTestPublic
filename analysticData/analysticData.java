import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
                ArrayList<int[]> arrList = new ArrayList<>();

        for(int i = 0; i<data.length; i++){
            if(ext.equals("code")){
                if(data[i][0] < val_ext){
                    arrList.add(data[i]);
                }
            }else if(ext.equals("date")){
                if(data[i][1] < val_ext){
                    arrList.add(data[i]);
                }
            }else if(ext.equals("maximum")){
                if(data[i][2] < val_ext){
                    arrList.add(data[i]);
                }
            }else{
                if(data[i][3] < val_ext){
                    arrList.add(data[i]);
                }
            }
        }
        
        int[][] answer = new int[arrList.size()][4];
        
        if(sort_by.equals("code")){
            arrList.sort(Comparator.comparingInt(o -> o[0]));
        }else if(sort_by.equals("date")){
            arrList.sort(Comparator.comparingInt(o -> o[1]));
        }else if(sort_by.equals("maximum")){
            arrList.sort(Comparator.comparingInt(o -> o[2]));
        }else{
            arrList.sort(Comparator.comparingInt(o -> o[3]));
        }
        
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}