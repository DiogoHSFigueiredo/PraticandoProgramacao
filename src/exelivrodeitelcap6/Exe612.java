package exelivrodeitelcap6;

import java.security.SecureRandom;

/**
 *
 * @author Diogo
 */
public class Exe612 {

    public static void main(String[] args) {

        SecureRandom numero = new SecureRandom();

        // 1<= n <=2
        int n = 1 + numero.nextInt(2);

        //1<= n <=100
        int o = 1 + numero.nextInt(100);

        //1000 <= n <=1112
        int p = 1000 + numero.nextInt(112);

        //-1 <= n <= 1
        int q = -1 + numero.nextInt(3);
        
        //-3 <= n <= 11
        int r = -3 + numero.nextInt(18);
        
        

        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }

}
