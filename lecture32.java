import java.util.*;
public class lecture32{
  static class Edge{
    int v,w;
    Edge(int v,int w){
      this.v=v;
      this.w=w;
    }
    Edge(){

    }

  }
  public static void display(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
      System.out.print(i+" ");
      for(int j=0;j<graph[i].size();j++){
        System.out.print(" ["+graph[i].get(j).v+" "+graph[i].get(j).w+"] ");
      }
      System.out.println();
    }
  }
  public static void addEdge(int u,int v,int w,ArrayList<Edge> graph[]){
    if(u<0||v<0||u>=graph.length||v>=graph.length){
      return;
    }
    graph[u].add(new Edge(v,w));
    graph[v].add(new Edge(u,w));
  }
  public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
      graph[i]= new ArrayList<Edge>();
    
    }
    addEdge(0,1,12,graph);
    addEdge(0,3,15,graph);
    addEdge(1,2,20,graph);
    addEdge(3,2,13,graph);
    addEdge(3,4,16,graph);
    addEdge(4,5,24,graph);
    addEdge(5,6,10,graph);
    addEdge(4,6,40,graph);
  }
  public static boolean hasPath(int src,int des,ArrayList<Edge> graph[],boolean vis[]){
    if(src==des){
      return true;
    }
    vis[src]=true;
    boolean res=false;
    for(Edge e: graph[src]){
      if(vis[e.v]==false){
        res=res||hasPath(e.v,des,graph,vis);
      }
    }
    return res;
  }
  public static void hasPath(ArrayList<Edge> graph[]){
    boolean vis[]= new boolean[graph.length];
    System.out.println(hasPath(0,6,graph,vis));
  }
  public static void printAllPath(int src,int des,ArrayList<Edge> graph[],boolean vis[],String ans){
    if(src==des){
      System.out.println(ans);
      return;
    }
    vis[src]=true;
    for(Edge e: graph[src]){
      if(vis[e.v]==false){
        printAllPath(e.v,des,graph,vis,ans+" "+e.v);
      }
    }
    vis[src]=false;
  }
  public static void printAllPath(ArrayList<Edge> graph[]){
    boolean vis[]= new boolean[graph.length];
    printAllPath(0,6,graph,vis,"0");
  }
  public static void hamiltonianPath(int src,ArrayList<Edge> graph[],boolean vis[],String ans,int count){
    if(count==graph.length){
      System.out.println(ans);
      return;
    }
    vis[src]=true;
    for(Edge e: graph[src]){
      if(vis[e.v]==false){
        hamiltonianPath(e.v,graph,vis,ans+" "+e.v,count+1);
      }
    }
    vis[src]=false;
  }
  public static void hamiltonianPath(ArrayList<Edge> graph[]){
    boolean vis[]= new boolean[graph.length];
    hamiltonianPath(0,graph,vis,"0",1);
  }


  public static void hamiltonianCycle(int src,int osrc,ArrayList<Edge> graph[],boolean vis[],String ans,int count){
    if(count==graph.length){
      for(Edge e: graph[src]){
        if(e.v==osrc){
          System.out.println("Cycle "+ans);
        }
      }
      System.out.println("Path "+ans);
      return;
    }
    vis[src]=true;
    for(Edge e: graph[src]){
      if(vis[e.v]==false){
        hamiltonianCycle(e.v,osrc,graph,vis,ans+" "+e.v,count+1);
      }
    }
    vis[src]=false;
  }
  public static void hamiltonianCycle(ArrayList<Edge> graph[]){
    boolean vis[]= new boolean[graph.length];
    hamiltonianCycle(0,0,graph,vis,"0",1);
  }
  public static void getConnectedComponent(int src,ArrayList<Edge> graph[],boolean vis[]){
    vis[src]=true;
    for(Edge e: graph[src]){
      if(vis[e.v]==false){
        getConnectedComponent(e.v,graph,vis);
      }
    }
  }
  public static void getConnectedComponent(ArrayList<Edge> graph[]){
    boolean vis[]= new boolean[graph.length];
    int count=0;
    for(int i=0;i<graph.length;i++){
      if(vis[i]==false){
        count++;
        getConnectedComponent(i,graph,vis);
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {
    ArrayList<Edge> graph[]= new ArrayList[7];
    createGraph(graph);
    display(graph);
    // hasPath(graph);
    // printAllPath(graph);
    // hamiltonianPath(graph);
    // hamiltonianCycle(graph);
    getConnectedComponent(graph);
  }
}