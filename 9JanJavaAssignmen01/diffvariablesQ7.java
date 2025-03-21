// 7. WAP to demonstrate how to create variables of different types.
class diffvariablesQ7 
{
        public static void main(String[] args) 
        {
            byte smallNumber = 100;          
            short mediumNumber = 20000;       
            int largeNumber = 100000;         
            long veryLargeNumber = 10000000000L; 
    
           
            float pi = 3.1415f;              
            double bigDecimal = 12345.6789;   
    
            char letter = 'A';               
    
            boolean isJavaFun = true;        
    
            System.out.println("Integer Data Types:");
            System.out.println("byte: " + smallNumber);
            System.out.println("short: " + mediumNumber);
            System.out.println("int: " + largeNumber);
            System.out.println("long: " + veryLargeNumber);
    
            System.out.println("\nFloating-point Data Types:");
            System.out.println("float: " + pi);
            System.out.println("double: " + bigDecimal);
    
            System.out.println("\nCharacter Data Type:");
            System.out.println("char: " + letter);
    
            System.out.println("\nBoolean Data Type:");
            System.out.println("boolean: " + isJavaFun);
        }
}
