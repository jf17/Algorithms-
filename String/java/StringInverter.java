
package com.jf17.Algorithms;

/**
 * This class 
 * @author Aleksey
 */

// Алгоритм переставляет местами елементы массива строки .

public class StringInverter {

    public String invert (String str){

        char[] data =str.toCharArray();
        // Так как строка не изменаемый елемент , создаём массив char[]
        
        for (int i=0; i< data.length/2;i++){
            char tmp= data[i];
            data[i]=data[data.length -1 -i];
            data[data.length -1 -i] = tmp;
        }

        return new String(data);
        //создаём новую строку из массива char[]
    }

}
