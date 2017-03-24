package ch14.ex11;

import ch14.ex11.access.Access;
import ch14.ex11.include.Include;
import ch14.ex11.integra.Integra;
import ch14.ex11.local.Local;
import ch14.ex11.recount.Recount;
import ch14.ex11.remote.Remote;
import ch14.ex11.thrown.Thrown;
import ch14.ex11.unit.Unit;
import ch14.ex11.value.Value;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Ex11 {
    public static void main(String[] args) throws Exception{
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Recount.app();
        Thrown.app();
        Unit.app();
        Value.app();
        Access.app();

    }
}
