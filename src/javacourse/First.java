package javacourse;


import java.util.Arrays;
import java.util.Locale;

public class First {

    public static void main(String[] args) {
        Calc c=new Calc();

        int result=c.Sum(23,5);
        System.out.println(result);
        result=c.Min(10,5);
        System.out.println(result);
        result=c.Mul(2,3);
        System.out.println(result);
        result=c.Div(10,5);
        System.out.println(result);
        c.Dec(55);

        int [] one1={3,4,5};
        int [] two2={2,3,9};
        int [] T=c.mulArray(one1,two2);
        int [] y =c.mulArray(one1,two2);
        for (int i = 0; i <y.length; i++) {
            System.out.println(y[i]);
        }

    }

}
