package javacourse;


public class Main {
    public static void printVal(int x)
    {
        if(x<=0)
            return;
        for (int i = x; i >=0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
    printVal(7);


//        for(int a=1 ;a <= 10;a++ ) {
//            for(int b=0 ;b<=15;b++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        // line separator
//        for (int c=1 ; c<=100 ; c++){
//            System.out.print("_");
//        }
//        System.out.println();
//
//        // 2) Right triangle
//        for(int d=1 ;d<=20;d++ ) {
//
//            for(int e=1; e <= d ;e++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // line separator
//        for (int m=1;m<=100;m++){
//            System.out.print("_");
//        }
//        System.out.println();
//        // 3) Centered triangle (pyramid)
//        int height=5;
//        for (int o = 1;o <= height; o++){
//
//            for (int k = 1; k <= height - o ; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * o -1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
 }
}

