package com.qiubo.qiubo.ui.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qiubo.qiubo.R;
import com.qiubo.qiubo.ui.adapters.viewpagers.QiuboPagerAdapter;
import com.qiubo.qiubo.ui.adapters.viewpagers.SimpleButtonDelegate;
import com.qiubo.qiubo.ui.adapters.viewpagers.SimpleImageDelegate;
import com.qiubo.qiubo.ui.adapters.viewpagers.SimpleTextViewDelegate;
import com.qiubo.qiubo.ui.viewmodels.ItemVM;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vw_pager_main)
    ViewPager mViewPager;
    private QiuboPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupModule();
    }

    private void setupModule() {
        ButterKnife.bind(this);
        mAdapter = new QiuboPagerAdapter();
        mViewPager.setAdapter(mAdapter);
        loadItems();
    }

    private void loadItems() {
        List<ItemVM> itemVMS = new ArrayList<>();

        ItemVM vm1 = new ItemVM();
        vm1.setViewType(SimpleImageDelegate.DELEGATE_TYPE);
        vm1.setResourceId(R.drawable.image_1);

        ItemVM vm2 = new ItemVM();
        vm2.setViewType(SimpleButtonDelegate.DELEGATE_TYPE);
        vm2.setResourceId(R.string.lbl_learn_and_share);

        ItemVM vm3 = new ItemVM();
        vm3.setViewType(SimpleTextViewDelegate.DELEGATE_TYPE);
        vm3.setResourceId(R.string.lbl_hello_developers);

        ItemVM vm4 = new ItemVM();
        vm4.setViewType(SimpleImageDelegate.DELEGATE_TYPE);
        vm4.setResourceId(R.drawable.image_2);

        ItemVM vm5 = new ItemVM();
        vm5.setViewType(SimpleButtonDelegate.DELEGATE_TYPE);
        vm5.setResourceId(R.string.lbl_learn_and_share);

        ItemVM vm6 = new ItemVM();
        vm6.setViewType(SimpleTextViewDelegate.DELEGATE_TYPE);
        vm6.setResourceId(R.string.lbl_this_is_qiubo);

        itemVMS.add(vm1);
        itemVMS.add(vm2);
        itemVMS.add(vm3);
        itemVMS.add(vm4);
        itemVMS.add(vm5);
        itemVMS.add(vm6);

        mAdapter.setItems(itemVMS);
    }
}
