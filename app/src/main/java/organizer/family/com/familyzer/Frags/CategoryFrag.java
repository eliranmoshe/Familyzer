package organizer.family.com.familyzer.Frags;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import organizer.family.com.familyzer.R;


public class CategoryFrag extends Fragment {


    public CategoryFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment and locate the views
        View view=inflater.inflate(R.layout.fragment_category, container, false);
        return view;
    }

}
