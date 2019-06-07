package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author bingqiong.cbb
 * @date 2019-05-21 00:09
 **/
public class Solution {
    public int reverseT(int x) {
        ArrayList al = new ArrayList();
        int t = 1;
        if(x/10 == 0){
            return x;
        }
        if(x<0){
            t = -1;
        }
        while(x/10 != 0){
            al.add(x%10);
            x = x/10;
        }
        al.add(x);
        System.out.print(al);
        int  getZero = (int) al.get(0);
        while(getZero == 0){
            al.remove(0);
            getZero = (int) al.get(0);
        }
        System.out.println(al);
        return 0;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        s.reverseT(134500);
    }
}

