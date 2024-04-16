class Solution {
    public int[] solution(int[] answers) {
        //노가다 버전
        int num1 = 1;
        int num2patternCount = 0;
        int num3patternCount = 0;
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int num1Total = 0;
        int num2Total = 0;
        int num3Total = 0;
        int[] answer;

        for(int i = 0; i < answers.length; i++){
            if(num1 == answers[i]){
                num1Total++;
            }

            num1++;
            if(num1 == 6){
                num1 = 1;
            }
        }

        for(int i = 0; i < answers.length; i++){
            if(num2[num2patternCount] == answers[i]){
                num2Total++;
            }

            num2patternCount++;
            if(num2patternCount == num2.length){
                num2patternCount = 0;
            }
        }

        for(int i = 0; i < answers.length; i++){
            if(num3[num3patternCount] == answers[i]){
                num3Total++;
            }

            num3patternCount++;
            if(num3patternCount == num3.length){
                num3patternCount = 0;
            }
        }

        if(num1Total > num2Total){
            if(num1Total > num3Total){
                 answer = new int[1];
                answer[0] = 1;
            }else if(num1Total == num3Total){
                 answer = new int[2];
                answer[0] = 1;
                answer[1] = 3;
            }else{
                 answer = new int[1];
                answer[0] = 3;
            }
        }else if(num1Total == num2Total){
            if(num1Total > num3Total){
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 2;
            }else if(num1Total == num3Total){
                answer = new int[3];
                answer[0] = 1;
                answer[1] = 2;
                answer[2] = 3;
            }else{
                 answer = new int[1];
                answer[0] = 3;
            }
        }else{
            if(num2Total > num3Total){
                 answer = new int[1];
                answer[0] = 2;
            }else if(num2Total == num3Total){
                 answer = new int[2];
                answer[0] = 2;
                answer[1] = 3;
            }else{
                 answer = new int[1];
                answer[0] = 3;
            }
        }
        return answer;
    }
}