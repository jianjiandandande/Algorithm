package HUAWEI108;

import java.util.Scanner;

/**
 * Created by Vincent on 2018/1/8 12:11
 *
 * 进制转换
 *
 **/
public class HexadecimalConversion {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String str = scanner.nextLine();

            if (str.substring(0, 2).equals("0x")) {
                String s = change(str);
                System.out.println(s);
            }
        }

    }

    /**
     * 十六进制转十进制
     * @param oxStr
     * @return
     */
    public static String change(String oxStr){
        String keyStr = oxStr.substring(2,oxStr.length());

        int sum = 0;
        for (int i = keyStr.length()-1; i>=0;i-- ){
            double weiValue = (Math.pow(16,keyStr.length()-1-i));
            if ('A'<=keyStr.charAt(i)&&keyStr.charAt(i)<='E') {
                sum += ((keyStr.charAt(i) - 'A') + 10) * weiValue;
            }else {
                sum += (Integer.valueOf(String.valueOf(keyStr.charAt(i))))*weiValue;
            }

        }

        return String.valueOf(sum);
    }

}
