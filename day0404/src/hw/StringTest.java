package hw;

import java.util.Scanner;

public class StringTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("���ڿ��� �Է�");
      String str = scan.nextLine();
      
      System.out.println("�� ���ڿ��� ���� : " + str.length());
      String[] word = str.split(" ");
      System.out.println("�ܾ��� �� : " + word.length);

      System.out.println("�� �ܾ��� �� ��");
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