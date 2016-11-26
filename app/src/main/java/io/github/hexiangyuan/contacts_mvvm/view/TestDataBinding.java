package io.github.hexiangyuan.contacts_mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.github.hexiangyuan.contacts_mvvm.R;
import io.github.hexiangyuan.contacts_mvvm.databinding.ActivityTestDataBindingBinding;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.TestDataBindingViewModel;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-26
 */

public class TestDataBinding extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataBinding();
    }

    private void initDataBinding() {
        ActivityTestDataBindingBinding binding = DataBindingUtil.
                setContentView(this, R.layout.activity_test_data_binding);
        TestDataBindingViewModel viewModel = new TestDataBindingViewModel(this);
        binding.setViewModel(viewModel);
    }


}
