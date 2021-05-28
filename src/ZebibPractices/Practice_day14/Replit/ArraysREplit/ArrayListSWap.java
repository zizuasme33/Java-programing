package ZebibPractices.Practice_day14.Replit.ArraysREplit;

import java.util.*;

public class ArrayListSWap {
    public static void main(String[] args) {


        int [] nums = {1,2,3};
        int [] nums2 = {4,5,6};

        System.out.println(Arrays.toString(mergR(nums, nums2)));

    }

//    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {
//
//       //String swap =  list.add(list.size()-1, pos2);
//        String swapW = "";
//
//       // for (int i = 0; i < list.size(); i++){
//
//        //    swapW = list.add(i, 3);

//
//
//      //  }
//
//    //    }


    public static int[] mergR(int[] a,int[] b) {
        int[] mergeArr = new int[a.length + b.length];
        for (int i = 0; i < mergeArr.length; i++) {
            if (i < a.length) {
                mergeArr[i] = a[i];
            } else {
                mergeArr[i] = b[i - a.length];
            }
        }
        return mergeArr;

    }
}
