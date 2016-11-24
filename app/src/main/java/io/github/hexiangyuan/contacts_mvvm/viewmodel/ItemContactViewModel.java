package io.github.hexiangyuan.contacts_mvvm.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import io.github.hexiangyuan.contacts_mvvm.data.Contact;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-24
 */

public class ItemContactViewModel {
    private Contact contact;
    private Context context;

    public ItemContactViewModel(Contact contact, Context context) {
        this.contact = contact;
        this.context = context;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getFullName() {
        return contact.name.title + "." + contact.name.first + " " + contact.name.last;
    }

    public String getCell() {
        return contact.cell;
    }

    public String getMail() {
        return contact.email;
    }

    public String getPictureProfile() {
        return contact.picture.thumbnail;
    }

    public void onItemClick(View view) {
        Toast.makeText(context, contact.name.first, Toast.LENGTH_SHORT).show();
    }
}
