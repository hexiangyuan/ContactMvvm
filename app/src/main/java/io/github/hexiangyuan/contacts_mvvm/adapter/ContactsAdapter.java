package io.github.hexiangyuan.contacts_mvvm.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import io.github.hexiangyuan.contacts_mvvm.Contact;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-23
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>{

    private ArrayList<Contact> contacts;

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{

        public ContactViewHolder(View itemView) {
            super(itemView);
        }
    }
}
