package stack;

import java.util.Stack;

public class ReverseListUsingStack {

	static Node topNode;
	public static void main(String[] args) {
		
		ReverseListUsingStack obj=new ReverseListUsingStack();
		obj.push(10);
		obj.push(11);
		obj.push(15);
		obj.push(16);
		
		topNode  = obj.reverseList();
		
	obj.display(topNode);
	}
	
	public void push(int data)
	{
		Node tempNode=new Node();
		tempNode.data=data;
		tempNode.next=topNode;
		topNode=tempNode;
	}
	
	public Node reverseList()
	{
		
		
			Stack<Node> stack=new Stack<Node>();
			Node ptr=topNode;
			
			while(ptr.next != null)
			{
				stack.push(ptr);
				ptr=ptr.next;
				
			}
			topNode=ptr;
			while(!stack.isEmpty())
			{
				
				ptr.next=stack.peek();
				ptr=ptr.next;
				stack.pop();
			}
			
			ptr.next=null;
			
			
			
		return topNode;
		
		
	}
	
	public void display(Node topNode)
	{
		if(topNode == null)
		{
			System.out.println("Stack is empty");
		}else {
			while(topNode != null) {
			System.out.print(topNode.data+" ");
			topNode = topNode.next;
			}
		}
	}

	private class Node
	{
		int data;
		Node next;
	}
}
