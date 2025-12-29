package lec51;

import java.util.*;

public class Topological_Sort {
    HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();    
    public Topological_Sort(int v){
        for(int i=1; i<=v; i++){
            map.put(i,new HashMap<>()); 
        }
    }
    public void AddEdge(int v1,int v2){
        map.get(v1).put(v2,0);
    }
    public void TopologicalSort(){
        Queue<Integer> q = new LinkedList<>();
        int[] ind = indegree();
        for(int i=1; i<ind.length; i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            //1. Remove
            int front=q.poll();
            System.out.print(front+" ");
            for(int nbrs:map.get(front).keySet()){
                ind[nbrs]--;
                if(ind[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }

    }
       

    public boolean isCycle(){
        Queue<Integer> q = new LinkedList<>();
        int[] ind = indegree();
        for(int i=1; i<ind.length; i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            //1. Remove
            int front=q.poll();
            //System.out.print(front+" ");
            count++;
            for(int nbrs:map.get(front).keySet()){
                ind[nbrs]--;
                if(ind[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        return count!=map.size();
    }
    

    public int[] indegree(){
        int[] arr = new int[map.size()+1];
        for(int key:map.keySet()){
            for(int nbrs:map.get(key).keySet()){
                arr[nbrs]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(7);
		ts.AddEdge(1, 2);
		ts.AddEdge(1, 4);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5);
		ts.AddEdge(5, 7);
		ts.AddEdge(6, 3);
		ts.AddEdge(6, 7);
        //ts.AddEdge(3, 1);
		ts.TopologicalSort();
        System.out.println();
        System.out.println(ts.isCycle());	
	}
}
