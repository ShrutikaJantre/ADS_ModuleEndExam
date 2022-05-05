import java.util.*;

class ReverseLinkedList1{

	LinkedListNode head;
	static class LinkedListNode{
		int data;
		LinkedListNode next;
		
		LinkedListNode(int num){
			data = num;
			next = null;
		}
	}
	
	void insert(int num1){
		LinkedListNode newNode = new LinkedListNode(num1);
		LinkedListNode temp = head;
		if(temp == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;	
	}
	
	void display(){
		if(head == null){
			System.out.println("Linked list is Empty!!!");
		}
		LinkedListNode temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	LinkedListNode reverse(){
		LinkedListNode curr = head;
		LinkedListNode pointer = null;
		LinkedListNode temp;
		while(curr != null){
			temp = curr.next;
			curr.next = pointer;
			pointer = curr;
			curr = temp;
			
		}
		
		head = pointer;
		return head;
	}
}

class Q2{

	public static void main(String args[]){
		ReverseLinkedList1 r1 = new ReverseLinkedList1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the linked list: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the data values of the elements in the linked list.: ");
		for(int i = 0; i < size; i++){
			r1.insert(sc.nextInt());
		}
		System.out.println("Test case: ");
		r1.display();
		r1.reverse();
		System.out.println();
		System.out.println("Output: ");
		r1.display();
	}
}