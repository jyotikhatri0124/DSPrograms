package org.example;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args){

        String str="bbbbb";
        findValidSubString(str);

    }

    private static void findValidSubString(String str) {
        String subString="";
        String maxSubString="";
        for(int i=0;i<str.length();i++){
            subString="";
            for(int j=i;j<str.length();j++){
                subString+=str.charAt(j);

                boolean result=verifyValidString(subString);
                if(result && maxSubString.length()<subString.length()){
                    maxSubString=subString;

                }
            }
        }
        System.out.println(maxSubString);
    }

    private  static boolean verifyValidString(String str){

        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                return false;
            }else{
                map.put(str.charAt(i),1);
            }
        }

        return true;

    }
}
