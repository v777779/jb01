package hw.vpex.except;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskEx {
    private static class BazEx extends Exception {
    }
    private static class FooEx extends BazEx {
    }
    private static class BiffEx extends FooEx {
    }
    private static class BarEx extends FooEx {
    }
    private static class BoinkEx extends BiffEx {
    }
    private static class GenX {
        public void doRisky(int i) throws BazEx {
            switch (i) {
                case 0:
                    throw new BoinkEx();
                case 1:
                    throw new BiffEx();
                case 2:
                    throw new BarEx();
                case 3:
                    throw new FooEx();
                case 4:
                    throw new BazEx();
            }

        }
    }

    public static void main(String[] args) {
        GenX x = new GenX();
        for (int i = 0; i < 5; i++) {
            try {
                x.doRisky(i);
            } catch (BoinkEx b) {
                System.out.println(b.getClass().getSimpleName());
            } catch (BarEx b) {
                System.out.println(b.getClass().getSimpleName());
            } catch (BiffEx b) {
                System.out.println(b.getClass().getSimpleName());
            } catch (FooEx b) {
                System.out.println(b.getClass().getSimpleName());
            } catch (BazEx b) {
                System.out.println(b.getClass().getSimpleName());
            }

        }
    }
}
