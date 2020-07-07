package stackProblems;

public class twoStackArray {
	int size;
	int top1,top2;
	int arr[];
	
	 twoStackArray(int x) {
		arr = new int[x];
		size = x;
		top1 = -1;
		top2 = size;
	}
	 
	 void push1(int a) {
		 if(top1 < top2-1) {
			 top1++;
			 arr[top1] = a;
			 System.out.println("pushed element in stack-1 is: "+arr[top1]);
		 }else {
			 System.out.println("Stack is overflowed");
		 }
	 }
	 void push2(int a) {
		 if(top1 < top2-1) {
			 top2--;
			 arr[top2] = a;
			 System.out.println("pushed element in stack-2 is: "+arr[top2]);
		 }else {
			 System.out.println("Stack is overflowed");
		 }
	 }
	 
	 void pop1() {
		 if(top1>=0) {
			 int x = arr[top1];
			 top1--;
		 }else {
			 System.out.println("Stack is empty");
		 }
	 }
	 void pop2() {
		 if(top2<size) {
			 int y = arr[top2];
			 top2++;
		 }else {
			 System.out.println("Stack is empty");
		 }
	 }
	 
	 public static void main(String args[]) {
		 twoStackArray p = new twoStackArray(10);
		 p.push1(5);
		 p.push2(10);
	 }
}
