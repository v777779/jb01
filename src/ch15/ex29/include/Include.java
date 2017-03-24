package ch15.ex29.include;

import lib.utils.Holder;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nGeneric vs Unbounds Check\n");

        Wildcards wd= new Wildcards();
        Holder hRaw = new Holder<Long>();                   // non qualified
        Holder<Long> hQfd = new Holder<Long>();             // qualified
        Holder<?> hUnb = new Holder<Long>();                // unbounded
        Holder<? extends Long> hBnd = new Holder<Long>();   // bounded
        Long val = 1L;

        System.out.println("rawArg:");
        wd.rawArg(hRaw, val);
        wd.rawArg(hQfd, val);
        wd.rawArg(hUnb, val);
        wd.rawArg(hBnd, val);

        System.out.println("unbArg:");
        wd.unbArg(hRaw, val);
        wd.unbArg(hQfd, val);
        wd.unbArg(hUnb, val);
        wd.unbArg(hBnd, val);

        System.out.println("exact1<T>:");
        Object r1 = wd.exact1(hRaw);  // работает только так
        Long r2 = wd.exact1(hQfd);
        Object r3 = wd.exact1(hUnb);
        Long r4 = wd.exact1(hBnd);

        System.out.println("exact2 <T>:");
        Long r5 = wd.exact2(hRaw, val);  // работает
        Long r6 = wd.exact2(hQfd, val);
//        Long r7 = wd.exact2(hUnb, val); // не работает  <?>  arg <?>
//        Long r8 = wd.exact2(hBnd, val);   // не работает  <?extends T>  arg <? extends T>

        System.out.println("subArg <T>:");
        Long ra = wd.subArg(hRaw,val);  // работает
        Long rb = wd.subArg(hQfd,val); // работает
//        Long rc = wd.subArg(hUnb,val); // не работает
        Long rd = wd.subArg(hBnd,val); // работает

        System.out.println("superArg <T>:");
        Long re = wd.superArg(hRaw,val);  // работает
        Long rf = wd.superArg(hQfd,val); // работает
//        Long rg = wd.superArg(hUnb,val); // не работает
//        Long rh = wd.superArg(hBnd,val); // не работает


    }
}
