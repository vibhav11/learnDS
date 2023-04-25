package learn.basic.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] inputArray){

        for (int i = 0; i < inputArray.length-1; i++) {
            int min = i;
            for (int j=i+1;j<= inputArray.length-1;j++){
                if(inputArray[j]<inputArray[min])
                    min=j;
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min]=temp;
        }
    }
}
