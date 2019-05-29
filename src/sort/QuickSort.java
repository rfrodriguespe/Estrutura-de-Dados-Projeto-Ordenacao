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
public class QuickSort {
     
    private int array[];
    private int tamanho;
 
    public void sort(int[] inoutArray) {
         
        if (inoutArray == null || inoutArray.length == 0) {
            return;
        }
        this.array = inoutArray;
        tamanho = inoutArray.length;
        quickSort(0, tamanho - 1);
    }
 
    private void quickSort(int indiceMenor, int indiceMaior) {
         
        int i = indiceMenor;
        int j = indiceMaior;
        int pivot = array[indiceMenor+(indiceMaior-indiceMenor)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (indiceMenor < j)
            quickSort(indiceMenor, j);
        if (i < indiceMaior)
            quickSort(i, indiceMaior);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
