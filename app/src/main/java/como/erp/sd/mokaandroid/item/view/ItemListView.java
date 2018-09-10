package como.erp.sd.mokaandroid.item.view;

import pos.com.pos.item.model.Item;


public interface ItemListView {

    void showItems(Item[] items);
    void showError(Throwable throwable);
}
