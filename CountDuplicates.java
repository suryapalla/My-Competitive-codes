import java.lang.*;
import java.util.*;
public class CountDuplicates{
	public static void main(String[] args) {
		int count=0;
		String s="Palla Surya Kumar";
       char[] array=s.toCharArray();
       Map<Character,Integer> map=new HashMap<Character,Integer>();
       for(char temp:array) 
          if(map.containsKey(temp)) map.put(temp,map.get(temp)+1);
          else map.put(temp,1);         

        Set<Character> set=map.keySet(); 
       for(Character temp:set)
       	if(map.get(temp)>1){
           System.out.println("this character "+temp+" has "+map.get(temp)+"duplicates");		
       	}
       	else  System.out.println("this character "+temp+" has no duplicates");
       		
	}
}