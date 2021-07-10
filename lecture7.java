import java.util.*;
public class lecture7{
  public static void selectionSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int m= i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[m]){
          m= j;
        }
      }
      if(m!=i){
        int t= arr[m];
        arr[m]= arr[i];
        arr[i]= t;
      }
    }
    for(int ele: arr){
      System.out.println(ele);
    }
  }
  public static void arraylistWork(){
    ArrayList<Integer>al= new ArrayList<Integer>();
    System.out.println(al.size());
    
    al.add(98);
    al.add(12);
    al.add(80);
    al.add(17);

    // get
    int value= al.get(2); // arr[2]
    System.out.println(value);


    //set
    al.set(1, 51); //arr[1]= 51;
    System.out.println(al.size());

    al.remove(2);
    System.out.println(al.size());


    System.out.println(al);

    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
    System.out.println();
    
    for(int ele: al){
      System.out.println(ele);
    }

    //2d
    ArrayList<ArrayList<Integer>> al2= new ArrayList<>();
    System.out.println(al2);
    for(int i=0;i<=6;i++){
      al2.add(new ArrayList<Integer>());
    }
    System.out.println(al2);

    al2.get(2).add(79);
    al2.get(2).add(80);
    al2.get(2).add(9);
    al2.get(2).add(98);
    al2.get(1).add(19);
    al2.get(4).add(67);
    al2.get(4).add(1);

    al2.get(2).set(2, 90);
    System.out.println(al2);
  }
  public static void display(int arr[][]){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void transpose(int arr[][]){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr[i].length;j++){
        int t= arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i]= t;
      }
    }
    display(arr);
    System.out.println();
  }
  public static void rotate90(int arr[][]){
    transpose(arr);
    for(int i=0;i<arr.length;i++){
      int low=0,high= arr[i].length-1;
      while(low<high){
        int t= arr[i][low];
        arr[i][low]= arr[i][high];
        arr[i][high]= t;
        low++;
        high--;
      }
    }
    display(arr);
  }
  public static void interviewQuestions2d(){
    int arr[][]={{10,20,34,65},{56,4,65,67},{89,6,56,4},{58,67,7,4}};
    // transpose(arr);
    rotate90(arr);

  }
  public static void main(String[] args) {
    // int arr[]={56,5,43,6,76,4,56,43};
    // selectionSort(arr);
    // arraylistWork();
    // int arr[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
    // for(int i=0;i<arr.length;i++){
    //   for(int j=0;j<arr[i].length;j++){
    //     System.out.print(arr[i][j]+" ");
    //   }
    //   System.out.println();
    // }

    interviewQuestions2d();

  }
}