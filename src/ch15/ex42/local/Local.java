package ch15.ex42.local;

import ch15.ex42.local.func.FnClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nStrategy Pattern Univeral Adapters Check\n");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> rList;
        Integer res = FnClass.reduce(list, new FnClass.IntegerAdder());
        System.out.println("IntegerAdd :"+res);

        res = FnClass.reduce(list, new FnClass.IntegerSubtracter());
        System.out.println("IntegerSub :"+res);

        rList = FnClass.filter(list, new FnClass.GreaterThan<>(4));
        System.out.println("GreaterThan:"+rList);

        res = FnClass.forEach(list, new FnClass.MulIntCollector()).result();
        System.out.println("MulIntColl :"+res);

        res = FnClass.forEach( rList, new FnClass.MulIntCollector()).result();
        System.out.println("Mul&Filter :"+res);

        MathContext mc = new MathContext(7); // точность 7
        List<BigDecimal> bList = Arrays.asList(
                new BigDecimal(1.1,mc), new BigDecimal(2.2,mc),
                new BigDecimal(3.3,mc), new BigDecimal(4.4,mc)
        );
        List<BigDecimal> bRList;

        BigDecimal bRes = FnClass.reduce(bList,new FnClass.BigDecimalAdder());
        System.out.println("BigAdd     :"+bRes);

        bRList = FnClass.filter(bList,new FnClass.GreaterThan<>(new BigDecimal(3)));
        System.out.println("BigGreater :"+bRList);

        List<BigInteger> iList = new ArrayList<>();
        List<BigInteger> iRList;

        BigInteger iRes = BigInteger.valueOf(11);
        for (int i = 0; i < 11; i++) {
            iList.add(iRes);
            iRes = iRes.nextProbablePrime(); // простое число
        }
        System.out.println("RndBigInt  :"+iList);

        iRes = FnClass.reduce(iList,new FnClass.BigIntegerAdder());
        System.out.println("BigIntAdd  :"+iRes);

        System.out.println("BigIntPrime:"+iRes.isProbablePrime(5));

        List<AtomicLong> aList = Arrays.asList(
                new AtomicLong(11), new AtomicLong(15),
                new AtomicLong(51), new AtomicLong(125)
        );
        List<AtomicLong> aRList;

        AtomicLong aRes = FnClass.reduce(aList,new FnClass.AtomicLongAdder());
        System.out.println("AtomLongAdd:"+aRes);

        bRList = FnClass.transform(bList, new FnClass.BigDecimalUlp());
        System.out.println("BigUlp     :"+bRList);

    }
}
