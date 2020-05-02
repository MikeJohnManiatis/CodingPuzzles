package Graphs;

import java.util.*;
public class Graph {
    class Edge {
        int v, w;
        public Edge(int v, int w){
            this.v = v; this.w = w;
        }
        @Override
        public String toString()
        {
            return "("+v+","+w+")";
        }
    }
    List<Edge> graph[];

    public Graph(int n){
        graph = new LinkedList[n];
        for (int i = 0; i < n; i++){
            graph[i] = new LinkedList<Edge>();
        }
    }
    public void addEdge(int u, int v, int w){
        graph[u].add(0, new Edge(v, w));
    }

    public boolean isConnected(int u, int v){
        for(Edge i : graph[u])
            if (i.v == v)
                return true;
        return false;
    }

    @Override
    public String toString(){
        String result = "";
        for(int i =0; i<graph.length; i++)
        {
            result += i + "=>" + graph[i];
        }
        return result;
    }
}
