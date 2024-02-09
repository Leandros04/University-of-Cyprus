
public class josephus {

	public static void main(String[] args) {
		int n = 9;
		int m = 3;

		CQueue jQueue = new CQueue(2 * n);
		
		for(int i = 1; i < n; i++)
		{
			jQueue.enqueue(i);
			
//			while(!jQueue.isEmpty())
//			{
//				for(int j = 1; j <= m - 1; j++)
//				{
//					jQueue.enqueue(jQueue.dequeue());
//				}
//				System.out.print(jQueue.dequeue());
//			}
			
			while(jQueue.getSize() != 1)
			{
				for(int j = 1; j <= m - 1; j++)
				{
					jQueue.enqueue(jQueue.dequeue());
				}
				System.out.print(jQueue.dequeue());
			}
		}
	}
}
