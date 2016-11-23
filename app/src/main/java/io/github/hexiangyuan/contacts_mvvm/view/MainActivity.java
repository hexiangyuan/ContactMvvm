package io.github.hexiangyuan.contacts_mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import io.github.hexiangyuan.contacts_mvvm.Contact;
import io.github.hexiangyuan.contacts_mvvm.R;
import io.github.hexiangyuan.contacts_mvvm.adapter.ContactsAdapter;
import io.github.hexiangyuan.contacts_mvvm.databinding.ActivityMainBinding;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.ContactContract;

;

public class MainActivity extends AppCompatActivity implements ContactContract.View {
    private ActivityMainBinding mainActivityBinding;
    private ContactsAdapter adapter;

    public void setViewModel(ContactContract.View view) {
        view = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        mainActivityBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ContactsAdapter();
        mainActivityBinding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void contractLoaded(ArrayList<Contact> contacts) {
        adapter.setContacts(contacts);
        adapter.notifyDataSetChanged();
    }
}
