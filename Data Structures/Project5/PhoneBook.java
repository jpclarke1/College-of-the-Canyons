/* 
      * Project #5 PhoneBook
      * Source Code File: PhoneBook.java 
      * Programmer: Joshua Clarke
      * Due: 6/2/22 
      * Description: Phonebook contains methods to create and operate a binary search tree using object person as a node.
      * It contains methods PoneBook, Add, addNode (supports Add), Delete, deleteNode (supports Delete), Find, findNode (supports Find & Change),
      * Change, Quit, and Output (supports Quit). It also contains and integer key to turn the given name into a key.
      */ 
import java.io.*;
public class PhoneBook {
Person root; 

PhoneBook(){ 
  //restoring phonebook data from text file
      try
      {
        FileInputStream fstream = new FileInputStream("C:\\Users\\schwa\\Desktop\\Data Stuctures HW\\Project5\\PhoneBook.txt");
        DataInputStream restore = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(restore));
        String str;
        while ((str = br.readLine()) != null)   {
            String[] tokens = str.split(": ");
            this.Add(tokens[0],tokens[1]);
        }
    restore.close();
      }
      //if no file found, create new phonebook
      catch(Exception e)
      {
        root = null;
      }
} 

//int key, makes name into key using unicode code points with reference to 'a'
int key(String name) {
      int num = 0;
      name = name.replace(" ", "");
      char[] c = name.toCharArray();
  for (Character n : c) {
      num += (n-'a'+1);
  }
  return num;
  }

//Add function 
void Add(String name, String pNumber)  { 
      root = addNode(root, name, pNumber); 
  } 
 
//recursive addNode function
Person addNode(Person root, String name, String pNumber) { 
      //if tree is empty
      if (root == null) { 
          root = new Person(name, pNumber); 
          return root; 
      } 

      //recursively traversing the tree
      if (key(name) < root.key)
          root.left = addNode(root.left, name, pNumber); 
      else if (key(name) > root.key)
          root.right = addNode(root.right, name, pNumber); 
      return root; 
  } 

//Delete function
void Delete(String name) { 
      root = deleteNode(root, key(name)); 
} 
 
//recursive deleteNode function
Person deleteNode(Person root, int key)  { 
      //if tree is empty
      if (root == null)  return root; 

      //recursively traversing the tree
      if (key < root.key)
          root.left = deleteNode(root.left, key); 
      else if (key > root.key)
          root.right = deleteNode(root.right, key); 
      else  { 

          //if node has one child
          if (root.left == null) 
              return root.right; 
          else if (root.right == null) 
              return root.left; 
 
          //if node has two children
            int min = root.right.key;
            while (root.left != null)  { 
                   min = root.left.key; 
                   root = root.left; 
            } 
          root.key = min; 
          root.right = deleteNode(root.right, root.key); 
      } 
      return root; 
  } 
   
//Find function  
String Find(String name)  { 
      Person temp = root;
      temp = findNode(root, key(name)); 
      return temp.pNumber; 
  } 
 
//recursive find function
Person findNode(Person root, int key)  { 
  if (root == null || root.key == key)
  return root;
   
  if (root.key > key) 
  return findNode(root.left, key); 
  return findNode(root.right, key);
  }

//Change function
void Change(String name, String pNumber) {
  Person temp = root;
    temp = findNode(root, key(name));
    temp.pNumber = pNumber; 
}

//Quit function
void Quit() { 
  //open, recursively write to, and close phonebook text file
    try {
        FileWriter Writer = new FileWriter("C:\\Users\\schwa\\Desktop\\Data Stuctures HW\\Project5\\PhoneBook.txt");
        Output(root, Writer);
        Writer.close();
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
  } 

//recursive output function
void Output(Person root, FileWriter Writer) { 
      if (root != null) { 
          Output(root.left, Writer);
          try {
            //write phonebook data to file
            Writer.append(root.name + ": " + root.pNumber + "\n");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          } 
          Output(root.right, Writer);
      } 
  }
  

   
}
