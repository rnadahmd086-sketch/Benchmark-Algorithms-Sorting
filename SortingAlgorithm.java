/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Random;

class Arraygenertor {
    static Random r = new Random();

public static int[] randomArray(int n) {

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = r.nextInt(1000000);
    }

    return arr;
}

public static int[] reverseArray(int n) {

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = n - i;
    }

    return arr;
}

public static int[] partialArray(int n) {

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }

    for (int i = 0; i < n / 5; i++) {

        int index = r.nextInt(n);

        arr[index] = r.nextInt(1000000);
    }

    return arr;
}

public static int[] sortedArray(int n) {

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }

    return arr;
}

}
