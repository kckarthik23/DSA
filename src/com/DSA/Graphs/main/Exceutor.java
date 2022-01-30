package com.DSA.Graphs.main;

import com.DSA.ProblemSolving.Graphs;

public class Exceutor {

	public static void main(String[] args) {
		Graphs graph=new Graphs(6);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 5);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 5);
		int parent[] =new int[6];
	    boolean vsited[]=new boolean[6];	
		
		//graph.BFS(0,parent , vsited);
		graph.DFS(0, parent, vsited);

	}

}
