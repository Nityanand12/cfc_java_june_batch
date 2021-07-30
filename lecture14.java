import java.util.*;
class Vehicle{
  String color,name;
  int mileage;
  int speed;

  public void forwardMovement(){
    System.out.println("Vehicle can move forward");
  }
  public void forwardMovement(int n){
    System.out.println("Vehicle can move forward at max "+n+" km/hr");
  }
  public  void backwardMovement(){
    System.out.println("Vehicle can move backward");
  }
  public Vehicle(String name,String color,int mileage,int speed){
    // this();
    System.out.println("This is parameterized Constructor");
    this.color= color;
    this.mileage= mileage;
    this.speed= speed;
    this.name= name;
  }
  public Vehicle(){
    // this("name", "color", 39, 40);
    // System.out.println("This is default constructor");
  }
}

class Car extends Vehicle{
  int wheels;
  public Car(String name,String color,int mileage,int speed,int wheels){
    super(name,color,mileage,speed);
    this.wheels=wheels;
  }
  public void forwardMovement(int n){
    System.out.println("Car can move forward at max "+n+" km/hr");
  }
  public Car(){

  }
}


class Student{
  private String name;
  private int rollNo;
  private int marks;


  public void setName(String myName){
    //conditions
    name= myName;
  }
  public String getName(){
    return name;
  }
  public void setRollNum(int myRollNo){
    rollNo = myRollNo;
  }
  public int getRollNum(){
    return rollNo;
  }
  public void setMarks(int myMarks){
    //conditions
    // 
    // 

    rollNo = myMarks;
  }
  public int getMarks(){
    // coditoins
    return marks;
  }
  public Student(String name,int rollNo,int marks){
    this.name= name;
    this.marks= marks;
    this.rollNo=rollNo;
  }
  public Student(){

  }
}




public class lecture14 {
  public static void main(String[] args) {
    // Vehicle v1 =new Vehicle();
    // v1.mileage=50;
    // v1.color= "blue";
    // v1.name= "Car";
    // System.out.println(v1.mileage+" "+v1.color+" "+v1.name+" "+v1.speed);
    // v1.backwardMovement();


    // Vehicle v2= new Vehicle("Car","Blue",40,50);
    // System.out.println(v2.mileage+" "+v2.color+" "+v2.name+" "+v2.speed);

    // Car c1= new Car("BMW","Blue",25,50,4);
    // System.out.println(c1.name+" "+c1.color+" "+c1.mileage+" "+c1.speed+" "+c1.wheels);

    // Vehicle v2= new Vehicle();
    // v2.forwardMovement(50);
    
    // Car c2= new Car();
    // c2.forwardMovement(60);

    Student st1= new Student();
    // st1.setMarks(myMarks);
  }
}
