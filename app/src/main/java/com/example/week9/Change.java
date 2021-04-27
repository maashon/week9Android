package com.example.week9;

import android.util.Log;

public class Change {

    public String fun1(String inp){
        int len=inp.length();
        String output="";
        char t;
        for(int i=0;i<len;i++){
        t=inp.charAt(i);
        if(t=='i'){
            t='g';
        }else if (t=='I'){
            t='G';
        }
        else if (t=='d'){
            t='7';
        }else if (t=='D'){
            t='7';
        }else if (t=='g'){
            t='a';
        }else if (t=='G'){
            t='A';
        }
            output+=t;


        }

       return  output;

    }
    public  int fun2(String inp){
        int sum=0;
        for(int i=0;i<inp.length();i++){
            sum+=inp.charAt(i);
        }

       return sum;
    }
}
