package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class java {
	public void array() {
		List<String> we=new ArrayList<String>();
		we.add("chella");
		we.add("muthu");
		we.add("kd");
		we.add("read");
		System.out.println(we);
		System.out.println(we.get(2));
		
		Iterator<String>li=we.iterator();
			
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
			List<Object> ty= new ArrayList<Object>();
			ty.add(1);
			ty.add("sr");
			System.out.println(ty);

	}
}
