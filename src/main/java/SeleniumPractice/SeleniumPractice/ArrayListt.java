package SeleniumPractice.SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {
	// The generic collections are type-safe and checked at compile-time.
	public static void main(String[] args) {
		List<Integer> l = new ArrayList(); // adding generics
        l.add(13);
        l.add(14);
        l.add(150);
		/*for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
        
        //Always use for Each Loop with Collections
        for(Integer k:l)
        {
        	System.out.println(k);
        }
	}

}
