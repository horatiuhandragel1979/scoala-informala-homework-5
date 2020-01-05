package RemoveDuplicate;

import java.util.Arrays;
import java.util.Scanner;

/**
 * the programm removes all the duplicates found in an int[] array
*
*@author Horatiu Handragel
 */

public class DuplicateRemoval {
    public static void main(String[] args) {

        //introducem de la tastatura sirul de numere intregi

        System.out.println("Introdu lungimea sirului: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Introdu numarul " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);       // aseaza in ordine crescatoare toate elementele unei matrice
        System.out.println("Acesta este sirul dupa eliminarea dublurilor:");
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        //afisam elementele sirului, fara dubluri

        for (int i = 0; i < length; i++)
            System.out.println(arr[i] + "  ");
    }

    /*
    metoda identifica dublurile din sirul de numere
     */

    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
}
