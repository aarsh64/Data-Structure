package stackProblems;

import java.util.Arrays;

public class findingSpan {

		static void findSpan(int price[],int n, int S[]) {
			
			S[0] = 1;
			
				for(int i=0; i<n ; i++) {
					S[i] = 1;
					
					for(int j = i-1; (j>=0) && (price[i] >= price[j]); j--) {
							S[i]++;
					}
				}
		}
		static void printArray(int S[]) {
			System.out.println(Arrays.toString(S));
		}
		
		public static void main(String[] args) {
			int price[] = { 10, 4, 20, 15, 7};
			int n = price.length;
			int S[] = new int[n];
		
			findSpan(price,n,S);
			
			printArray(S);
		}
}
