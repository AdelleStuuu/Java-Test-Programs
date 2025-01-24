// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
      System.out.println("current total: " + total);
    }
    System.out.println("final total: " + total);
  }
}