class Solution {
    public int solution(int[][] sizes) {
        int max1=0;
        int max2=0;

        for(int i = 0; i < sizes.length; i++)
            if(i == 0){
                if(sizes[i][0] > sizes[i][1]){
                    max1=sizes[i][0];
                    max2=sizes[i][1];
                }else{
                    max1=sizes[i][1];
                    max2=sizes[i][0];
                }
            }else {
                if (sizes[i][0] > sizes[i][1]) {
                    if(max1 < sizes[i][0]) {
                        max1 = sizes[i][0];
                    }
                    if(max2 < sizes[i][1]){
                        max2 = sizes[i][1];
                    }
                } else {
                    if(max1 < sizes[i][1]) {
                        max1 = sizes[i][1];
                    }
                    if(max2 < sizes[i][0]){
                        max2 = sizes[i][0];
                    }
                }
            }
            int result = max1 * max2;
            return result;
        }
        
}