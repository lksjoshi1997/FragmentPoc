package com.example.laxmikant.fragmentpoc;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Context context;
    Button firstFragmentBtn;
    Button secondFragmentBtn;
    Fragment fragment = new FirstFragment();
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVariable();
        initListeners();
        startWorking(fragment);
    }

    private void initVariable() {
        View main = findViewById(R.id.main_activity);
        firstFragmentBtn = main.findViewById(R.id.fragmentOne);
        secondFragmentBtn = main.findViewById(R.id.fragmentTwo);
    }

    private void initListeners() {
        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new FirstFragment();
                startWorking(fragment);
            }
        });
        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new SecondFragment();
                startWorking(fragment);
            }
        });
    }

    private void startWorking(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }
}
