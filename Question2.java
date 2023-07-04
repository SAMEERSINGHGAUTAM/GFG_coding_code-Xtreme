import java.util.*;
// to find ith bit is set bit or not.
public class Question2 {

  public static boolean kthBit(int n, int k) {
    int count = 0, i = 1, a =1;
    while(n>1) {
      a = n%2;
      n /=2;
      if(count == k) {
        break;
      }
      
      count++ ;
    }

    // while(i <= (count-k)) {
    //  a = n%2;
    //   if(i == (count-k)) {
    //     break;
    //   }
    //   n /= 2;
    //   i++;
    // } 
       if(a == 1) {
          return true;
        } else {
          return false;
        }
  
  
  public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number:");
    int  n = sc.nextInt();
    System.out.println("Enter the kth bit from LSB:");
    int  k = sc.nextInt();
    boolean bit = kthBit(n,k);
    System.out.println(bit);
  }
}
}