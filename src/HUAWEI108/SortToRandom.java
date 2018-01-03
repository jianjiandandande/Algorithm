package HUAWEI108;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Vincent on 2018/1/3 8:57
 *
 * 题目要求：明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去
 * 找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 *
 * 1.去重-->通过HashSet实现
 * 2.排序-->通过快排实现
 *
 **/
public class SortToRandom {

    private static int []nums;
    private static int []values;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numLen = scanner.nextInt();

        nums = new int[numLen];

        for (int i = 0; i <numLen ; i++) {

            nums[i] = scanner.nextInt();
        }

        //去重

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <numLen ; i++) {
            set.add(nums[i]);
        }

        int valueLen = set.size();

        Iterator<Integer> iterator = set.iterator();
        int count = 0;
        values = new int[valueLen];
        while (iterator.hasNext()){
            values[count++] = iterator.next();
        }



        //排序

        quicksort(0,valueLen-1);

        for (int i = 0; i <valueLen ; i++) {
            System.out.println(values[i]);
        }

    }

    public static void quicksort(int left,int right){
        int i,j,t,temp;
        if(left>right)
            return;
        temp=values[left]; //temp中存的就是基准数
        i=left;
        j=right;
        while(i!=j)
        {
            //顺序很重要，要先从右边开始找
            while(values[j]>=temp && i<j)
                j--;
            //再找右边的
            while(values[i]<=temp && i<j)
                i++;
            //交换两个数在数组中的位置
            if(i<j)
            {
                t=values[i];
                values[i]=values[j];
                values[j]=t;
            }
        }
        //最终将基准数归位
        values[left]=values[i];
        values[i]=temp;

        quicksort(left,i-1);//继续处理左边的，这里是一个递归的过程
        quicksort(i+1,right);//继续处理右边的 ，这里是一个递归的过程
    }
}
