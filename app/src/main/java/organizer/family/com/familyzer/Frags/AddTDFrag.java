package organizer.family.com.familyzer.Frags;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import organizer.family.com.familyzer.R;


public class AddTDFrag extends Fragment {
    EditText titleMissionTV;
    EditText missionTV;

    public AddTDFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment and locate the views


        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_add_td, container, false);
        titleMissionTV = (EditText) view.findViewById(R.id.TitleMissionTV);
        missionTV = (EditText) view.findViewById(R.id.MissionTV);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.add_frag_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.SaveItem:
                //TODO save to database
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
