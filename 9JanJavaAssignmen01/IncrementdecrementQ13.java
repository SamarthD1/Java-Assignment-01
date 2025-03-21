// 13. WAP to demonstrate increment (pre and post) and decrement(pre and post) operators.
class IncrementdecrementQ13 
{
        public static void main(String[] args) 
        {

            int a = 5, b = 10;
    
            System.out.println("Initial values:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
    
            System.out.println("\nPost-increment:");
            System.out.println("a++ = " + (a++)); 
            System.out.println("Value of a after post-increment: " + a);
    
            System.out.println("\nPre-increment:");
            System.out.println("++a = " + (++a)); 
            System.out.println("Value of a after pre-increment: " + a);

            System.out.println("\nPost-decrement:");
            System.out.println("b-- = " + (b--)); 
            System.out.println("Value of b after post-decrement: " + b);
    
            System.out.println("\nPre-decrement:");
            System.out.println("--b = " + (--b)); 
            System.out.println("Value of b after pre-decrement: " + b);
        }
}
