import java.util.*;
public class lecture29 {
  static class CustomSet<T>{
    ArrayList<LinkedList<T>>al;
    static double loadFactor=0.75;
    int defaultSize=10;
    int size;
    CustomSet(){
      size=0;
      al= new ArrayList<>();
      for(int i=0;i<defaultSize;i++){
        al.add(new LinkedList<>());
      }
    }
    private void rehash(){
      ArrayList<LinkedList<T>> oldAl=al;
      al= new ArrayList<>();
      for(int i=0;i<defaultSize*2;i++){
        al.add(new LinkedList<>());
      }
      defaultSize=defaultSize*2;
      size=0;
      for(LinkedList<T> list: oldAl){
        for(T ele: list){
          add(ele);
        }
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
      if(size/al.size()>loadFactor){
        rehash();
      }
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
    @Override
    public String toString(){
      StringBuilder sb= new StringBuilder();
      for(LinkedList<T>list: al){
        for(T ele: list){
          sb.append(ele).append(" ");
        }
      }
      return sb.toString();
    }

  }


  static class CustomMap<k,v>{
    class Node{
      k key;
      v value;
      Node(k key,v value){
        this.key=key;
        this.value=value;
      }
      Node(){

      }
    }
    ArrayList<LinkedList<Node>>al;
    static double loadFactor=0.75;
    int defaultSize=10;
    int size;
    CustomMap(){
      size=0;
      al= new ArrayList<>();
      for(int i=0;i<defaultSize;i++){
        al.add(new LinkedList<>());
      }
    }
    private void rehash(){
      ArrayList<LinkedList<Node>> oldAl=al;
      al= new ArrayList<>();
      for(int i=0;i<defaultSize*2;i++){
        al.add(new LinkedList<>());
      }
      defaultSize=defaultSize*2;
      size=0;
      for(LinkedList<Node> list: oldAl){
        for(Node ele: list){
          put(ele.key,ele.value);
        }
      }
    }
    public void put(k key,v value){
      int hash= key.hashCode();
      int idx= hash%al.size();
      LinkedList<Node> list= al.get(idx);
      for(Node ele: list){
        if(ele.key.equals(key)){
          ele.value=value;
          return;
        }
      }
      list.add(new Node(key, value));
      size++;
      if(size/al.size()>loadFactor){
        rehash();
      }
    }
    public v get(k key){
      int hash= key.hashCode();
      int idx= hash%defaultSize;
      LinkedList<Node> list= al.get(idx);
      for(Node ele: list){
        if(ele.key.equals(key)){
          return ele.value;
        }
      }
      return null;
    }
    public boolean containsKey(k key){
      int hash= key.hashCode();
      int idx= hash%defaultSize;
      LinkedList<Node> list= al.get(idx);
      for(Node ele: list){
        if(ele.key.equals(key)){
          return true;
        }
      }
      return false;
    }
    public void remove(k key){
      int hash= key.hashCode();
      int idx= hash%defaultSize;
      LinkedList<Node> list= al.get(idx);
      for(Node ele: list){
        if(ele.key.equals(key)){
          list.remove(key);
          size--;
          return;
        }
      }
    }
    @Override
    public String toString(){
      StringBuilder sb= new StringBuilder();
      for(LinkedList<Node>list: al){
        for(Node ele: list){
          sb.append(ele.key+" "+ele.value+"\n");
        }
      }
      return sb.toString();
    }

  }
  public static void main(String[] args) {
    // CustomSet<Integer> cs1= new CustomSet<>();
    // cs1.add(10);
    // cs1.add(12);
    // cs1.add(10);
    // cs1.add(15);
    // cs1.add(12);
    // cs1.add(10);
    // cs1.add(65);
    // System.out.println(cs1);
    // System.out.println(cs1.contains(20));
    // cs1.remove(10);
    // System.out.println(cs1);



    // CustomMap<String,Character>map1= new CustomMap<>();
    // map1.put("Delhi", 'i');
    // map1.put("Bombay", 'b');
    // map1.put("Kolkata", 'k');
    // map1.put("Delhi", 'd');
    // map1.put("UP", 'u');
    // map1.put("Bombay", 'm');
    // System.out.println(map1);
    // CustomMap<Integer,Integer>map = new CustomMap<>();
    // for(int key: arr){
      //   if(map.containsKey(key)){
        //     int get= map.get(key);
        //     map.put(key, get+1);
        //   }
        //   else{
    //     map.put(key, 1);
    //   }
    // }
    // System.out.println(map);
    
    String arr[]={"10","23","45","23","76","45","10","2","76","45","34","23","23","76","45"};
    HashMap<String,Integer>map2= new HashMap<>();
    for(String key: arr){
      // if(map2.containsKey(key)){
      //   int get=map2.get(key);
      //   map2.put(key, get+1);
      // }
      // else{
      //   map2.put(key, 1);
      // }
      map2.put(key,map2.getOrDefault(key, 0)+1);
    }
    System.out.println(map2);

    HashSet<String>set= new HashSet<>();
    for(String ele: arr){
      set.add(ele);
    }
    System.out.println(set);
  }
}
