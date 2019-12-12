package com.example.heba.fragmentexample;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class SubjectListFragment extends ListFragment {
   SubjectListListener listener;
public static ArrayList<String> sub;
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      sub=new ArrayList<String>();
      sub.add("Android");
      sub.add("Animation");
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,sub);
      setListAdapter(adapter);
      return super.onCreateView(inflater, container, savedInstanceState);

   }


   @Override
   public void onAttach(Context context) {
      super.onAttach(context);
      listener=(SubjectListListener) context;
   }

   @Override
   public void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);

      if(listener!=null){
         listener.onItemClick(position);
      }
   }
}
