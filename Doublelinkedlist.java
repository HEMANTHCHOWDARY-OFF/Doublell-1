
import java.util.*;
class Node
{
	int data;
	Node prev;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.prev=this.next=null;
	}
}
public class Doublelinkedlist {
	Node head=null;
	public void insert(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.prev=temp;
	}
	public void display()
	{
		Node temp=head;
		int i=1;
		while(temp!=null)
		{
			System.out.print("node "+i+" : "+temp.data+"  <->  ");
			temp=temp.next;
			i++;
		}
		System.out.println("null");
	}
	public void reverse()
	{
		Node current=head;
		Node next=null;
		Node prev=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			current.prev=next;
			prev=current;
			current=next;
		}
		head = prev;
	}
public static void main(String...args)
{
	Doublelinkedlist list = new Doublelinkedlist();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of nodes to enter:");
	int num=sc.nextInt();
	int i,data;
	for(i=1;i<=num;i++)
	{
		System.out.println("enter the node  "+i);
		data=sc.nextInt();
		list.insert(data);
	}
	System.out.println("displaying the entered list:");
	list.display();
	list.reverse();
	System.out.println("list after reversing it :");
	list.display();
}
}
