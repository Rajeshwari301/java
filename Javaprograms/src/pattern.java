/**
 * Write a method to print each of the followings patterns using nested loops 
 * in a class called PrintPatterns. The signatures of the methods are:
 * 
 * public static void printPatternX(int size)  // 'X' from 'A' to ..., size is a positive integer.
 * #                    # # # # # # # #      # # # # # # # #                    #
 * # #                  # # # # # # #          # # # # # # #                  # #
 * # # #                # # # # # #              # # # # # #                # # #
 * # # # #              # # # # #                  # # # # #              # # # #
 * # # # # #            # # # #                      # # # #            # # # # #
 * # # # # # #          # # #                          # # #          # # # # # #
 * # # # # # # #        # #                              # #        # # # # # # #
 * # # # # # # # #      #                                  #      # # # # # # # #
 *      (a)                   (b)                  (c)                  (d)
 * 
 * Hints: On the diagonal, row = col.  On the opposite diagonal, row + col = size + 1.
 * 
 * # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
 * #           #      #                        #        #       #      # #       # #
 * #           #        #                    #            #   #        #   #   #   #
 * #           #          #                #                #          #     #     #
 * #           #            #            #                #   #        #   #   #   #
 * #           #              #        #                #       #      # #       # #
 * # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
 *      (e)               (f)             (g)              (h)              (i)
 * 
 * # # # # # # # # # # #                #                          #
 *   # # # # # # # # #                # # #                      # # #
 *     # # # # # # #                # # # # #                  # # # # #
 *       # # # # #                # # # # # # #              # # # # # # #
 *         # # #                # # # # # # # # #          # # # # # # # # #
 *           #                # # # # # # # # # # #      # # # # # # # # # # #
 *          (j)                        (k)                 # # # # # # # # #
 *                                                           # # # # # # #
 *                                                             # # # # #
 *                                                               # # #
 *                                                                 #
 *                                                                (l)
 * 
 * 1                    1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1
 * 1 2                    1 2 3 4 5 6 7                  2 1      7 6 5 4 3 2 1
 * 1 2 3                    1 2 3 4 5 6                3 2 1      6 5 4 3 2 1
 * 1 2 3 4                    1 2 3 4 5              4 3 2 1      5 4 3 2 1
 * 1 2 3 4 5                    1 2 3 4            5 4 3 2 1      4 3 2 1
 * 1 2 3 4 5 6                    1 2 3          6 5 4 3 2 1      3 2 1
 * 1 2 3 4 5 6 7                    1 2        7 6 5 4 3 2 1      2 1
 * 1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1      1
 *      (m)                  (n)                    (o)                (p)
 * 
 *               1                    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
 *             1 2 1                    1 2 3 4 5 6 7 6 5 4 3 2 1
 *           1 2 3 2 1                    1 2 3 4 5 6 5 4 3 2 1
 *         1 2 3 4 3 2 1                    1 2 3 4 5 4 3 2 1
 *       1 2 3 4 5 4 3 2 1                    1 2 3 4 3 2 1
 *     1 2 3 4 5 6 5 4 3 2 1                    1 2 3 2 1
 *   1 2 3 4 5 6 7 6 5 4 3 2 1                    1 2 1
 * 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1                    1
 *              (q)                                (r)
 * 
 * 1                           1      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
 * 1 2                       2 1      1 2 3 4 5 6 7   7 6 5 4 3 2 1
 * 1 2 3                   3 2 1      1 2 3 4 5 6       6 5 4 3 2 1
 * 1 2 3 4               4 3 2 1      1 2 3 4 5           5 4 3 2 1
 * 1 2 3 4 5           5 4 3 2 1      1 2 3 4               4 3 2 1
 * 1 2 3 4 5 6       6 5 4 3 2 1      1 2 3                   3 2 1
 * 1 2 3 4 5 6 7   7 6 5 4 3 2 1      1 2                       2 1
 * 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1      1                           1
 *              (s)                                (t)
 *    
 *               1
 *             2 3 2
 *           3 4 5 4 3
 *         4 5 6 7 6 5 4
 *       5 6 7 8 9 8 7 6 5
 *     6 7 8 9 0 1 0 9 8 7 6
 *   7 8 9 0 1 2 3 2 1 0 9 8 7 
 * 8 9 0 1 2 3 4 5 4 3 2 1 0 9 8
 *              (u)
 * 
 */

//package javaexercises.difficult;

/**
 *
 * @author User
 */
public class pattern {
    
    public static void main(String[] args)
    {
        pattern aPrintPatterns = new pattern();
        
        int size = 3;
        /*System.out.println("Pattern A");
        aPrintPatterns.printPatternA(size);
        System.out.println("Pattern B");
		
		 aPrintPatterns.printPatternB(size); 
		 System.out.println("Pattern C");
		 aPrintPatterns.printPatternC(size); */
		 System.out.println("Pattern D");
		 aPrintPatterns.printPatternD(size); System.out.println("Pattern E");
		 /* aPrintPatterns.printPatternE(size); System.out.println("Pattern F");
		 * aPrintPatterns.printPatternF(size); System.out.println("Pattern G");
		 * aPrintPatterns.printPatternG(size); System.out.println("Pattern H");
		 * aPrintPatterns.printPatternH(size); System.out.println("Pattern I");
		 * aPrintPatterns.printPatternI(size); System.out.println("Pattern J");
		 * aPrintPatterns.printPatternJ(size); System.out.println("Pattern K");
		 * aPrintPatterns.printPatternK(size); System.out.println("Pattern L");
		 * aPrintPatterns.printPatternL(size); System.out.println("Pattern M");
		 * aPrintPatterns.printPatternM(size); System.out.println("Pattern N");
		 * aPrintPatterns.printPatternN(size); System.out.println("Pattern O");
		 * aPrintPatterns.printPatternO(size); System.out.println("Pattern P");
		 * aPrintPatterns.printPatternP(size); System.out.println("Pattern Q");
		 * aPrintPatterns.printPatternQ(size); System.out.println("Pattern R");
		 * aPrintPatterns.printPatternR(size); System.out.println("Pattern S");
		 * aPrintPatterns.printPatternS(size); System.out.println("Pattern T");
		 * aPrintPatterns.printPatternT(size); System.out.println("Pattern U");
		 * aPrintPatterns.printPatternU(size);
		 */
        
    }
    
    
   /* public void printPatternA(int size)
    {
    	for (int i=1;i<=size;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("# ");
    		}
    		System.out.println();
    	}
    }
    
    public void printPatternB(int size)
    {
    	for (int i=size;i>=1;i--)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("# ");
    		}
    		System.out.println();
    	}
    }
    
    public void printPatternC(int size)
    {
    	for (int i=1;i<=size;i++)
    	{
    		for(int j=1;j<=size;j++)
    		{
    			System.out.print((j>=i)? "# " : "  ");
    		}
    		System.out.println();
    	}
    }*/
    public void printPatternD(int size)
    {
    	for (int row=size;row>=1;row--)
    	{
    		for(int col=1;col<=size;col++)
    		{
    			System.out.print((col>=row)? "# " : "  ");
    		}
    		System.out.println();
    	}
    }
}