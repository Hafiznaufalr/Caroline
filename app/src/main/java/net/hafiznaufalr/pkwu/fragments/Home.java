package net.hafiznaufalr.pkwu.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.hafiznaufalr.pkwu.R;
import net.hafiznaufalr.pkwu.store.store1.Store1;
import net.hafiznaufalr.pkwu.store.store2.Store2;
import net.hafiznaufalr.pkwu.store.store3.Store3;
import net.hafiznaufalr.pkwu.store.store4.Store4;
import net.hafiznaufalr.pkwu.store.store5.Store5;
import net.hafiznaufalr.pkwu.store.store6.Store6;
import net.hafiznaufalr.pkwu.store.store7.Store7;
import net.hafiznaufalr.pkwu.store.store8.Store8;


public class Home extends Fragment implements View.OnClickListener {


    CardView f1,f2,f3,f4,f5,f6,f7,f8;
    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_home, container, false);

        f1 = (CardView) view.findViewById(R.id.utas);
        f1.setOnClickListener((View.OnClickListener) this);
        f2 = (CardView) view.findViewById(R.id.dua);
        f2.setOnClickListener((View.OnClickListener) this);
        f3 = (CardView) view.findViewById(R.id.tiga);
        f3.setOnClickListener((View.OnClickListener) this);
        f4 = (CardView) view.findViewById(R.id.empat);
        f4.setOnClickListener((View.OnClickListener) this);
        f5 = (CardView) view.findViewById(R.id.lima);
        f5.setOnClickListener((View.OnClickListener) this);
        f6 = (CardView) view.findViewById(R.id.enam);
        f6.setOnClickListener((View.OnClickListener) this);
        f7 = (CardView) view.findViewById(R.id.tujuh);
        f7.setOnClickListener((View.OnClickListener) this);
        f8 = (CardView) view.findViewById(R.id.delapan);
        f8.setOnClickListener((View.OnClickListener) this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.utas:
                Intent yIntent = new Intent(getActivity(), Store1.class);
                startActivity(yIntent);
                break;
            case R.id.dua:
                Intent dIntent = new Intent(getActivity(), Store2.class);
                startActivity(dIntent);
                break;
            case R.id.tiga:
                Intent tIntent = new Intent(getActivity(), Store3.class);
                startActivity(tIntent);
                break;
            case R.id.empat:
                Intent eIntent = new Intent(getActivity(), Store4.class);
                startActivity(eIntent);
                break;
            case R.id.lima:
                Intent lIntent = new Intent(getActivity(), Store5.class);
                startActivity(lIntent);
                break;
            case R.id.enam:
                Intent enIntent = new Intent(getActivity(), Store6.class);
                startActivity(enIntent);
                break;
            case R.id.tujuh:
                Intent fIntent = new Intent(getActivity(), Store7.class);
                startActivity(fIntent);
                break;
            case R.id.delapan:
                Intent deIntent = new Intent(getActivity(), Store8.class);
                startActivity(deIntent);
                break;
        }
    }
}


