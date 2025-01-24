// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 4, 5, 4, 5, 7, 6, 4, 7};
    int total = 0;
    
    for (int i=0;i<numbers.length; i++) {
      total += numbers[i];
    }
    int average = total / numbers.length;
    System.out.println("Average: " + average);
  }

}