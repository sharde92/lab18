package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
				 list.addAtBeginning("one");
				 list.addAtBeginning("two");
				 list.addAtBeginning("three");
				 list.addAtBeginning("four");
				 list.addAtEnd("five");
				 list.addAtEnd("six");
				 list.addAtEnd("seven");
				 
				 list.insertAt(1,  "thirteen");
				 list.insertAt(2,  "one hundred");
				 list.insertAt(5,  "zero");
				 list.insertAt(4,  "eighty");
				
				 list.removeAt(3);
				 
System.out.println(list);
				 
				
	}


	}


