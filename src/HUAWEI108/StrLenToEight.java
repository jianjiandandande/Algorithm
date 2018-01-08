package HUAWEI108;

import java.util.Scanner;

/**
 * Created by Vincent on 2018/1/8 11:52
 *
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 **/
public class StrLenToEight {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //createStr(str1);
        createStr(str2);
    }



    public static void createStr(String str){

        if (str.length()<=100) {

            while (str.length() >= 8) {
                System.out.println(str.substring(0, 8));
                str = str.substring(8, str.length());
            }
            if (str.length() > 0) {
                while (str.length() < 8) {
                    str = str + "0";
                }
                System.out.println(str);
            }
        }
    }
}
