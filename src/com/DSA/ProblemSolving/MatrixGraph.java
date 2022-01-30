package com.DSA.ProblemSolving;

public class MatrixGraph {

	Vertex v[];
	int n;
	int matrix[][];

	MatrixGraph(int maxVerticies) {
		v = new Vertex[maxVerticies];
		n = -1;
		matrix = new int[maxVerticies][maxVerticies];
	}

	public void addVertex(String label) {
		v[++n] = new Vertex(label);

	}

	public void init(int maxVerticies) {
		for (int i = 0; i < maxVerticies; i++) {
			for (int j = 0; j < maxVerticies; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	public void addEdge(int start, int end) {
		matrix[start][end] = 1;
		matrix[end][start] = 1;
	}

	public void displayGraph() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				
				System.out.print(matrix[i][j]);
				
			}
			System.out.println();
		}

	}
	public void dfs()
	{
		
	}

	public static void main(String[] args) {
	MatrixGraph mg=new MatrixGraph(4);
	mg.addVertex("A");
	mg.addVertex("B");
	mg.addVertex("C");
	mg.addVertex("D");
	
	mg.addEdge(0, 1);
	mg.addEdge(1, 2);
	mg.addEdge(2, 3);
	mg.addEdge(1, 3);
	
	mg.displayGraph();
	

	}

}

class Vertex {
	String label;

	Vertex(String label) {

		this.label = label;
	}

}