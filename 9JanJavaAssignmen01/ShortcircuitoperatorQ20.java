class ShortcircuitoperatorQ20 
{
        public static void main(String[] args) 
        {
            
            int a = 10, b = 20;
    
            System.out.println("Short-circuit AND (&&) Operator:");
            
            if (a > 20 && ++b > 20) {
                System.out.println("Both conditions are true.");
            } else {
                System.out.println("Short-circuit AND: Second condition not evaluated, b = " + b); 
            }
    
            System.out.println("\nShort-circuit OR (||) Operator:");
            
            if (a < 20 || ++b > 20) {
                System.out.println("At least one condition is true.");
            } else {
                System.out.println("This will not be executed.");
            }
            System.out.println("Short-circuit OR: Second condition not evaluated, b = " + b); 
    
            if (a < 20 || b > 20) {
                System.out.println("Both conditions can be true in OR (||).");
            }
        }
}
