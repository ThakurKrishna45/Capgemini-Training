package jvaCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class practice {

	public static void main(String[] args) {
		List<Integer> al= new CopyOnWriteArrayList<>();
		al.add(1);
		al.add(2);
		for(int a:al) {
			al.add(3);
			System.out.println(a);
		}
	}

}
