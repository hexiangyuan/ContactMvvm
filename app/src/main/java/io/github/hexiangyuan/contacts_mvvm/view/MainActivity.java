package io.github.hexiangyuan.contacts_mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import io.github.hexiangyuan.contacts_mvvm.R;
import io.github.hexiangyuan.contacts_mvvm.adapter.ContactsAdapter;
import io.github.hexiangyuan.contacts_mvvm.data.Contact;
import io.github.hexiangyuan.contacts_mvvm.databinding.ActivityMainBinding;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.ContactContract;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.MainViewModel;

;

public class MainActivity extends AppCompatActivity implements ContactContract.View {
    private ActivityMainBinding mainActivityBinding;
    private ContactsAdapter adapter;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        initRecyclerView();
    }

    private void initDataBinding() {
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new MainViewModel(this);
        mainActivityBinding.setMainViewModel(viewModel);
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
