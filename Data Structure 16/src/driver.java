
public class driver {

	public static void main(String[] args) 
	{
		circularQueue circleQue = new circularQueue(5);
		
		circleQue.enQueue(15);
		circleQue.enQueue(25);
		circleQue.enQueue(35);

		circleQue.deQueue();
		
		
		circleQue.print();
	}

}
