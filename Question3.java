import java.util.*;

public class Question3 {
  public static int setSetBits(int x, int y, int l, int r) {
    int a =0 , b = 0;
     l -= 1 ;
     r -= 1;
    int i = 0, num1 =0;
    int c = (x>y) ? (x) : (y);

    while(c>=1) {
      b = (y>=1) ? (y % 2) : 0;
      y /= 2;
      a = (i>=l && i <=r && b==1) ? b : (x >=1) ? (x % 2) : 0;
      x /=2;
      c /=2;
      // y /=2;
      
      num1 += a*(Math.pow(2,i));
      
      i++;


    }
    // if(y==l) {
    //   return x;
    // }

    // while(c>=1) {
    //   b = (y>=1) ? (y % 2) : 0;
    //   num2 += b*(Math.pow(2,i));
    //   a = ((num2>=l) && (num2<=r) && (b==1)) ? b : (x >=1) ? (x % 2) : 0 ;
    //   num1 += a*(Math.pow(2,i));
    //   x /=2;
    //   y /=2;
    //   c /=2;
    //   if(b==1) {
    //     System.out.println(num2);
    //   }
    //   i++;
    // } 

    return num1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x = sc.nextInt();
    System.out.println("Enter the value of y:");
    int y = sc.nextInt();
    System.out.println("Enter the range[L,R] such that 1<=L<=R<=31:\nFirst enter for L: ");
    int l = sc.nextInt();
    System.out.println("Enter for R:");
    int r = sc.nextInt();

    System.out.println(setSetBits(x,y,l,r));
  }
}