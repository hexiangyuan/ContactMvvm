package io.github.hexiangyuan.contacts_mvvm.net.service;

import io.github.hexiangyuan.contacts_mvvm.data.BaseBean;
import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-24
 */

public interface ContactsService {
    @GET
    Observable<BaseBean> fetchContracts(@Url String Url);
}
