package com.tul.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


class Vertex{
	Object value;
	Vertex(Object value){
		this.value=value;
	}
	
	@Override
	public String toString() {
        return (String)this.value;
    }
}
public class Graph {

 private Map<Vertex, ArrayList<Vertex>> adjlistMap;
	
	public Graph(){
		adjlistMap=new HashMap<Vertex, ArrayList<Vertex>>();
		
	}
	
	
	
	
	public Graph(List<Vertex> vertexlist){
		adjlistMap=new HashMap<Vertex, ArrayList<Vertex>>();
		for(Vertex v:vertexlist) {
			adjlistMap.put(v, new ArrayList<Vertex>());
		}
		
	}
	
	void addEdge(Vertex source, Vertex des, boolean bidirecional) {
		
		if(bidirecional) {
			if(adjlistMap.keySet().contains(source) && adjlistMap.keySet().contains(des)) {
			adjlistMap.get(source).add(des);
			adjlistMap.get(des).add(source);
			}
		}
		else {
			if(adjlistMap.keySet().contains(source)) {
			adjlistMap.get(source).add(des);
			}
		}
	}
	
	public void removeEdge(Vertex v1, Vertex v2) {
		
		ArrayList<Vertex> list1=adjlistMap.get(v1);
		ArrayList<Vertex> list2=adjlistMap.get(v2);
		
		list1.remove(v2);
		list2.remove(v1);
	}
	
	public boolean hasEdge(Vertex source , Vertex Target) {
		return adjlistMap.containsKey(source) && adjlistMap.get(source)!=null && adjlistMap.get(source).contains(Target);
		
	}
	
	//traverse
	public void printAdjList() {
		for(Vertex v:adjlistMap.keySet()) {
			
			System.out.print(v.value+"-->");
			ArrayList<Vertex> list=adjlistMap.get(v);
			for(Vertex ver:list) {
				System.out.print(ver.value+" ");
			}
			System.out.println("\n");
		}
		
		
	}
	
	public List<Vertex> bfsTraversal(Vertex v) {
		List<Vertex> visited=new ArrayList<Vertex>();
		Queue<Vertex> q=new LinkedList<Vertex>();
		
		visited.add(v);
		q.add(v);
		
		while(!q.isEmpty()) {
			Vertex node=q.poll();
			
			for(Vertex adjvertex:adjlistMap.get(node)) {
				
				if(!visited.contains(adjvertex)) {
				visited.add(adjvertex);
				q.add(adjvertex);
				}
			}
		}
		
		return visited;
		
	}
	
	public List<Vertex> dfsTraversal(Vertex v) {
		
		List<Vertex> visited=new ArrayList<Vertex>();
		Stack<Vertex> s=new Stack<Vertex>();
		
		s.add(v);
		
		while(!s.isEmpty()) {
			Vertex node=s.pop();
			
			if(!visited.contains(node)) {
				visited.add(node);
			for(Vertex adjvertex:adjlistMap.get(node)) {
				s.add(adjvertex);
			}
		  }
		}
		
		return visited;
		
	}
	
	public List<Vertex> bfsTraRecursive(Vertex v) {
		return null;
	}
	
	public List<Vertex> dfsTraRecursive(Vertex v) {
		return null;
	}


	private boolean hasVertex(Vertex a) {
       return adjlistMap.containsKey(a);		
	}




	private int getEdgesCount(boolean b) {
         int count=0;
		for(Vertex v:adjlistMap.keySet()) {
			count+=adjlistMap.get(v).size();
		}
		return count/2;
	}




	private int getVertexCount() {
       return 	adjlistMap.keySet().size();	
	}

	 
	 
	 

	public static void main(String[] args) {
        
        Vertex a=new Vertex("A");
        Vertex b=new Vertex("B");
        Vertex c=new Vertex("C");
        Vertex d=new Vertex("D");
        Vertex e=new Vertex("E");
        Vertex f=new Vertex("F");
        
        ArrayList<Vertex> list = new ArrayList<Vertex>();
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	list.add(d);
    	list.add(e);
    	list.add(f);
    		
    	//Constructing the graphs
    	Graph g = new Graph(list);
    	g.addEdge(a, e,true);
    	g.addEdge(a, d,true);
    	g.addEdge(d, e,true);
    	g.addEdge(b, e,true);
    	g.addEdge(b, c,true);
     	g.addEdge(b, f,true);
        
        
    	
    	g.printAdjList();
    	
    	System.out.println(g.hasEdge(d, e));
    	
    	System.out.println(g.hasEdge(d, b));
    	
    	System.out.println("BFS : start node"+a.value);
    	
    	System.out.println(g.bfsTraversal(a));
    	
    	System.out.println("DFS : start node"+a.value);
    	
    	System.out.println(g.dfsTraversal(a));
    	
         System.out.println("BFS : start node"+e.value);
    	
    	System.out.println(g.bfsTraversal(e));
    	
    	System.out.println("DFS :start node"+e.value);
    	
    	System.out.println(g.dfsTraversal(e));
    	
    	// Gives the no of vertices in the graph.
       System.out.println( "vertex count : "+g.getVertexCount());
 
        // Gives the no of edges in the graph.
        System.out.println("edge count : "+g.getEdgesCount(true));
 
        
 
        // Tells whether vertex is present or not
       System.out.println("has vertex "+a+" :"+ g.hasVertex(a));
       
//       C-->B 
//
//       F-->B 
//
//       E-->A D B 
//
//       A-->E D 
//
//       B-->E C F 
//
//       D-->A E 
//
//       true
//       false
//       BFS : start nodeA
//       [A, E, D, B, C, F]
//       DFS : start nodeA
//       [A, D, E, B, F, C]
//       BFS : start nodeE
//       [E, A, D, B, C, F]
//       DFS :start nodeE
//       [E, B, F, C, D, A]
//       vertex count : 6
//       edge count : 6
//       has vertex A :true

        
	}



	 
	 
	 

}
