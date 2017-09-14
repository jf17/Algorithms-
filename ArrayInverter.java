package com.jf17.Algorithms;

/**
 * This class 
 * @author Aleksey
 */

// Алгоритм переставляет местами елементы массива 

public class ArrayInverter {

    public int[] invert(int [] data){

        for(int i = 0; i<data.length/2; i++){

            int tmp =data[i];
            data[i] = data[data.length-1-i];
            data[data.length-1-i]=tmp;

        }
            return data;
    }
}
