package com.example.ivan.healthyway.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        //TabHost.addTab(mTabHost.newTabSpec("SemuaTab").setIndicator("Semua Fragment"),SemuaFragment.class, null);
        //TabHost.addTab(mTabHost.newTabSpec("TerdekatTab").setIndicator("Terdekat Fragment"),TerdekatFragment.class, null);
        //TabHost.addTab(mTabHost.newTabSpec("TerbaikTab").setIndicator("Terbaik Fragment"),TerbaikFragment.class, null);



        return mTabHost;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mTabHost = null;
    }

}
