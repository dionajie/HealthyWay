package com.example.ivan.healthyway.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.example.ivan.healthyway.R;

/**
 * Created by IVAN on 3/14/2015.
 */
public class MenuTabFragment extends Fragment {

    private FragmentTabHost mTabHost;
    private String mTabId;

    public MenuTabFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.MenuTabHost);

        mTabHost.addTab(mTabHost.newTabSpec("SemuaTab").setIndicator("Semua"), SemuaFragment_.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("TerdekatTab").setIndicator("Terdekat"),TerdekatFragment_.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("TerbaikTab").setIndicator("Terbaik"),TerbaikFragment_.class, null);


        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                mTabId = tabId;
            }
        });
        return mTabHost;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mTabHost = null;
    }

}
