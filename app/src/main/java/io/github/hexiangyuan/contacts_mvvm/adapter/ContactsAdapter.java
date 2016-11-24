package io.github.hexiangyuan.contacts_mvvm.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import io.github.hexiangyuan.contacts_mvvm.R;
import io.github.hexiangyuan.contacts_mvvm.data.Contact;
import io.github.hexiangyuan.contacts_mvvm.databinding.ItemContactsBinding;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.ItemContactViewModel;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-23
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>{

    private List<Contact> contacts;

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemContactsBinding contactsBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_contacts, parent, false);
        return new ContactViewHolder(contactsBinding);
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.bindContact(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts == null ? 0 : contacts.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {
        private ItemContactsBinding itemContactsBinding;

        ContactViewHolder(ItemContactsBinding itemContactsBinding) {
            super(itemContactsBinding.itemContact);
            this.itemContactsBinding = itemContactsBinding;
        }

        void bindContact(Contact contact) {
            if (itemContactsBinding.getItemViewModel() == null) {
                ItemContactViewModel viewModel = new ItemContactViewModel(contact, itemView.getContext());
                itemContactsBinding.setItemViewModel(viewModel);
            } else {
                itemContactsBinding.getItemViewModel().setContact(contact);
            }

        }
    }
}
