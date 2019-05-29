/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Scanner;
import static sort.InsertionSort.doInsertionSort;
import static sort.SelectionSort.doSelectionSort;

/**
 *
 * @author rfrodrigues
 */
public class OrdenacaoTeste {

    public static void main(String[] args) {
        int[] array = {10, 1, 2, 54, 6, 90, 88, 47, 22, 3};
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        boolean grafoCriado = false;
        do {

            System.out.println("\nPROJETO 04 - ORDENACAO\n");
            System.out.println("O array {10, 1, 2, 54, 6, 90, 88, 47, 22, 3}");
            System.out.println("será ordenado usando o algorimto à sua escolha");
            System.out.println("a) Insertion Sort");
            System.out.println("b) Selection Sort");
            System.out.println("c) Merge Sort");
            System.out.println("d) Quick Sort");
            System.out.println("e) Sair\n");
            System.out.print("Escolha sua opcao: ");

            String opcao = sc.next();

            switch (opcao) {
                case "a":
                    for (int i : doInsertionSort(array)) {
                        System.out.print(i);
                        System.out.print(", ");
                    }
                    
                    break;
                case "b":
                    for (int i : doSelectionSort(array)) {
                        System.out.print(i);
                        System.out.print(", ");
                    }
                    break;
                case "c":
                    MergeSort mms = new MergeSort();
                    mms.sort(array);
                    for (int i : array) {
                        System.out.print(i);
                        System.out.print(", ");
                    }
                    break;
                case "d":
                    QuickSort sorter = new QuickSort();
                    sorter.sort(array);
                    for (int i : array) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                    break;
                case "e":
                    System.out.println("OBRIGADO E ATE LOGO");
                    sair = true;
                    break;
                default:
                    System.out.println("\n\nOPCAO INVALIDA");
            }

        } while (sair != true);
    }

}
