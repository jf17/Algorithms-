package com.jf17.Algorithms;

/**
 * This class implements BubbleSort
 * @author Aleksey
 */
 
public class BubbleSort {
        
    
    int array[];
    
    int sortedArray[];
    final  int sizeArray ;
    boolean swap;
    final int last;
    int iterations;
    
    public BubbleSort(int arrayInt[]){
        
         array = arrayInt;
         sizeArray = array.length;
         last = sizeArray-1;
         iterations = 0;
         
    }
    
    
    
    public int[] getSortedArray(){
    
        sort();
    
    return sortedArray;
    }
    
     public int getIterations(){
    
        if(sortedArray==null){
        sort(); return iterations;}
        else {return iterations;}
    
    }
    
    
    private void sort(){
    
        if(sortedArray==null){
   
        		//Sorting
		do
     		{
          		swap = false;
          		for (int count = 0; count < last; count++)
          		{
               			if (array[count] > array[count + 1])
               			{
                    			int temp = array[count];
                    			array[count] = array[count + 1];
                    			array[count + 1] = temp;
                    			swap = true;
               			}
          		}
			
                        
                        iterations++;
          		
                    } while (swap);
        
        
    
    
        sortedArray = array;
    }else{}
    }
    
    
}
