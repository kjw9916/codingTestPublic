package calSflAmnt;
class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;

        for(int i = 1; i<count+1; i++){
            total += price * i;
        }

        if(money-total >= 0){
            return 0;
        }else{
            return -(money-total);
        }
    }
}