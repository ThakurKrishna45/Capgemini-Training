package jvaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {

		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(1);
//		ts.add(null);
		System.out.println(ts);
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer a=it.next();
			System.out.println(a);
			if(a.equals(1)) {
				al.remove(a);
			}
		}
	}

}
