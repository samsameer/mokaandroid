package como.erp.sd.mokaandroid.inputBox.view;

import pos.com.pos.discount.model.DiscountItem;
import pos.com.pos.shoppingCart.model.ShoppingCartItem;



public interface InputBoxFragmentView {
    void refreshQuantity(int quantity);
    void initView(ShoppingCartItem item);
    void finish();
    void setDiscount(DiscountItem discountItem);
}
