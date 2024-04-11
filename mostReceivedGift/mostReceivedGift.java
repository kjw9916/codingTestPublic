import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, int[]> givers = new HashMap<>();
        HashMap<String, int[]> receivers = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            int[] giverList = new int [friends.length];
            int[] receiverList = new int [friends.length];
            for (int j = 0; j < gifts.length; j++) {
                String giver = gifts[j].split(" ")[0];
                String receiver = gifts[j].split(" ")[1];
                if(friends[i].equals(giver)){
                    for (int k = 0; k < friends.length; k++) {
                        if(friends[k].equals(receiver)){
                            receiverList[k] += 1;
                        }
                    }
                }
                if(friends[i].equals(receiver)){
                    for (int k = 0; k < friends.length; k++) {
                        if(friends[k].equals(giver)){
                            giverList[k] += 1;
                        }
                    }
                }
            }
            givers.put(friends[i],receiverList);
            receivers.put(friends[i],giverList);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            int total = 0;
            for (int j = 0; j < givers.get(friends[i]).length; j++) {
                total += givers.get(friends[i])[j];
                total -= receivers.get(friends[i])[j];
            }
            hashMap.put(friends[i],total);
        }
        System.out.println(hashMap);
        int max = 0;
        for (int i = 0; i < friends.length; i++) {
            int candidateNumber = 0;
            for (int j = 0; j < givers.get(friends[i]).length; j++) {
                if(j==i){
                    continue;
                }
                if(givers.get(friends[i])[j] - receivers.get(friends[i])[j] > 0){
                    candidateNumber++;
                }else if(givers.get(friends[i])[j] - receivers.get(friends[i])[j] == 0){
                    if(hashMap.get(friends[i]) - hashMap.get(friends[j]) > 0){
                        candidateNumber++;
                    }
                }
            }
            if(max < candidateNumber){
                max = candidateNumber;
            }
        }
        
        return max;
    }
}