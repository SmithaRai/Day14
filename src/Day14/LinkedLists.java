package Day14;


  public class LinkedLists {

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

public static void main(String[] args) {
	// TODO Auto-generated method stub

	             LinkedLists list = new LinkedLists();
	
	             list.add(56);
	             list.add(30);
	             list.add(70);
 
                   }
               }


