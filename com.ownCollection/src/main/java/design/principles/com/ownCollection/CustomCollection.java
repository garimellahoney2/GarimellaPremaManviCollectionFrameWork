package design.principles.com.ownCollection;

import java.util.Collection;
import java.util.LinkedList;

public class CustomCollection<E> extends LinkedList<E> {

	

	public CustomCollection(Collection<? extends E> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
