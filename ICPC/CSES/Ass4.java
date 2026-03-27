import java.util.*;
public class Ass4 {
    public static void main(String[] args) {
        double[][] points = {
                {0.1, 0.6},   // P1
                {0.15, 0.71}, // P2
                {0.08, 0.9},  // P3
                {0.16, 0.85}, // P4
                {0.2, 0.3},   // P5
                {0.25, 0.5},  // P6
                {0.24, 0.1},  // P7
                {0.3, 0.2}    // P8
        };

        double[] m1 = points[0]; // P1
        double[] m2 = points[7]; // P8


        ArrayList<double[]> c1 = new ArrayList<>();
        ArrayList<double[]> c2 = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            double d1 = distance(points[i], m1);
            double d2 = distance(points[i], m2);
            if (d1 < d2) {
                c1.add(points[i]);
            } else {
                c2.add(points[i]);
            }
            if (i == 5) {
                // yaha se we will be able to find ki P6 kis cluster me jayega since it is P6 so index will be 5 as 0 index based
                System.out.println("P6 belongs to cluster " + (d1 < d2 ? "C1" : "C2"));
                //q1
            }
        }

        System.out.println(c2.size());  //q2

       //q3
        double[] newM1 = Mean(c1);
        double[] newM2 = Mean(c2);

        System.out.println("Updated m1 = [" + newM1[0] + ", " + newM1[1] + "]");
        System.out.println("Updated m2 = [" + newM2[0] + ", " + newM2[1] + "]");
    }

    //  distance
    public static double distance(double[] a, double[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
        //  \/(x2-x1)^2+(y2-y1)^2
    }

    // cluster
    public static double[] Mean(List<double[]> cluster) {
        double sumX = 0;
        double sumY = 0;
        for (double[] p : cluster) {
            sumX += p[0];
            sumY += p[1];
        }
        return new double[]{sumX / cluster.size(), sumY / cluster.size()};
    }
}
