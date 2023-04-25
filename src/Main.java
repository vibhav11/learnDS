import learn.basic.sorting.SelectionSort;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! \n");
        int[] arr = {2,4,3,1,4,5};
        SelectionSort s = new SelectionSort();
        s.sort(arr);
        printArray(arr);
    }
    public  static void printArray(int[] inputArray) {
        // display array elements
        for (int element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}