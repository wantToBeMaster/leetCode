package com.hw.solution;

import java.util.Arrays;

/**
 * Created by huwei on 2020/12/25.
 */
public class Test455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int max = 0;
        while(i<g.length&&j<s.length){
            if (s[j]>=g[i]){
                i++;
                max++;
            }
            j++;
        }
        return max;
    }
}