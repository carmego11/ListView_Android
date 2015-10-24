package com.carmego_company.listview;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentList1Activity extends Fragment {

    ListView lista;
    public FragmentList1Activity(){}


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.fragment_list1,container,false);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lista=(ListView) getView().findViewById(R.id.list_view1);
        lista.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,listaElementos()));
    }

    public String[] listaElementos(){
        String[] elementos;
        elementos=new String[] {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5","Elemento 6","Elemento 7","Elemento 8","Elemento 9","Elemento 10"};

        return elementos;
    }
}
