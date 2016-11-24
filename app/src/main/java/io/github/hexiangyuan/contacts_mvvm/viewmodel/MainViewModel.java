package io.github.hexiangyuan.contacts_mvvm.viewmodel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableInt;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;

import io.github.hexiangyuan.contacts_mvvm.data.BaseBean;
import io.github.hexiangyuan.contacts_mvvm.net.HttpHelper;
import io.github.hexiangyuan.contacts_mvvm.net.service.ContactsService;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-23
 */

public class MainViewModel implements ContactContract.ViewModel {
    public ObservableInt progressVisibility = new ObservableInt(View.GONE);
    public ObservableBoolean isRefreshing = new ObservableBoolean();
    private Subscription subscription;
    private ContactContract.View view;

    public MainViewModel(ContactContract.View view) {
        this.view = view;
    }

    @Override
    public void fetchContacts() {
        progressVisibility.set(View.VISIBLE);
        ContactsService contactsService = HttpHelper.getHttpInstance().create(ContactsService.class);
        subscription = contactsService.fetchContracts("https://api.randomuser.me/?results=10&nat=en")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<BaseBean>() {
                    @Override
                    public void onCompleted() {
                        isRefreshing.set(false);
                        progressVisibility.set(View.GONE);
                    }

                    @Override
                    public void onError(Throwable e) {
                        isRefreshing.set(false);
                    }

                    @Override
                    public void onNext(BaseBean baseBean) {

                    }
                });
    }

    @Override
    public void destroy() {
        if (subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }

    public SwipeRefreshLayout.OnRefreshListener onRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            fetchContacts();
        }
    };
}
