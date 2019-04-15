package com.dmf.ch20iterator;

public interface Iterator<E> {

	E first();
	boolean hasNext();
	E next();
}
