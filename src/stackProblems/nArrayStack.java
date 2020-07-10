package stackProblems;

public class nArrayStack {

		int arr[];
		int next[];
		int top[];
		int free,n,k;
		
		nArrayStack(int k1,int n1){
			
			k=k1;
			n=n1;
			arr = new int[n]; 
            top = new int[k]; 
            next = new int[n]; 
			
			for(int i=0;i<k;i++) {
				top[i]=-1;
			}
			free = 0;
			for(int i=0;i<n-1;i++) {
				next[i] = i+1;
			}
			next[n-1] = -1;
		}
		
		boolean isFull() {
			return (free == -1);
		}
		
		void push(int data,int x) {
			if (isFull()) {
				System.out.println("Stack is overflowed!");
				return;
			}
			int i = free;
			
			free = next[i];
			
			next[i] = top[x];
			top[x] = i;
			
			arr[i] = data;
		}
		
		int pop(int x) {
			
			if(isEmpty(x)) {
				System.out.println("Stack is Empty!");
				return Integer.MAX_VALUE;
			}
			
			int i = top[x];
			
			top[x] = next[i];
			next[i] = free;
			
			free = i;
			
			return arr[i];
			
		}	
			
		boolean isEmpty(int x) {
			
			return(top[x] == -1);
		}
		
		
		public static void main(String[] args) {
			nArrayStack p = new nArrayStack(5,5);
			
			p.push(5, 1);
	        System.out.println("Popped element from stack 1 is " + p.pop(1)); 

		}
}
