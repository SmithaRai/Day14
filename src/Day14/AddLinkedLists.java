package Day14;

public class AddLinkedLists {
	
	 static Node head;
	    

	    public static <T> void add(T data) {
	        Node  temp = head ;
	        Node newnode = new Node(data);

	        if (temp == null) {
	            head = newnode;
	        }
	        else {
	            
	        	while(temp.next!=null)
	              {
	              
	              temp = temp.next;
	                
	              }
	            temp.next = newnode ;
	        }
	    }

	    public static void print()
	    {
	        Node  temp = head ;
	         
        	System.out.print("LinkedList Sequence : ");

	        while(temp!=null)
	        {
	            System.out.print(temp.data+"-->");
	        	temp = temp.next;
	        }

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		             LinkedLists list = new LinkedLists();
		
		             add(56);
		             add(30);
		             add(70);
		             
		             print();
	 
	}
}
