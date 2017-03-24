package ch12.ex21.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nNested Try Blocks Check\n");

// Тип 1 без ошибок конструирования
// одиночные объекты
        System.out.println("One Object no Errors");
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            System.out.println("try_finally:1");
            System.out.println(nc1);
        } catch (Exception e) {

        } finally {
            System.out.println("finally:1");
            nc1.dispose();
        }

        System.out.println("\nTwo Objects no Errors");
        // много объектов
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();

        try {
            System.out.println("try_finally:1");
            System.out.println(nc2);
            System.out.println(nc3);

        } catch (Exception e) {

        } finally {
            System.out.println("finally:1");
            nc3.dispose();
            nc2.dispose();
        }

// Тип 2 ошибки конструирования
// одиночные объекты
        System.out.println("\nOne Object w Errors");
        try {
            System.out.println("try_catch:1");
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                System.out.println("try_finally:1");
                System.out.println(nc4);
            } catch (Exception e) {
                System.out.println("catch:1");

            } finally {
                System.out.println("finally:1");
                nc4.dispose();
            }
        } catch (Exception e) {

        }
        System.out.println("\nThree Objects w Errors");
        // много объектов

        try {
            System.out.println("try_catch:nc5");
            NeedsCleanup2 nc5 = new NeedsCleanup2();
            try {
                System.out.print("try_finally:"+nc5);
                System.out.println("> try_catch:nc6");
                NeedsCleanup2 nc6 = new NeedsCleanup2();
                try {
                    System.out.print("try_finally:"+nc6);
                    System.out.println("> try_catch: nc7");
                    NeedsCleanup2 nc7 = new NeedsCleanup2();
                    try {
                        System.out.println("try_finally:"+nc7);
                    } finally {
                        nc7.dispose();
                    }
                } catch (Exception e) {

                }finally {
                    nc6.dispose();
                }
            } catch (Exception e) {

            }finally {
                nc5.dispose();
            }
        } catch (Exception e) {
        }



    }
}
