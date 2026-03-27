


//class Solutio {
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int t[][]=new int [ triangle.size()+1][ triangle.size()+1];
//        for(int i=0;i<= triangle.size();i++){
//            for(int j=0;j<= triangle.size();j++){
//                t[i][j]=-1;
//            }
//        }
//        return func(0,0,0,triangle,t);
//    }
//    public int func(int j,int i,int sum,List<List<Integer>>l1,int t[][]){
//        if(j==l1.size()-1){
//            return sum+l1.get(j).get(i);
//        }
//        if(t[j][i]!=-1){
//            return t[j][i];
//        }
//        int l=func(j+1,i,sum+l1.get(j).get(i),l1,t);
//        int r=func(j+1,i+1,sum+l1.get(j).get(i),l1,t);
//        return t[j][i]=Math.min(l,r);
//    }
//    public static void main(String[] args) {
//        Solutio solution = new Solutio();
//        List<List<Integer>>l1=Arrays.asList(
//                Arrays.asList(2),
//                Arrays.asList(3, 4),
//                Arrays.asList(6, 5, 7),
//                Arrays.asList(4, 1, 8, 3)
//        );
//        System.out.println(solution.minimumTotal(l1));
//
//    }
//}

import java.util.*;
class Triangle{
    public int minimumTotal(List<List<Integer>>triangle){
        int n=triangle.size();
        int t[][]=new int[n][n];
        for (int i=0;i<n;i++){
            // base mamu
            t[triangle.size()-1][i]=triangle.get(triangle.size()-1).get(i);
        }
        // abhi upward grid bharte chalenge as base case hi last row
        // se hai


        for (int j=triangle.size()-2;j>=0;j--){
            for (int i=0;i<=j;i++){
                int l=t[j+1][i];
                int r=t[j+1][i+1];
                t[j][i]=triangle.get(j).get(i)+ Math.min(l,r);
            }
        }
        return t[0][0];
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        List<List<Integer>>l1=Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        System.out.println(triangle.minimumTotal(l1));
    }
}