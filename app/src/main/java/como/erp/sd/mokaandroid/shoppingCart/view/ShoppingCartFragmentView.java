package como.erp.sd.mokaandroid.shoppingCart.view;

import java.util.List;

import pos.com.pos.shoppingCart.model.Item;



public interface ShoppingCartFragmentView {
    void refreshList(List<Item> items);
    void updateChargeButton(String s);
}
