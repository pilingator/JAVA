//Сделать программу, в рамках которой необходимо определить какой символ сколько раз встречается в строке. 
//Например: входящая строка вида - "aaaaabbbbcddd" мы должны получить - "a5b4c1d3".

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = sc.nextLine();
        String outputString = " ";
        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {
            count = 1;
            while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
                i++;
            }
            outputString = outputString + inputString.charAt(i) + count;
        }
        System.out.println("Input data string : " + inputString);
        System.out.println("Output data string : " + outputString);

    }

}
