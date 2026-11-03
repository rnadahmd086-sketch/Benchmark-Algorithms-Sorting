package sortingalgorithms;


public class Results {
public static void printResults(long[][] times) {

    String[] names = {
        "Selection Sort",
        "Insertion Sort",
        "Bubble Sort",
        "Merge Sort",
        "Quick Sort"
    };

    String[] cases = {
        "Random",
        "Reverse",
        "Partial",
        "Sorted"
    };

    System.out.println();
    System.out.println("========== SORTING RESULTS ==========");

    System.out.printf("%-18s", "Algorithm");

    for (int i = 0; i < 4; i++) {
        System.out.printf("%15s", cases[i]);
    }

    System.out.println();

    for (int i = 0; i < 5; i++) {

        System.out.printf("%-18s", names[i]);

        for (int j = 0; j < 4; j++) {

            System.out.printf("%15d", times[i][j]);
        }

        System.out.println();
    }

    System.out.println();
    System.out.println("Time is in Microseconds (us)");
}
}