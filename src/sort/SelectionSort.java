/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author rfrodrigues
 */
public class SelectionSort {
 
    public static int[] doSelectionSort(int[] array){
         
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) 
                    index = j;
      
            int smallerNumber = array[index];  
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }
}
