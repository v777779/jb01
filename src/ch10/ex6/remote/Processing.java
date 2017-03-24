package ch10.ex6.remote;

import ch10.ex6.access.IAccount;
import ch10.ex6.include.Fund;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Processing extends Fund {
    public IAccount getIAccount() {
//      return  (new Fund()).new Account(); // работает если НЕТ наследования
        return  new Fund.Account(); // прокатило потому что есть наследование, а значит предок четко увязан

    }
}
