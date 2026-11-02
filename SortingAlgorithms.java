
package sortingalgorithms;


public class SortingAlgorithms {

    
    public static void main(String[] args) {
       

    int N = 100000;

    int[] random = Arraygenertor.randomArray(N);

    int[] reverse = Arraygenertor.reverseArray(N);

    int[] partial = Arraygenertor.partialArray(N);

    int[] sorted = Arraygenertor.sortedArray(N);

    int[][] arrays = {
        random,
        reverse,
        partial,
        sorted
    };

    long[][] times = new long[5][4];

    for (int i = 0; i < 5; i++) {

        for (int j = 0; j < 4; j++) {

            times[i][j] =
                Benchmark.calculateTime(arrays[j], i);
        }
    }

    Results.printResults(times);
}
}
