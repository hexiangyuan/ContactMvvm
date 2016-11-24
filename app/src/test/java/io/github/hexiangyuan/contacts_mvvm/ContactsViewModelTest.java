package io.github.hexiangyuan.contacts_mvvm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import io.github.hexiangyuan.contacts_mvvm.viewmodel.ContactContract;
import io.github.hexiangyuan.contacts_mvvm.viewmodel.MainViewModel;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-24
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = Config.NONE)
public class ContactsViewModelTest {
    @Mock
    private ContactContract.View view;
    private MainViewModel mainViewModel;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mainViewModel = new MainViewModel(view);
    }

    @Test
    public void fetchContactFromHttpTest(){

        Assert.assertEquals(1,1);
    }
}
