package como.erp.sd.mokaandroid.shoppingCart.model;


public class DiscountItem implements Item {

    public final String text = "Discount";
    public String amount;

    public DiscountItem(String amount){
        this.amount = amount;
    }
}
