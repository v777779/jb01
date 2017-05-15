package hw.vpex.arrays;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MainUSD {
    public static void main(String[] args) {
        String price = "15,26 USD";
        String id = "UDL0249 000234827190";
        price = price.split(" ")[0]+" ";
        id = "UDL0249 000234827190".split(" ")[0]+" ";
        System.out.println("price:"+price+"#");
        System.out.println("id:"+id+"#");
    }
}
