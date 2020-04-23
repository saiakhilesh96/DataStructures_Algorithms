/*
 * Aum Sri Sai Ram
 * This Program demonstrates the Doubly Linked List in Java
 */
class DLLNode
{
	int data;
	DLLNode prev;
	DLLNode next;
	public DLLNode(int data)
	{
		this.data= data;
		this.prev= null;
		this.next= null;
	}
	public int getData()
	{
		return this.data;
	}
	public void SetData(int data)
	{
		this.data= data;
	}
	public DLLNode getprev()
	{
		return this.prev;
	}
	public void setprev(DLLNode prev)
	{
		this.prev= prev;
	}
	public DLLNode getnext()
	{
		return this.next;
	}
	public void setnext(DLLNode next)
	{
		this.next= next;
	}
}
public class DLL 
{
	DLLNode head;
	/*
	public DLL()
	{
		head= new DLLNode(Integer.MIN_VALUE);
		head.setnext(null);
		head.setprev(null);
	}
	*/
	public void insert(int data,int position)
	{
		DLLNode temp,t;
		int c= 1;
		if(head == null)
		{
			head= new DLLNode(data);
			//return;
		}
		else
		{
			temp= new DLLNode(data);
			if(position == 0)
			{
				temp.next= head;
				head.prev= temp;
				head= temp;
			}
			else
			{
				t= head;
				while(t != null)
				{
					if(c != position)
					{
						t= t.next;
						c++;
					}
					else
					{
						temp.next= t.next;
						t.next= temp;
						temp.prev= t;
						if(temp.next != null)
							temp.next.prev= temp;
						break;
					}
				}
			}
		}
		
	} //end of insert
	
	//Delete method
	public void delete(int data)
	{
		if(head.data == data)
		{
			head= head.next;
			head.prev= null;
		}
		else
		{
			DLLNode previous;
			DLLNode temp= head;
			while(temp.next != null)
			{
				if(temp.data == data)
				{
					temp.prev.next= temp.next;
					temp.next.prev= temp.prev;
					temp.next= null;
					temp.prev= null;
					break;
				}
				temp= temp.next;
			}
			if(temp.data == data)
			{
				temp.prev.next= null;
				temp.prev= null;
			}
		}
	}
	
	//method to print the Doubly Link List
	public void print()
	{
		DLLNode temp= head;
		System.out.println("The list is ");
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DLL l= new DLL();
		l.insert(1, 0);
		l.print();
		l.insert(2, 1);
		l.print();
		l.insert(3, 2);
		l.print();
		l.insert(4, 3);
		l.print();
		l.insert(5, 2);
		l.print();
		l.delete(4);
		l.print();
	}
}
