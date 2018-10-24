package net.hafiznaufalr.pkwu.fragments;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.hafiznaufalr.pkwu.R;
import net.hafiznaufalr.pkwu.forum.Forum;

public class Inbox extends Fragment implements View.OnClickListener {

    RelativeLayout r1, r2, r3, r4;

    public Inbox() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_inbox, container, false);

        r1 = (RelativeLayout) view.findViewById(R.id.inb1);
        r1.setOnClickListener((View.OnClickListener) this);
        r2 = (RelativeLayout) view.findViewById(R.id.inb2);
        r2.setOnClickListener((View.OnClickListener) this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.inb1:
                Intent yIntent = new Intent(getActivity(), Forum.class);
                startActivity(yIntent);
                break;


            case R.id.inb2:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "app3nity@gmail.com", null));

                getActivity().startActivity(Intent.createChooser(emailIntent, null));
                break;
        }
    }
}


