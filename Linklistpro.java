import java.util.Scanner;

public class Linklistpro {
	
	Node head;//Start of list
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
		
	}
	 public void display()
	 {
		 Node n = head;
		 System.out.print("[");
		 while(n != null)
		 {
			 System.out.print(n.data+",");
			 n = n.next;
			 
		 }
		 System.out.print("]");
			 
	 }
	 
	 //Insert at begining
	  public void insert(int new_data)
	  {
		Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		
	  }
	  
	  
	  	public int CountNode()
		{
			Node temp = head;
			int count = 0;
			while (temp != null)
			{
				count++;
				temp = temp.next;
			}
			return count;
		}
		
	  	public void swapnode()
	  	{
	  		
	  		Node n = head;
	  		int temp;
	  		if(head==null||head.next==null)
	  		{
	  			return;
	  		}
	  		 while(n != null)
			 {
				// System.out.print(n.data+ "--->");
				 temp = n.data;
				 n.data= n.next.data;
				 n.next.data = temp;
				 n = n.next.next;
				 
			 }
	  		
	  		
	  		
	  	}
	
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		Linklistpro l1 = new Linklistpro();
		int i ;
		System.out.println("enter the number of elements you want to enter");	
		i = sc.nextInt();
		if(i%2==0)
		{
		for(int j=1;j<=i;j++)
		{
		int t =sc.nextInt();
		l1.insert(t);
		}	
		}
		else
		{
			System.out.println("please enter even number of elements");
		}
		
		l1.display();
		l1.swapnode();
		System.out.println("");
		l1.display();

	}

}
