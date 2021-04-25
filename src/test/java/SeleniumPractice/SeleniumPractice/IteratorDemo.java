package SeleniumPractice.SeleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(12);
		
		marks.add(90);

		marks.add(99);

		marks.add(88);
		
		Iterator<Integer> itr=marks.iterator();//DSl
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		for(Integer i:marks) 
		{
			System.out.println(i);
		}

	}

}
