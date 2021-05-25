/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author lenovo
 */
public class StreamString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);
        String s1 =br.readLine();
        System.out.println(checkString(s1));
    }
            
        
    public static boolean checkString (String s2)
      { 
          
      
           
             if (s2.equals(""))
        {
                return false;
        }
        else if (s2==null) 
                {
                    return false;
                }
        else {
            boolean abc= s2.chars().allMatch(s -> Character.isLetter(s));
                    return abc;
           }
    
      };
}

