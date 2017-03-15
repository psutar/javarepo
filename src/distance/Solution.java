package distance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static int[] solution(int[] T) {
        // write your code in Java SE 8
        int capital = 0;
        int tLength = T.length;
        int[] returnArray=new int[tLength-1];
        Map<Integer,ArrayList<Integer>> link = new HashMap<>();
        List<Integer> allValue = new ArrayList<>();
        for (int c = 0;c<tLength;c++){
        	int P = c;
        	int Q = T[c];
            if (P == Q ){
                capital=P;
                }
            allValue.add(Q);
            
            }
        for (int c = 0;c<tLength-1;c++){
        	int P = c;
        	int Q = T[c];
        	int linkCounter =0;
            if (P == Q ){
                capital=P;
                }
            if (P != Q ){
            	if(P == capital){
            		linkCounter++;
            		}
            	if(Q == capital){
            		linkCounter++;
            		}
            	if(allValue.contains(P)){
            		
            	}
                }
            returnArray[c]=linkCounter;
            
            }
        return returnArray;
        
    }
    
    public static void main(String args[]){
    	int[] arr=new int[10];
    	arr[0]=9;
    	arr[1]=1;
    	arr[2]=4;
    	arr[3]=9;
    	arr[4]=0;
    	arr[5]=4;
    	arr[6]=8;
    	arr[7]=9;
    	arr[6]=0;
    	arr[7]=1;
    	
    	int[] result = solution(arr);
    	System.out.println(result.hashCode());
    }
    }
