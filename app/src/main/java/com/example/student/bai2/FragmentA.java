package com.example.student.bai2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {

    TextView txtnoidung;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a , container ,false);

        txtnoidung = (TextView) view.findViewById(R.id.tv_noidung);
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            txtnoidung.setText(bundle.getString("hotenSinhVien"));
        }

        return view;
    }
}
