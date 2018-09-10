package como.erp.sd.mokaandroid.data;

import retrofit2.Retrofit;

/**
 * 
 */

public interface HttpClientInterface {

    Retrofit getRetrofit();
    POSApi getPOSApi();
}
