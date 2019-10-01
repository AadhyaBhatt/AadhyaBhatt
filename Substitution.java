/**
 * 
 */

/*
File Name: Substitution.java
Author: Aadhya Bhatt
Date: 24-Jan-2019 12:49:37 PM
Description:
*/

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Scanner;

 
public class Substitution
{
	static char [] keyvalue = new char[29];
	public static char a[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
      'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
      'w', 'x', 'y', 'z','.',',',' '};
    public static char b[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' ,'.',',',' '};
    
    
 
    public static String encryption(char[] g, char[] key)
    {
        char c[] = new char[(g.length)];
        for (int i = 0; i < g.length; i++)
        {
            for (int j = 0; j < 29; j++)
            {
                if (a[j] == g[i])
                {
                    c[i] = key[j];
                    break;
                }
            }
        }
        return (new String(c));
    }
 
    
   public static String decryption(char[] o, char[] key)
    {
        char z[] = new char[(o.length)];
        for (int i = 0; i < o.length; i++)
        {
            for (int j = 0; j < 29; j++)
            {
                if (key[j] == o[i])
                {
                    z[i] = a[j];
                    break;
                }
            }
        }
        return (new String(z));
    }
    
    static char[] shuffle(char[] rm)
	  {
	    
	    Random ram = ThreadLocalRandom.current();
	    for (int i = rm.length - 1; i > 0; i--)
	    {
	      int index = ram.nextInt(i + 1);
	      // We have performed basic swap operation:
	      char q = rm[index];
	     rm[index] = rm[i];
	     rm[i] = q;
	    }
	    return rm;
	  }
 
    public static void main(String args[])
    {
    	keyvalue= shuffle(b);
    	System.out.println("KEYVALUE:" );
	    for (int i = 0; i < keyvalue.length; i++)
	    {
	      System.out.print(keyvalue[i]);
	    }
	      System.out.println();
        Scanner sc = new Scanner(System.in);
        String plaintext="Dont let yesterday take up too much of today.";
        String plaintxt = plaintext.toLowerCase();
        char[] value1 = plaintxt.toCharArray();
        System.out.println("MESSAGETO BE ENCRYPTED: " + plaintext);
        String en = encryption(value1,keyvalue);
        System.out.println("MESSAGE ENCRYPTED: " + en);
        char[] value2 = en.toCharArray();
        
        System.out.println("MESSAGE DECRYPTED: " + decryption(value2,keyvalue));
        sc.close();
    }
}