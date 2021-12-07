package com.hw.solution;

/**
 * Created by huwei on 2020/12/24.
 */
public class Test135 {
    public static int candy(int[] ratings) {
        if(ratings.length==0) return 0;
        int[] ints = new int[ratings.length];
        ints[0] = 1;
        for(int i = 1;i < ratings.length; i++){
            if (ratings[i]>ratings[i-1])
                ints[i] = ints[i-1]+1;
            else
                ints[i] = 1;
        }
        for (int i = ratings.length-1;i>0;i--){
            if (ratings[i]<ratings[i-1]&&ints[i-1]<=ints[i]){
                ints[i-1] = ints[i]+1;
            }
        }

        int sum = 0;
        for (int i: ints){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int candy = candy(new int[]{1, 3,4,5, 2});
        System.out.println(candy);
    }
}
