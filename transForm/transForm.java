class Solution {
    public int solution(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        String n3 = Integer.toString(n,3);
        stringBuffer.append(n3);
        stringBuffer.reverse();
        String sn = String.valueOf(stringBuffer);
        int rn = Integer.parseInt(sn, 3);
        return rn;
    }
}