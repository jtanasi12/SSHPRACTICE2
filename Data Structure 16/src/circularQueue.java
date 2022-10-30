
public class circularQueue 
{
			// DATA 
	
	private int [] arrayQue;
	private int    front;
	private int    rear;
	private int    maxSize;
	

	public circularQueue(int maxSize)
	{
		this.maxSize = maxSize;
		
		arrayQue = new int[maxSize];
		
		front =  -1; 
		rear  = - 1;
	}
	
	public boolean isEmpty()
	{
		return (front == -1 && rear == -1);
	}
	
	public boolean isFull()
	{
		return ((rear + 1) == front);
	}
	
	// Add to the rear 
	public void enQueue(int input)
	{
		if(isFull())
			System.out.println("Array if full"); 
		else
		{
			if(isEmpty())
				++front;
			
			rear = ((rear + 1) % maxSize);
			
			arrayQue[rear] = input;
		}
	}
	
	// Delete from the front 
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Array is empty"); 
			
			return -1;
		}
		else
		{
			int temp = arrayQue[front];
			
			if(rear == front)
			{
				rear  = -1;
				front = -1;
			}
			else
				front = ((front + 1) % maxSize);
			
			return temp;
		}

	}
	
	public void print()
	{
		int index = 0;
		
		if(!isEmpty())
		{
			index = front;
		
			
			// We loop from the front of the list, to the index before the rear 
			while(index != rear)
			{
				System.out.print(arrayQue[index] + " ");
				
				index = ++index % maxSize;
			}
			
			
			// If the list has more then one element 
			if(front != rear)
				System.out.print(arrayQue[rear]);
			else // If the list has only one element
				System.out.print(arrayQue[front]);
		}
		else
			System.out.println("Array is empty"); 
			
	}
}
