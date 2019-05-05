package com.example.laxmikant.fragmentpoc;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Context context;
    Button firstFragmentBtn;
    Button secondFragmentBtn;
    Fragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVariable();
        initListeners();
        startWorking();
    }

    private void initVariable() {
        View main = findViewById(R.id.main_activity);
        firstFragmentBtn = main.findViewById(R.id.fragmentOne);
        secondFragmentBtn = main.findViewById(R.id.fragmentTwo);
    }

    private void initListeners() {
    }

    private void startWorking() {
    }
}
