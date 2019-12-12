package com.example.heba.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SubjectDetailFragment extends Fragment {
   public int subjectid;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_subject_detail,container,false);
    }

    public void setId(int id)
   {
       subjectid = id;
   }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view!=null){
            TextView txt = view.findViewById(R.id.text);

            if(subjectid==0) {
                txt.setText("Interesting");
            }
            else{
                txt.setText("Easy");
            }
        }
    }


}
