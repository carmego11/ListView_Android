package com.carmego_company.listview;


import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Fragment fragmentoLista1, fragmentoLista2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentoLista1= new FragmentList1Activity();
        fragmentoLista2= new FragmentList2Activity();

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor,fragmentoLista1,"Lista 1").commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_next) {

            if(getSupportFragmentManager().findFragmentByTag("Lista 1").isVisible()){
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragmentoLista2,"Lista 2").addToBackStack(null).commit();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
