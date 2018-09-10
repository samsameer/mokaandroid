package como.erp.sd.mokaandroid.shoppingCart.model;


public class SubTotalItem implements Item {

    public final String text = "Subtotal";
    public String amount;

    public SubTotalItem(String amount){
        this.amount = amount;
    }

}
