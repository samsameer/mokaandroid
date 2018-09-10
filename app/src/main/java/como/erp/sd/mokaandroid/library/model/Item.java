package como.erp.sd.mokaandroid.library.model;

import java.util.ArrayList;



public abstract class Item {
    public String name;
    public String id;

    public static final DiscountItem discountItem = new DiscountItem("discount", "All Discounts");
    public static final SKUItem skuItem = new SKUItem("item", "All Items");

    public static ArrayList<Item> libraryItemArrayList;

    static{
        libraryItemArrayList = new ArrayList<>();
        libraryItemArrayList.add(discountItem);
        libraryItemArrayList.add(skuItem);
    }

}
