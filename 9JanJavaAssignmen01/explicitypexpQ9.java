// 9. WAP to demonstrate explicit type conversion.
class explicitypexpQ9 
{
        public static void main(String[] args) 
        {
            double largeNumber = 123.456;
    
            int convertedInt = (int) largeNumber; 
    
            float convertedFloat = (float) largeNumber;
    
            int largeInt = 130; 
            byte convertedByte = (byte) largeInt;
    
            System.out.println("Original double: " + largeNumber);
            System.out.println("Converted to int: " + convertedInt); 
            System.out.println("Converted to float: " + convertedFloat);
            System.out.println("Original int: " + largeInt);
            System.out.println("Converted to byte: " + convertedByte); 
        }
}
