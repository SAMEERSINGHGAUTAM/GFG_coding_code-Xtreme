import java.util.*;

public class Question1 {

  public static int setBits(int N) {
    int i = 0, count = 0, a = 0;
    while(N>1) {
      a = N%2;
      if(a==1) {
        count++;
      }
      N /=2;
    }
    count +=1;
    return count;
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter an integer greater than 1 and less than 110");
     int N = sc.nextByte();
     if(N>=1 && N<110) {
      System.out.println(setBits(N));
     } else {
      System.out.println("Enter the valid input");
     }

  }
}