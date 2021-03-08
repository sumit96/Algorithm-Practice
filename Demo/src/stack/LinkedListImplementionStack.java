package stack;

public class LinkedListImplementionStack {
	
	Node topNode;
	public static void main(String[] args) {
		
		LinkedListImplementionStack obj=new LinkedListImplementionStack();
		obj.push(29);
		obj.push(2);
		obj.push(19);
		obj.pop();
		obj.push(9);
		
		obj.display();
	}

	public void display()
	{
		if(topNode == null)
		{
			System.out.println("Stack is empty");
		}else {
			while(topNode != null) {
			System.out.println(topNode.data);
			topNode = topNode.next;
			}
		}
	}
	public void push(int data)
	{
		Node tempNode=new Node();
		
		tempNode.data = data;
		tempNode.next=topNode;
		topNode=tempNode;
		
	}
	
	public boolean isEmpty()
	{
		
		return topNode == null;
	}
	
	public int peek()
	{
		if(topNode == null) {
			return topNode.data;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void pop()
	{
		if(topNode == null)
		{
			System.out.println("Stack under flow");
			return;
		}
		topNode = topNode.next;
	}
	private class Node
	{
		int data;
		Node next;
		
	}
}
