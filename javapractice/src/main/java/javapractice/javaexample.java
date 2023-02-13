package javapractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class javaexample {
	
	  public void practice () {
			HashMap<Integer, String> employ=new HashMap<Integer, String>();
			employ.put(1, "name");
			employ.put(2,"chella");
			System.out.println("write:"+employ);
			Map<Integer, String> duplicate =new HashMap<Integer, String>();
			duplicate.putAll(employ);
			System.out.println(duplicate);
			System.out.println(duplicate.containsKey(1));
			System.out.println(duplicate.containsValue("chella"));
			System.out.println(duplicate.keySet());
			System.out.println(duplicate.get(1));
			System.out.println(duplicate.values());
			System.out.println(duplicate.entrySet());
			
			}
		public void link() {
		LinkedHashMap<String,String> map= new LinkedHashMap<String, String>()	;
		map.put( "arun","demo");
		
		}
}
