package Queue;

public class ArrayImplementation {

	int front=0;
	int rear=0;
	int capacity= 10;
	
	int[] arrayData=new int[capacity];
	public static void main(String[] args) {
		
		ArrayImplementation obj=new ArrayImplementation();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.dequeue();
		obj.enqueue(60);
		obj.dequeue();
		
		obj.queueDisplay();
	}
	
	public void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d <-- ", arrayData[i]); 
        } 
        return; 
    } 
	
	public void enqueue(int data)
	{
		if(rear == capacity)
		{
			System.out.println("Queue is full");
		}else {
			arrayData[rear]=data;
			rear++;
		}
		
	}
	
	public void dequeue()
	{
		if(front == rear)
		{
			System.out.println("Queue is empty");
		}else
		{
			for(int i=0;i<rear-1;i++)
			{
				arrayData[i]=arrayData[i+1];
				
			}
			
			if(rear < capacity)
			{
				arrayData[rear] = 0;
			}
			rear--;
		}
		
	}
}
