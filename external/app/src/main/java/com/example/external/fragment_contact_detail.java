package com.example.multifragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.example.external.R;

public class ContactDetailFragment extends Fragment {

    private TextView contactDetailTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact_detail, container, false);
        contactDetailTextView = view.findViewById(R.id.contact_detail);
        String contactName = getArguments().getString("contact_name");
        contactDetailTextView.setText(contactName);
        return view;
    }
}
