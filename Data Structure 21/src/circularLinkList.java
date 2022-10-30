
public class circularLinkList <E>
{
	private Node<E> tail;
	private int size;
	public circularLinkList()
	{
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public E getFirst()
	{
		if(isEmpty())
			return null;
		
		return tail.getNext().getData(); // The tail points to the "head"
		// Creating that circular structure 
	}
	
	public E getLast()
	{
		if(isEmpty())
			return null;
		
		return tail.getData();
	}

	public void addFirst(E data) // Tail.getNext() will point to the front
	{
		if(size == 0) // If List is empty 
		{
			Node<E> newNode = new Node<E>(data, null);
			tail = newNode; // Tail will point to the new Node 
			
			tail.setNext(tail); // The tail will then point to itself circulary
		}
		
		else
		{
		Node<E> newNode = new Node<E>(data, tail.getNext());
			// The tail was pointing to the head, but now we want this to be the head
			// So we have the newNode point to tail.getNext so its inserted between
		
		tail.setNext(newNode);
			
			//tail.setNext(new Node<E>(data, tail.getNext()));
			// Now the tail points to the New Node becoming the new head
		
			
			
			/*  TAIL                       TAIL
			 *   5 -----------6------------ 5
			 * 
			 * NOW
			 * 
			 * TAIL                                  TAIL
			 * 5 --------NEW NODE -----------6-------5
			 */
		
		
		}
		
		size += 1;

			
	}
	
	public int getSize()
	{
		if(tail == null)
			return 0;
		
		else
		{
			
		Node<E> head = tail.getNext(); // Head Node 
		Node<E> temp = head.getNext(); 
		
		int counter = 1; 
		
		while(head != temp)
		{
			temp = temp.getNext();
			
			counter += 1;
		}
		
		return counter;
		}
		
	}
	
public void addLast(E data)
{
	addFirst(data); // Adds new element to the front of the list 
	
	tail = tail.getNext();
}

public E removeFirst()
{
	if(isEmpty())
		return null;
	
	Node <E> head = tail.getNext(); // Stores the first element we want to remove
	
	if(head == tail) // Only one node, a tail pointing to itself (tail ---> tail)
		tail = null;
	else
		tail.setNext(head.getNext()); // Tail.next will point to head.next
	
	size--;
	
	return head.getData();
}

public void rotate() // If the tail isnt null the tail will become the old head
{
	if(tail != null)
	{
		tail = tail.getNext();
	}
}


}
