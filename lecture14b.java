import java.util.*;

class Ferrari extends Car2{
  public void move(){
    System.out.println("Ferrari can move backward as well as forward");
  }
}

abstract class Car2{
  abstract void move();
  public void forwardMove(){
    System.out.println("Car2 can move forward");
  }
}

interface Car3{
  void move();
}

public class lecture14b {
  public static void main(String[] args) {
    
    Ferrari f1= new Ferrari();
    f1.forwardMove();
    
  }
}
