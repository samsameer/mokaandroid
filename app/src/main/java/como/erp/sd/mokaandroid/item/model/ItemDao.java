package como.erp.sd.mokaandroid.item.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;


@Dao
public interface ItemDao {

    @Insert(onConflict = REPLACE)
    void save(Item[] item);

    @Query("SELECT * FROM Item")
    Item[] loadAll();
}
