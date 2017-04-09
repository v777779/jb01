package ch12.ex25.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMatching Exceptions Check\n");
//точный перехват
        try {
            throw new Sneeze();
        } catch (Sneeze e) {     // точная отработка сработает тут
            System.out.println("catch:"+e.getClass().getSimpleName());
        }
//        catch (Annoy e){      // сюда не дойдет
//            System.out.println("catch1:"+e.getClass().getSimpleName());
//        }
// примерный перехват
        try {
            throw new Sneeze();
        } catch (Annoy e){      // Sneeze отработает здесь по matching как потомка
            System.out.println("catch2:"+e.getClass().getSimpleName());
        }
    }
}
