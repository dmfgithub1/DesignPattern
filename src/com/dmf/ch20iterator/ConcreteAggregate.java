package com.dmf.ch20iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements Aggregate<E>{

	private List<E> items = new ArrayList<E>();
	@Override
	public Iterator<E> CreateIterator() {
		// TODO Auto-generated method stub
		return new Itr();
	}

	@Override
	public void setEle(E e) {
		items.add(e);
	}
	@Override
	public E getEle(int index) {
		return items.get(index);
	}
	
	private class Itr implements Iterator<E> {

		private int cur=0;
		@Override
		public E first() {
			// TODO Auto-generated method stub
			return items.get(0);
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cur!=items.size();
		}

		@Override
		public E next() {
			int i = cur;
			cur+=1;
			return items.get(i);
		}
		
	}
}
