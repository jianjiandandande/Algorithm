package HUAWEI108;

import java.util.Scanner;

/**
 * Created by Vincent on 2018/1/3 8:40
 * <p>
 * 题目要求：写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * <p>
 * 例如：输入：ABCDEF A；输出：1
 **/
public class CountOfAChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String inputChar = scanner.nextLine();
        int countChar = 0;


        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == inputChar.charAt(0)||
                    inputString.charAt(i) == inputChar.toUpperCase().charAt(0)||
                    inputString.charAt(i) == inputChar.toLowerCase().charAt(0)){
                countChar++;
            }

        }

        System.out.println(countChar);


    }
}
