package com.carmego_company.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by grafica1-2 on 24/10/15.
 */
public class FragmentList2Activity extends Fragment {

    ListView lista;
    public FragmentList2Activity(){}


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.fragment_list2,container,false);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lista=(ListView) getView().findViewById(R.id.list_view2);
        lista.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.layout_element_list,R.id.titulo,listaElementos()));
    }

    public String[] listaElementos(){
        String[] elementos;
        elementos=new String[] {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5","Elemento 6","Elemento 7","Elemento 8","Elemento 9","Elemento 10"};

        return elementos;
    }

}
