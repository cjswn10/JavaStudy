package hw;

import java.util.Scanner;

public class StringTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("문자열을 입력");
      String str = scan.nextLine();
      
      System.out.println("총 문자열의 길이 : " + str.length());
      String[] word = str.split(" ");
      System.out.println("단어의 수 : " + word.length);

      System.out.println("각 단어의 빈도 수");
      int[] count = new int[word.length];
      for(int i = 0; i < word.length; i++) {
        if(count[i] == -1)
           continue;
        
        count[i] = 1;
         for(int j = i + 1; j < word.length; j++) 
            if(word[i].equals(word[j])) {
               count[i]++;
               count[j] = -1;
            }
         
        System.out.println(word[i] + " : " + count[i]);
        
      }
   }
}