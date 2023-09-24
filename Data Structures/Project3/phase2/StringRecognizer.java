/* 
      * Project #3 StringRecognizer
      * Source Code File: StringRecognizer.java 
      * Programmer: Joshua Clarke
      * Due: 4/12/22 
      * Description: This program checks if a user entered string is in language (ie. abc$cba) 
      */ 
import java.util.Scanner;
public class StringRecognizer {
public static void main(String[] args) {
StackReferenceBased stack = new StackReferenceBased();

Scanner scan = new Scanner(System.in);
System.out.println("Enter a string to test if it is in Language (for example \"abc$cba\" is in language)");
String aString = scan.nextLine(); 

//adding characters before $ to stack
int i = 0;
char ch = aString.charAt(i);
while (ch != '$') {
stack.push(ch);
i++;
if (i < aString.length()) {
ch = aString.charAt(i);
}
else {
break;
}
}

i++; // skips over $

//matching reverse of string before $
boolean inLanguage = true;
while (inLanguage && i < aString.length()) {
ch = aString.charAt(i);
try {
char top = stack.pop().toString().charAt(0);
if (top == ch) {
i++;
}
else {
inLanguage = false;
}
} 
catch (StackException e) {
inLanguage = false;
}
}

//outputting if entered string is in language 
if (inLanguage && stack.isEmpty()) {
System.out.println(aString + " is in language");
}
else {
System.out.println(aString + " is not in language");
}
}
}
