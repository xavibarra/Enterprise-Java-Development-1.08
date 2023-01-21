package com.ironhack.lab08.clases;

import com.ironhack.lab08.interfaces.IntList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Array;

public class IntArrayList implements IntList {
    int index=0;
    int[] arr=new int[10];
    public IntArrayList() {
        this.arr =arr;
    }
    public void add(int value){

        if (arr.length==index) {

            int longArr=new BigDecimal(arr.length*1.5f).setScale(0, RoundingMode.UP).intValue();
            int newArr[]=new int[longArr];
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
