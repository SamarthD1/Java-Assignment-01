// 14. WAP to demonstrate compound assignment operator.
class CompoundassignmentoprQ14 
{
        public static void main(String[] args) 
        {

            int a = 10, b = 5;
    
            System.out.println("Initial values:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
    
            System.out.println("\nUsing compound assignment operators:");
    
            a += b; 
            System.out.println("a += b: " + a);
    
            a -= b;
            System.out.println("a -= b: " + a);
    
            a *= b; 
            System.out.println("a *= b: " + a);
    
            a /= b; 
            System.out.println("a /= b: " + a);
    
            a %= b; 
            System.out.println("a %= b: " + a);
        }
}
