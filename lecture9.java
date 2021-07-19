import java.util.*;
public class lecture9 {
  public static void checkBit(int num,int m){
    int mask=(1<<(m-1)); 
    if((mask&num)!=0){
      System.out.println("On bit");
    }
    else{
      System.out.println("Off bit");
    }
  }
  public static void setOnBit(int num,int m){
    int mask=(1<<(m-1));
    int ans= (num|mask);
    System.out.println(ans);
  }
  public static void setOffBit(int num,int m){
    int mask=(1<<(m-1));
     int ans= (num&(~mask));
     System.out.println(ans);
  }
  public static void toggleBit(int num,int m){
    int mask=(1<<(m-1));
     int ans= (num^mask);
     System.out.println(ans);
  }
  public static void q1(){
    int arr[]={56,4,34,76,4,56,76};
    int ans=0;
    for(int ele: arr){
      ans= (ans^ele);
    }
    System.out.println(ans);
  }
  public static void q2(){
    int arr[]={22,56,45,56,34,22};
    int ans=0;
    for(int ele: arr){
      ans= (ans^ele);
    }
    int cnt=0;
    int ans1= ans;
    while(ans1%2!=1){
      cnt++;
      ans1=ans1/2;
    }
    int mask=(1<<cnt);
    int ans2= 0;
    for(int ele: arr){
      if((mask&ele)==0){
        ans2= (ans2^ele);
      }
    }
    System.out.println(ans2+" "+(ans^ans2));
  }
  public static void bitmanipulation(){
    int num=13,m=3;
    // checkBit(num,m);
    // setOnBit(num,m);
    // setOffBit(num,m);
    // toggleBit(num,m);
    // q1();
    // q2();
  }
  public static void stringWork(){
    // String s1="Hello";
    // String s2=new String("Hello");
    // System.out.println(s1+" "+s2);

    // String s3="Hello";
    // if(s1.equals(s3)){
      // System.out.println("s1 is equal to s3");
    // }
    // if(s1==s2){
    //   System.out.println("s1 is equal to s2");
    // }
    // else{
    //   System.out.println("s1 is not equal to s2");
    // }
    // System.out.println(s1);

    String s="CodeForCause";
    // System.out.println(s.charAt(4));
    char ch=s.charAt(4);
    // System.out.println(Character.isUpperCase(ch));
    // System.out.println(Character.isLowerCase(ch));
    // ch= Character.toUpperCase(ch);
    // ch= Character.toLowerCase(ch);
    // System.out.println(ch);

    // System.out.println(s.length());
    // System.out.println(s.substring(4));
    // System.out.println(s.substring(4,7));

    // if(s.contains("oC")){
    //   System.out.println("Yes");
    // }
    // else{
    //   System.out.println("No");
    // }

    // s=s.replace('C', 'G');
    // System.out.println(s);

    // char arr[]= s.toCharArray();
    // System.out.println(arr[5]);

    StringBuilder sb = new StringBuilder("CodeFor");
    System.out.println(sb);
    sb.append("Cause");
    System.out.println(sb);
    // sb.setCharAt(1, 'a');
    // System.out.println(sb);
    // sb.deleteCharAt(1);
    // System.out.println(sb);
    // sb.insert(1, "abc");
    // System.out.println(sb);
    String ans= sb.toString();
    System.out.println(ans);
  }
  public static void main(String[] args) {
  //  bitmanipulation();
  stringWork();
  }
}
