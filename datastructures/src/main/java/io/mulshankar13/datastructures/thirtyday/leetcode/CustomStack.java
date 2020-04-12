package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(22);
		obj.push(-2);
		obj.push(-11);
		obj.push(-5);
		//obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println(param_3);
		System.out.println(param_4);
		obj.pop();
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
	}
}

class MinStack {

	List<Node> nodes = null;
	int size;
	
	/** initialize your data structure here. */
    public MinStack() {
	this.nodes = new ArrayList<Node>();// initialize node 
	this.size=-1;// empty stack
    }

	public void push(int x) {
		
		int newMin = Math.min(x, this.getMin());
		Node node = new Node(x,newMin);
		nodes.add(node);
		size++;
	}

	public void pop() {
		if (size > -1) { // stack is not empty
			nodes.remove(size);
			size--;
		}
	}

	public int top() {
		if (size > -1) { // stack is not empty
			return nodes.get(size).data;
		}
		return -1;
	}

	public int getMin() {
		if(this.size<0) { //stack is empty
			return Integer.MAX_VALUE;
		}
		return this.nodes.get(size).min;
	}
}
class Node{

	int data;
	int min;
	Node (int data,int min){
		this.data=data;
		this.min=min;
	}
}
