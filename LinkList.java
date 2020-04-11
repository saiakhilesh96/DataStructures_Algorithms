//Aum Sri Sai Ram
//This Program demonstrates the insert and delete operations of a singly linked list in java

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data= data;
	}
	public void setdata(int data)
	{
		this.data= data;
	}
	public int getdata()
	{
		return data;
	}
	public void setNext(Node next)
	{
		this.next= next;
	}
	public Node getNext()
	{
		return this.next;
	}
}

public class LinkList 
{
	Node head;
	public void insert(int data,int pos)
	{
		System.out.println("Insert method"+data+"at"+pos);
		int c= 1;
		Node temp,x;
		temp= new Node(data);
		if(head == null)
		{
			head= temp;
		}
		else
		{
			if(pos == 0)
			{
				temp.next= head;
				head= temp;
			}
			else
			{
				x= head;
				while(x != null)
				{
					if(c != pos)
					{
						x= x.next;
						c++;
					}
					else
					{
						temp.next= x.next;
						x.next= temp;
						break;
					}
				}
			}
		}
		
	}
	
	public void delete(int data)
	{
		if(head.data == data)
			head= head.next;
		else
		{
			Node prev= head;
			Node temp= head;
			while(temp != null)
			{
				if(temp.data == data)
				{
					prev.next= temp.next;
				}
				prev= temp;
				temp= temp.next;
			}
		}
	}
	
	public void print()
	{
		Node temp= head;
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
		LinkList l= new LinkList();
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
