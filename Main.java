/*
 * Array Examples
 */

import java.util.Scanner;

class Main
{
    public static void main( String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.print(" Please type in an integer: ");
       int n = s.nextInt();
        
       /*
        * Task 1
        * Create an array of integers from 0 to n-1.
        * Call this array ar1.
        * Print it out below.
        */
        
       System.out.println("Task 1");
       int[]ar1=new int[n];
       
       for (int i=0 ; i<n ; i++)
       {
            ar1[i]=i;
            System.out.println("ar1[" + i + "] = "+ar1[i]);
       }
            
       System.out.println(" ");
         
       /*
        * Task 2
        * Create a new array called ar2.
        * Copy the elements of ar1 into ar2.
        */
        
       System.out.println("Task 2");
       int[]ar2=new int[ar1.length];
       
       for (int i=0 ; i<ar2.length ; i++)
       {
            ar2[i]=ar1[i];
            System.out.println("ar2[" + i + "] = "+ar2[i]);
       }
        
       System.out.println(" ");
        
       /* 
        * Task 3
        * Add 1 to each element in ar1.
        * Print it out below.
        */
       
       System.out.println("Task 3");
       for (int i=0 ; i<ar1.length ; i++)
       {
           ar1[i]++;
           System.out.println("ar1[" + i + "] = "+ar1[i]);
       }
       
       /*
        * Task 4
        * Create a new array called ar3.
        * Copy the elements of ar1 into ar3.  Then do it again
        * For example...
        * ar1: 1 2 3
        * ar3: 1 2 3 0 1 2 3
        */
       
       System.out.println("Task 4");
       int[]ar3=new int[ar1.length*2];
       for (int i=0 ; i<ar1.length ; i=i++)
       {
           ar3[i]=ar1[i];
           System.out.println("ar3[" + i + "] = "+ar3[i]);
       }
       
       for (int i=0 ; i<ar1.length ; i=i++)
       {
           ar3[i+ar3.length]=ar1[i];
           System.out.println("ar3[" + i+ar3.length + "] = "+ar3[i]);
       }
 
       /*
        * Task 5
        * Switch the first and last element of ar1.
        * Print out the new ar1.
        * Then switch them back.
        */
        
        /*
         * Task 6A. Print the 2nd to (n-1)th elements of ar1
         * Task 6B: Print out just the odd numbers in ar1
         * Task 6C: Print out the elements of ar1 when
         *          the indices are multiples of 3
         *         
         */
        
        /*
         * Task 7.  For each element in ar1, 
         *          If the element is even: leave alone
         *          if the element is odd, multiply by 10
         *          print out the new ar1
         *          Example
         *          ar[0]=10
         *          ar[1]=2
         *          ar[2]=30
         *          ar[3]=4
         */
        
         /*
          * Task 8
          *    Create an array called ar2odds
          *    If the index of ar2 is odd, copy it to ar2odds.
          *    If not, do not
          *    ar2[0]=0
          *    ar2[1]=1  ->  ar2odds[0]=1
          *    ar2[2]=2
          *    ar2[3]=3  ->  ar2odds[1]=3
          */
         
        /*
         * Task 9
         * In the array ar2, count how many odd numbers you have.
         * Then create a new array called ar4.
         * Copy just the odd numbers from ar1 into ar4.
         * Print ar4.
         */
        
       System.out.println("Task 9");
       int ar2oddslengthcount=0;
        /*
         * Task 10
         * Shift the elements of ar4 right by 1.
         * For example...
         * old   ar4: 1 3 5 7 9
         * new   ar4  9 1 3 5 7
         */
        
        
        /*
         * Task 11.  Reverse the order of elements in ar2
         */
        
        
        /*
         * Task 12: 
         * Create an array of Strings called ar5.
         * 
         * Each element is a word of the following phrase
         * 
         * 
         * Four score and seven years ago our fathers brought forth on
         * this continent a new nation
         *
         *. ar5[0] = "Four"
         *  ar5[1] = "score"
         *  
         *  Create another array of ints called ar6.  Write a for loop that
         *  will iterate through each element in ar5 and the length of the
         *  word is the element in ar6.
         *  
         *  ar5[0]= "Four"   ar6[0]=4
         *  ar5[1]="score"   ar6[1]=5
         *  ar5[2]="and"     ar6[2]=3
         *  
         *  Count how many words have more than 5 letters.
         */
        
       /*
        * Task 13
        * Create an array called monsterArray of 5 Monsters.
        * The name of the monsters are:
        * "Cookie"
        * "Grover"
        * "Oscar the Grouch"
        * "Elmo"
        * "Rosita"
        * Print out their names
        * Use a for loop to print out the names of monster that start with
        * a vowel
        */
       
       System.out.println("Task 13");
       String []monsterArray = {"Cookie", "Grover", "Oscar the Grouch", "Elmo", "Rosita"};
       
       for (int i=0 ; i<monsterArray.length; i++)
            System.out.println(" [" + i + "] " + monsterArray[i]);

       for (int i=0 ; i<monsterArray.length; i++)
       {
           char c = monsterArray[i].toLowerCase().charAt(0);
           if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                System.out.println(monsterArray[i]); 
       }
        
         /*
          * Task 14
          * Create an array of integers from 3 to 94 and call it arx
          * Create an array of the indices of arx when the item is
          * divisible by 3.  Call this arindex
          *      arx[0]=94
          *      arx[1]=95
          *      arx[2]=96 // this is divisible.  Index is 2
          *      arx[3]=97
          *      arx[4]=98
          *      arx[5]=99 // this is divisible  Index is 5
          *      
          *      So arindex[0]=2
          *         arindex[1]=5
          */
         
         /*
          * Create an arrary called "fb" and calculate the
          * first 10 fibonacci sequence.  You start with
          * fb[0]=1
          * fb[1]=1
          * fb[2]=fb[0]+fb[1]
          * fb[3]=fb[1]+fb[2]
          * fb[4]=fb[2]+fb[3]
          */
        
    }
}