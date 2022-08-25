import java.util.Arrays;
public class Stringlength
{

    public static void main(String[] args)    
	{ 	
	  
	String[] s1 = {"A","is","this","easiest","example"};  //defining an array of type String 
	int size = s1.length;    // length of the array
	for(int i = 0; i<size-1; i++)    //logic for sorting       
        {  
	for (int j = i+1; j<s1.length; j++)   
	{  
	//compares each elements of the array to all the remaining elements 
	if(s1[i].compareTo(s1[j])>0)   
	{  
	String temp = s1[i];  //swapping array elements 
	s1[i] = s1[j];  
	s1[j] = temp;  
	}  
        }  
	}  
        System.out.println(Arrays.toString(s1));  //prints the sorted array in ascending order  
      }
}
    
    
    

