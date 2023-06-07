package idh.java;

import java.util.HashSet;
import java.util.Set;

public class Tree<T> {

	T value;
	Set<Tree<T>> children;
	
	public Tree(T value) {
		this.value = value;
		children = new HashSet<Tree<T>>();
	}
	
	public Set<Tree<T>> children() {
		return children;
	}
	
	public void dfs() {
		System.out.println(value);
		for (Tree<T> child : children) {
			child.dfs();
		}
	}
	// wheeled_vehicle
	// e-bike
	// tandem
	// bike
	// buggy
	
	public static void main(String[] args) {
		
		Tree<String> ebike = new Tree<String>("e-bike");
		Tree<String> tandem = new Tree<String>("tandem");
		Tree<String> bike = new Tree<String>("bike");
		Tree<String> buggy = new Tree<String>("buggy");
		Tree<String> wheeled_vehicle = new Tree<String>("wheeled vehicle");

		wheeled_vehicle.children().add(bike);
		wheeled_vehicle.children().add(buggy);
		bike.children().add(tandem);
		bike.children().add(ebike);
		
		// System.out.println(wheeled_vehicle);
		
		wheeled_vehicle.dfs();
	}
	

}
