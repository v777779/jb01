package ch12.ex10;

import ch12.ex10.access.Access;
import ch12.ex10.chain.Chain;
import ch12.ex10.integra.Integra;
import ch12.ex10.include.Include;
import ch12.ex10.local.Local;
import ch12.ex10.retry.Retry;

/**
 * Created by V1 on 01-Mar-17.
 */
public class Ex10 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Retry.app();
        Chain.app();
        Access.app();

    }
}
