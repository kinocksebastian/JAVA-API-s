
public class Stack<Item> {

	private Item[] s; 
	private int top = 0;
	
	public Stack() {

		s = (Item[]) new Object[2];
	}

	public void push(Item item) {

		if(top == s.length) 
			
			resize(s.length*2);
		
		s[top++] = item;
	}

	public Item pop() {

	if(top > 0 && top == s.length/4)   resize(s.length/2);
	
	Item temp = s[--top];
	s[top] = null;
		

	return temp;
	}

	public void resize(int capacity) {
	
		Item[] copy = (Item[]) new Object[capacity];
		
		for(int i = 0; i<capacity ; i++)
			
			copy[i] = s[i];
		s = copy ;
   	}

} 
