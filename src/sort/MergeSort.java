/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author rfrodrigues
 */
public class MergeSort {
    
    public void mergeSort (int[] array){
        int n = array.length;
        
        //CASO BASE
        if (n<2) return;
        
        int meio = n/2;
        int[] esquerda = Arrays.copyOfRange(array, 0, meio);
        int[] direita = Arrays.copyOfRange(array, meio, n);
        
        mergeSort(esquerda);
        mergeSort(direita);
        merge(esquerda,direita,array);
        
        
    }
    
    private void merge(int[] esquerda, int[]direita,int[] arrayFinal){
        int nEsquerda = esquerda.length;
        int nDireita = direita.length;
        
        int indiceEsquerda = 0;
        int indiceDireita = 0;
        int indiceArray = 0;
        
        while (indiceEsquerda < nEsquerda && indiceDireita < nDireita) {
            if(esquerda[indiceEsquerda] <= direita[indiceDireita]) {
                arrayFinal[indiceArray] = esquerda[indiceEsquerda];
                indiceEsquerda++;
            } else {
                arrayFinal[indiceArray] = direita[indiceDireita];
                indiceDireita++;
            }
            indiceArray++;
        }
        
        while (indiceEsquerda < nEsquerda) {
            arrayFinal[indiceArray] = esquerda[indiceEsquerda];
            indiceEsquerda++;
            indiceArray++;
        }
        
        while (indiceDireita < nDireita) {
            arrayFinal[indiceArray] = direita[indiceDireita];
            indiceDireita++;
            indiceArray++;
        }
        
    }
    
}
