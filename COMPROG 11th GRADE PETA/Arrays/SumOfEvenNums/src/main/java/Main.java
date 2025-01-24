public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int total = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        total += array[i];
        System.out.println("Current Sum: " + total);
      }
    }

    System.out.println("The sum of even numbers: " + total);
   }
}