package InterViewBit;

import java.util.ArrayList;

public class Flip {
    public ArrayList<Integer> solution (String str){
        ArrayList ans = new ArrayList<>();

        int max=0;
        int tempStartIndex=0;
        int tempEndIndex=0;
        int startIndex=0, endIndex=0;
        int sum=0;

        for(int i=0;i<str.length();i++){
            tempEndIndex=i;
            if(str.charAt(i)==0){
                sum+=1;
            }
            else{
                sum-=1;
            }
            if(sum<0){
                sum=0;
                tempStartIndex=i+1;
            }
            if(max<sum){
                max=sum;
                startIndex=tempStartIndex;
                endIndex=tempEndIndex;
            }
        }
        if(max!=0){
            ans.add(startIndex+1);
            ans.add(endIndex+1);
        }
        return ans;
    }
}
