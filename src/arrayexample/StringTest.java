package arrayexample;

import java.util.Locale;

public class StringTest {

  public static void main(String[] args) {
    //Creates a String object
    String s1 = new String("STRING ONE");
    
    //Doesnt work....Strings are imutable
    s1.toLowerCase();
    System.out.println(s1);
    
    //Assign to new object and let the old one go to garbage collection
    s1 = s1.toLowerCase();
   
    System.out.println(s1);
    
    
  }
}
