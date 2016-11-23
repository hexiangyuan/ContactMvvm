package io.github.hexiangyuan.contacts_mvvm.view;

import android.databinding.DataBindingUtil;;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import io.github.hexiangyuan.contacts_mvvm.Contact;
import io.github.hexiangyuan.contacts_mvvm.R;
import io.github.hexiangyuan.contacts_mvvm.databinding.ActivityMainBinding;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.ContactContract;

public class MainActivity extends AppCompatActivity implements ContactContract.View {
    private ActivityMainBinding mainAcitivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainAcitivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    public void contractLoaded(ArrayList<Contact> contacts) {

    }
}
