package com.dmf.ch20iterator;

public class IteratorMain {

	public static void main(String[] args) {

		Aggregate<String> agglist = new ConcreteAggregate<String>();
		agglist.setEle("one");
		agglist.setEle("two");
		agglist.setEle("three");
		
		Iterator<String> itreator= agglist.CreateIterator();
		
		while(itreator.hasNext()) {
			System.out.println(itreator.next());
		}
	}

}
