import java.util.*;
class Q1{
	
	void insertionSort(int a[], int n){
		for(int i = 1; i < n; i++){
			int temp = a[i];
			int j = i -1;
			while(j > 0 && a[j] > temp){
				a[j+1] = a[j];
				j--;
				print(a);
			}
			a[j+1] = temp;
		}
		
		
	}
	
	void print(int a[]){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	


	public static void main(String[] args){
		Q1 q1 = new Q1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		System.out.println("Test case: ");
		int a1[] = new int[size];
		System.out.println("Enter the elements of an array: ");
		for(int i = 0; i < size; i++){
			a1[i] = sc.nextInt();
		}
		
		System.out.println("Output: ");
		q1.insertionSort(a1, size);
		
		q1.print(a1);
		
	}
}


/* C:\Users\shrut\Desktop\220340520093>javac Q1.java

C:\Users\shrut\Desktop\220340520093>java Q1
Enter the size of an array:
5
Test case:
Enter the elements of an array:
2 4 6 8 3
Output:
2 4 6 8 8
2 4 6 6 8
2 4 4 6 8
2 3 4 6 8 */