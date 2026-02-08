package javacourse;


import java.util.Arrays;
import java.util.Locale;

public class Javacourse {

//    public static int[] createArray(int size)
//    {
//    int c []=new int[size];
//    return c;
//    }

    public static void main(String[] args) {
//
//        int values[]=createArray(7);
//        int x []=createArray(22);
//
//        System.out.println(values.length);
//        System.out.println(x.length);
//
//
//    int z[] = {1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i <z.length ; i++) {
//            System.out.println(z[i]);
//        }
//        int num2[]={1,2,3,4,5,6,7,8};
//        System.out.println(num2.length);
//        String nam="yahia66";
//        int num1[]={1,2,3,4,5};
//        System.out.println(nam.length());
//        System.out.println(num1.length);
//        String name []={"yahia","issa","ramadan"};
//        for (int i = 0; i <name.length ; i++) {
//            System.out.print(" ");
//            System.out.print(name[i]);
//        }
//        int values[] = {3, 567, 56};
//        for (int v : values) {
//            System.out.println(v);
//        }
//        System.out.println(values[0]);
        int values[] = new int[10];
        Car y[] = new Car[10];

        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(x[2][0]);

        int z[][] = new int[2][4];

        z[0][0] = 1;
        z[0][1] = 2;
        z[0][2] = 3;
        z[0][3] = 4;

        z[1][0] = 1;
        z[1][1] = 2;
        z[1][2] = 3;
        z[1][3] = 4;

        for(int i=0;i< z.length;i++){
            int[] r=z[i];

            System.out.println(Arrays.toString(r));
        }



    }

}
