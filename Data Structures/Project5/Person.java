/* 
      * Project #5 Person
      * Source Code File: Person.java 
      * Programmer: Joshua Clarke
      * Due: 6/2/22 
      * Description: Class creates a Person object which stores a name and phone number
      */ 
      public class Person {
        int key;
        String name, pNumber;
        Person left, right;
    
        //person object (node)
        public Person(String Name, String phone){ 
            pNumber = phone;
            String temp = Name;
            name = Name;
            //creating key based on name using unicode code points with reference to 'a'
            name = name.replace(" ", "");
            char[] c = name.toCharArray();
        for (Character n : c) {
            key += (n-'a'+1);
        }
            name = temp;
            left = right = null;
        } 
}