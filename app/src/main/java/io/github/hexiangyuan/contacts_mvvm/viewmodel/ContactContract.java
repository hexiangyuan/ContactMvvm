package io.github.hexiangyuan.contacts_mvvm.viewmodel;

import java.util.ArrayList;

import io.github.hexiangyuan.contacts_mvvm.Contact;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-23
 */

public interface ContactContract {

    interface View {
        void contractLoaded(ArrayList<Contact> contacts);
    }

    interface ViewModel {
        void fetchContacts();

        void destroy();
    }
}
