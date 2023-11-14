package code;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int count =0;
        int zerocount =0;
        for (int i=0; i<lottos.length; i++){
            for (int j=0; j<lottos.length; j++){
                if(lottos[i]==0){
                    zerocount ++;
                    break;
                }
                if(lottos[i]==win_nums[j]){
                    count++;
                    break;
                }
            }
        }
        
        int min = count;
        int max = count+ zerocount;
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}