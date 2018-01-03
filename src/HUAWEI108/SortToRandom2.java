package HUAWEI108;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Vincent on 2018/1/3 9:27
 * <p>
 * 题目要求：明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去
 * 找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 * <p>
 * 1.去重；2.排序 都使用TreeSet来实现
 **/
public class SortToRandom2 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int num = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<Integer>();
            for (int i = 0; i < num; i++) {
                int curr = sc.nextInt();
                set.add(curr);
            }
            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }


}
