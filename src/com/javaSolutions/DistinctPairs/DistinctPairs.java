package com.javaSolutions.DistinctPairs;

import java.util.HashMap;

/**
 * Created by prasad on 2/20/2017.
 */
public class DistinctPairs {

    public int checkNumOfpairs(int[] iparray, int k){

        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean bmap[] = new boolean[50];

        for(int i = 0 ; i < iparray.length ; i++){
            int temp = k - iparray[i];

            if(!bmap[temp]){
                bmap[iparray[i]] = true;
            }
            else{
                if(!hm.containsKey(temp)||hm.containsValue(iparray[i])){
                    hm.put(iparray[i], temp);
                }
            }
        }
        return hm.size();
    }
}
