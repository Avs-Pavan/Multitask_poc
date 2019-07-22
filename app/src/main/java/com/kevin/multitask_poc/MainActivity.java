package com.kevin.multitask_poc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mask = findViewById(R.id.mask);
      //  mask.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onPause() {
        super.onPause();
        mask.setVisibility(View.VISIBLE);
    }

    public void addingView() {
        LinearLayout myLayout = findViewById(R.id.prime);
        View view = getLayoutInflater().inflate(R.layout.demo, null);
        view.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        myLayout.addView(view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mask.setVisibility(View.GONE);
    }


    /*@Override
    protected void onPause() {
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
     //    getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        super.onPause();
    }

    @Override
    protected void onResume() {
       // Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
        super.onResume();

    }*/
}
