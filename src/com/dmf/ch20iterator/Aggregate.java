package com.dmf.ch20iterator;

public interface Aggregate<E> {
	Iterator<E> CreateIterator();
	public void setEle(E e);
	public E getEle(int index);
}
