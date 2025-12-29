package lec49;

import java.util.*;

public class Prims_Algorithm {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Prims_Algorithm(int v){
        map = new HashMap<>();
        for(int i =1; i<=v; i++){
            map.put(i,new HashMap<>());
        }
    }

    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    class PrimsPair{
        int vtx;
        int acqv;
        int cost;

        public PrimsPair(int vtx,int acq,int cost){
            this.vtx=vtx;
            this.acqv=acq;
            this.cost=cost;
        }
        public String toString(){
            return vtx+"-"+acqv+"@"+cost;
        }
    }
    public int prims(){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2){
                return o1.cost-o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsPair(1, 1, 0));
        int sum=0;
        while(!pq.isEmpty()){
            //1.Remove
            PrimsPair rp = pq.poll();
            // 2. Ignore if already visited
            if(visited.contains(rp.vtx)){
                continue;
            }
            // 3. Visited
            visited.add(rp.vtx);
            //4. Self work
            System.out.println(rp);
            sum+=rp.cost;
            //5. Add unvisited
            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost=map.get(rp.vtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.vtx, cost));
                }
            }
        }
        return sum;
    }
}
