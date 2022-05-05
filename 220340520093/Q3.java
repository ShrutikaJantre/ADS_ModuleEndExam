class Stack1{

	int size;
	int top1, top2;
	int finalArray[];
	
	
	Stack1(int num){
		finalArray = new int[num];
		this.size = num;
		top1 = -1;
		top2 = size;
	}
	
	void push1(int num2){
		
		if(top1 < size-1 ){
			top1++;
			finalArray[top1] = num2;
		}
		else{
			System.out.println("Stack Overflow!!!");
			System.exit(1);
		}
		
	}
	
	void push2(int num3){
		
		if(top1 < size-1 ){
			top2--;
			finalArray[top2] = num3;
		}
		else{
			System.out.println("Stack Overflow!!!");
			System.exit(1);
		}
		
	}
	
	int popStack1(){
		
		if(top1 >= 0){
			int num4 = finalArray[top1];
			top1--;
			return num4;
		}
		else{
			System.out.println("Stack Underflow!!!");
			System.exit(1);
		}
		return 0;
	}
	int popStack2(){
		
		if(top2 < size){
			int num5 = finalArray[top2];
			top2--;
			return num5;
		}
		else{
			System.out.println("Stack Underflow!!!");
			System.exit(1);
		}
		return 0;
	}
	
	
}	
class Q3{
	public static void main(String args[]){
		Stack1 s1 = new Stack1(100);
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		
		System.out.println("Popped element from stack1 is "+(s1.popStack1()));
		System.out.println("Popped element from stack2 is "+(s1.popStack2()));
	}


}


/* C:\Users\shrut\Desktop\220340520093>javac Q3.java

C:\Users\shrut\Desktop\220340520093>java Q3
Popped element from stack1 is 11
Popped element from stack2 is 40
 */