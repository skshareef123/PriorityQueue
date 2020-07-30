package priority;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priority {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("shareef");
		q.add("arif");
		q.add("jeeelani");
		q.add("dilsahd");
		q.add("shaik");
		System.out.println(q.element());
		System.out.println(q.peek());
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		q.remove();
		q.poll();
		Iterator<String> itr2=q.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
