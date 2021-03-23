package linklist;

public class LinkListImpl {
	
	static LinkListImpl node=null;
	int item=0;
	
	public LinkListImpl(LinkListImpl node,int item) {
		// TODO Auto-generated constructor stub
		this.item=item;
		this.node=node;
		
	}
	

	public static void main(String str[])
	{
		LinkListImpl firstNode=new LinkListImpl(null, 1);
		LinkListImpl secondNode=new LinkListImpl(firstNode, 2);
		LinkListImpl thirdNode=new LinkListImpl(secondNode, 3);
		
		display(thirdNode);
	}
	
	public static void display(LinkListImpl node)
	{
		while(node != null)
		{
			System.out.println("item = "+node.item);
		}
	}
}
