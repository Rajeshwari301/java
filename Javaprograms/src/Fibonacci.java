public class Fibonacci {
   public static void main (String[] args) {
      int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
      int fn;             // F(n) to be computed
      int fnMinus1 = 1;   // F(n-1), init to F(2)
      int fnMinus2 = 1;
      int fnMinus3 = 2;            
      // F(n-2), init to F(1)
      int nMax = 20;      // maximum n, inclusive
      int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
      double average;
 
      System.out.println(fnMinus1 +"\n"+ fnMinus2+"\n"+fnMinus3);
      
 
      while (n <= nMax) {  // n starts from 3
            // n = 3, 4, 5, ..., nMax
         // Compute F(n), print it and add to sum
         fn = fnMinus1+fnMinus2+fnMinus3;
         System.out.println(fn);
         // Increment the index n and shift the numbers for the next iteration
         fnMinus1 = fnMinus2;
         fnMinus2 = fnMinus3;
         fnMinus3 = fn;
         n++;
      }
 
      // Compute and display the average (=sum/nMax).
      // Beware that int/int gives int.
      
   }
}