// 10. WAP to demonstrate implicit type conversion.
class implicittypconvQ10 
{
        public static void main(String[] args) 
        {
            
            byte smallNumber = 42;
            int intNumber = smallNumber; 
    
            float decimalNumber = intNumber; 
    
            long largeInteger = intNumber; 
            double largeDecimal = decimalNumber; 
    
            System.out.println("Original byte value: " + smallNumber);
            System.out.println("Implicitly converted to int: " + intNumber);
            System.out.println("Implicitly converted to float: " + decimalNumber);
            System.out.println("Implicitly converted to long: " + largeInteger);
            System.out.println("Implicitly converted to double: " + largeDecimal);
        }
    
}
