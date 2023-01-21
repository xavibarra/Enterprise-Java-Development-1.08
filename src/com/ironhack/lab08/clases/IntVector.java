package com.ironhack.lab08.clases;

import com.ironhack.lab08.interfaces.IntList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Array;

public class IntVector implements IntList {
    int index=0;
    int[] arr=new int[20];
    public IntVector() {
        this.arr =arr;
    }

    public void add(int value){

        if (arr.length==index) {
            int newArr[]=new int[arr.length*2];
            for (int i=0;i<arr.length;i++){
                newArr[i]=arr[i];
                index++;

            }
            this.arr=newArr;
        }
        arr[index]=value;
        index++;
    }

    public void get(int id) {

    }
}
