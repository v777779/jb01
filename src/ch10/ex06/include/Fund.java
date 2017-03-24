package ch10.ex06.include;

import ch10.ex06.access.IAccount;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Fund {
    protected class Account implements IAccount {
        private int account;

        public Account() {
        }

        @Override
        public void clearAccount() {
            account = 0;
        }

        @Override
        public void setAccount(int account) {
            this.account = account;
        }

        @Override
        public void incAccount() {
        account++;
        }

        @Override
        public void decAccount() {
            account--;
        }

        @Override
        public int getAccount() {
            return 0;
        }
    }


    public Fund() {
    }
}
