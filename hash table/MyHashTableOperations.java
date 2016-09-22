
/**
 * Write a description of class MyHashTableOperations here.
 * 
 * @author (your name) 
 * @version (10/30/2014)
 */
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;
public class MyHashTableOperations
{
  public static void main(String a[])
  //Creae Hash Table
  {
      Hashtable<String, String> ht = new Hashtable<String,String>();
      //add key value pair to the table
      
      ht.put("first","First Inserted Value");
      ht.put("second","Second Inserted Value");
      ht.put("third","Third Inserted Value");
      
      System.out.println(ht);
      //getting value for a given key second
      System.out.println("value of key 'second' :"+ ht.get("second"));
      System.out.println("Is hashtable empty:" + ht.isEmpty());
      ht.remove("third");
      System.out.println("after delete 'third' pair");
      System.out.println(ht);
      System.out.println("size of the table is:" + ht.size());
      
      //Clear all
      ht.clear();
      System.out.println("table after clear:" + ht);
      
      ht.put("first","First Inserted Value");
      ht.put("second","Second Inserted Value");
      ht.put("third","Third Inserted Value");
      
      //traverse a table 
      Set<String> keys = ht.keySet();
      for(String key:keys)
    {
        System.out.println("value of " + key + "is: " + ht.get(key));
        
    }
    
    //spoy may/hash table
    HashMap<String,String> subMap = new HashMap<String,String>();
    subMap.put("s1", "S1 Value");
    subMap.put("s2", "S2 Value");
    ht.putAll(subMap);
    
    System.out.println(ht);
    
      
  }
    
    
}
