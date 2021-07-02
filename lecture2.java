import java.util.*;
public class lecture2{
  public static void main(String[] args) {
    // int n=25;
    // if(n>=21){
    //   System.out.println("Can vote");
    //   System.out.println("Can work");
    // }
    // else if(n>=18){
    //   System.out.println("Can vote");
    // }
    // else{
    //   System.out.println("only study");
    // }


    // int n=158805,count=0;
    // while(n!=0){
    //   n=n/10;
    //   count=count+1;
    // }
    // System.out.println(count);

    Scanner sc= new Scanner(System.in);
    int n,count=0;
    n= sc.nextInt();
    while(n!=0){
      n=n/10;
      count=count+1;
    }
    System.out.println(count);
    
  }
}