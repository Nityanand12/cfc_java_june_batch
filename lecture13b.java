import java.util.*;
class Vehicle{
  String color,name;
  int mileage;
  int speed;
  public void forwardMovement(){
    System.out.println("Vehicle can move forward");
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
    this("name", "color", 39, 40);
    System.out.println("This is default constructor");
  }
}
public class lecture13b {
  public static void main(String[] args) {
    Vehicle v1 =new Vehicle();
    v1.mileage=50;
    v1.color= "blue";
    v1.name= "Car";
    System.out.println(v1.mileage+" "+v1.color+" "+v1.name+" "+v1.speed);
    v1.backwardMovement();


    Vehicle v2= new Vehicle("Car","Blue",40,50);
    System.out.println(v2.mileage+" "+v2.color+" "+v2.name+" "+v2.speed);

  }
}
