package io.github.hexiangyuan.contacts_mvvm.viewmodel;

import java.util.List;

import io.github.hexiangyuan.contacts_mvvm.data.Contact;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-23
 */

public interface ContactContract {

    interface View {
        void contractLoaded(List<Contact> contacts);
    }

    interface ViewModel {
        void fetchContacts();

        void destroy();
    }
}
