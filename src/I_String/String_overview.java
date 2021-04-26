package I_String;

public class String_overview {

	public static void main(String[] args) {

        // Creates a string literal
         String str = "geeks";
         String s1 = "geeksforgeeks";
         String s2 = "geeks";

        // Returns the number of 
        // characters in the String. 
        System.out.println(str.length());
        
        // Returns the character at ith index. 
        System.out.println(str.charAt(3)); 
                           
        // Return the substring from the 
        // ith  index character 
        // to end of string 
        System.out.println(str.substring(2)); 
  
        // Returns the substring from i to j-1 index. 
        System.out.println(str.substring(2,5)); 
        System.out.println(str.substring(2,4));
        
        
        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s1.indexOf(s2));
        
        //CompareTO
        int res = s1.compareTo(s2);
        
        if(res == 0)
            System.out.println("Same");
        
        if(res > 0)
            System.out.println("s1 is Greater");
            
        if(res < 0)
            System.out.println("s1 is Smaller");
        
        // Whether s2 equal to s1
        System.out.println(s1.equals(s2));
        
        // Whether s2 is present in s1 or not
        // true
        System.out.println(s1.contains(s2));
        
        // Checking if both point to the
        // same object or not
        if(s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        // Creating a string using 
        // new operator
        String s3 = new String("geeks");
        
        // Checking if both point to the
        // same object or not
        if(s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");

	}

}
