package ch20.ex01.codea;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class Testable {
    public void execute() {
        System.out.println("Testable.execute");
    }
    @Test void testExecute(){
        execute();
    }

}
