package javacourse;


import java.util.Locale;

public class Javacourse {


    public static void main(String[] args) {
//Data type
        char z='c';
        System.out.println(z);
        String x="Data type course";
        System.out.println("x");
//        char c=x.charAt(0);
//        System.out.println(c);
        int l =x.length();
        System.out.println(l);
        for (int i = 0; i <x.length() ; i++) {
            char c=x.charAt(i);
            System.out.println(c);
        }
        String value=new String("YaHiA");
        System.out.println(value);

        String name="Yahia";
        String nname=name.toUpperCase();
        System.out.println(nname);
        String mname=name.toLowerCase();
        System.out.println(mname);

        String site="www.google.com";
        String xaite="www.googlE.com";

      if(site.equalsIgnoreCase(xaite))
          System.out.println("ok");
      else
          System.out.println("no");
    }
}

