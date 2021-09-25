import java.util.*;
public class lecture28b {
  static class CustomSet<T>{
    ArrayList<LinkedList<T>>al;
    static int defaultSize=10;
    int size;
    CustomSet(){
      size=0;
      al= new ArrayList<>();
      for(int i=0;i<defaultSize;i++){
        al.add(new LinkedList<>());
      }
    }
    public void add(T value){
      int hash= value.hashCode();
      int idx= hash%defaultSize;
      LinkedList<T> list= al.get(idx);
      for(T ele: list){
        if(ele.equals(value)){
          return;
        }
      }
      list.add(value);
      size++;
    }
    public boolean contains(T value){
      int hash= value.hashCode();
      int idx= hash%defaultSize;
      LinkedList<T> list= al.get(idx);
      for(T ele: list){
        if(ele.equals(value)){
          return true;
        }
      }
      return false;
    }
    public void remove(T value){
      int hash= value.hashCode();
      int idx= hash%defaultSize;
      LinkedList<T> list= al.get(idx);
      for(T ele: list){
        if(ele.equals(value)){
          list.remove(value);
          size--;
          return;
        }
      }
    }

  }
  public static void main(String[] args) {
    CustomSet cs1= new CustomSet();

  }
}
