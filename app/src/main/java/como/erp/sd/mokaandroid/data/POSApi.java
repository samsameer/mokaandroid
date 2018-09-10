package como.erp.sd.mokaandroid.data;

import io.reactivex.Observable;
import pos.com.pos.item.model.Item;
import retrofit2.http.GET;

/**
 * 
 */

public interface POSApi {

    @GET("photos")
    Observable<Item[]> getItems();

}
