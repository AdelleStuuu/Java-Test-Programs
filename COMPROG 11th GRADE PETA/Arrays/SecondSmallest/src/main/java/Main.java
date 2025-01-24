import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 5, 3, 4, 5, 2, 7, 8, 9, 10};
    Arrays.sort(arr);

    int secSml = arr[1];
    System.out.println("Second smallest element: " + secSml);

  }
}