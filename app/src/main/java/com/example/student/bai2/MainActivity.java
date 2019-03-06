package com.example.student.bai2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  Button btnadd;
  EditText edt_frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button)findViewById(R.id.btn_add);
        edt_frag = (EditText)findViewById(R.id.edt_fragment);
        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentA fragmentA = new FragmentA();

                Bundle bundle = new Bundle();
                bundle.putString("hotenSinhVien",edt_frag.getText().toString());

                fragmentA.setArguments(bundle);



                fragmentTransaction .add(R.id.myLinearLayout,fragmentA);
                fragmentTransaction.commit();
            }
        });
    }
}
