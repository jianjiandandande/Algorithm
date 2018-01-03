package HUAWEI108;

import java.util.Scanner;

/**
 * Created by Vincent on 2018/1/3 8:32
 *
 * 题目要求：计算字符串最后一个单词的长度，单词以空格隔开。
 *
 * 例如：输入：hello world；输出：5
 **/
public class LastWordLength {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lastWordIndex = input.lastIndexOf(" ")+1;

        String lastWord = input.substring(lastWordIndex,input.length());

        System.out.println(lastWord.length());

    }

}
