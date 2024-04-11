class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        // 시전 시간
        int duTime = bandage[0];
        
        // 초당 회복량
        int hPerSec = bandage[1];
        
        // 추가 회복량
        int addHeal = bandage[2];
            
        // 연속 성공 시간
        int curDuTime = 0;
        
        // 최대 체력
        int maxHealth = health;
            
        // 현재 체력
        int curHealth = health;  
                   
        // 완료 시간
        int endTime = attacks[attacks.length-1][0];
        
        // 공격 횟수
        int curAttackCount=0;
        
        // 공격 시간
        int attackTime = 0;
            
        //마지막 공격 시전 시간까지 돈다
        for(int time = 1; time <= endTime; time++){
            
            //처음에 공격 시전타임을 확인해서 저장한다
            if(time == 1){
                attackTime = attacks[0][0];
            }
            
            //공격 발동 시간이 되면
            if(time == attackTime){
                
                // 피해량을 입힌다
                curHealth -= attacks[curAttackCount++][1];
                
                // 현재 체력이 0 이하가 되면
                if(curHealth <= 0){
                    return -1;
                }
                
                // 발동시간 재설정
                if(curAttackCount < attacks.length){
                    attackTime = attacks[curAttackCount][0];
                }
                
                // 연속 성공 시간 리셋
                curDuTime = 0;
                
            }else{
                //연속 성공 시간 시작
                curDuTime++;
            
                curHealth += hPerSec;
                
                //현재 성공 횟수가 지속 시간과 같다면
                if(curDuTime == duTime){
                    
                    curHealth += addHeal;
                    
                    // 연속 성공 시간 리셋
                    curDuTime = 0;
                }
                
                if(curHealth > maxHealth) curHealth = maxHealth;
                
            }
        }
        
        return curHealth;
    }
}