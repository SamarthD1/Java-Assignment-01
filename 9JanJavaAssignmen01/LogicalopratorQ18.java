// 18. WAP to demonstrate logical operators in java.
class LogicalopratorQ18 
{
        public static void main(String[] args) 
        {
            
            int a = 15, b = 10;
    
            System.out.println("AND (&&) Operator:");
            System.out.println("(a > 10) && (b < 20): " + ((a > 10) && (b < 20))); 
            System.out.println("(a > 20) && (b < 20): " + ((a > 20) && (b < 20))); 
    
            System.out.println("\nOR (||) Operator:");
            System.out.println("(a > 10) || (b > 20): " + ((a > 10) || (b > 20))); 
            System.out.println("(a > 20) || (b > 20): " + ((a > 20) || (b > 20))); 
    
            System.out.println("\nNOT (!) Operator:");
            System.out.println("!(a > 10): " + (!(a > 10))); 
            System.out.println("!(b > 20): " + (!(b > 20))); 
    
            boolean isStudent = true, hasJob = false;
            
            System.out.println("\nCombining Logical Operators:");
            System.out.println("isStudent && hasJob: " + (isStudent && hasJob)); 
            System.out.println("isStudent || hasJob: " + (isStudent || hasJob)); 
            System.out.println("!(isStudent && hasJob): " + (!(isStudent && hasJob))); 
        }
}
