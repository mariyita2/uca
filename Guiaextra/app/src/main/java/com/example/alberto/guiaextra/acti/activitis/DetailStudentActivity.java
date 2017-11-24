package com.example.alberto.guiaextra.acti.activitis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alberto.guiaextra.R;

public class DetailStudentActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvName;
    TextView tvGrade;
    Button btnCall;
    private String mName;
    private String mGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_student);

        tvName = (TextView) findViewById(R.id.tv_name);
        tvGrade = (TextView) findViewById(R.id.tv_grades);
        btnCall = (Button) findViewById(R.id.btn_call);

        btnCall.setOnClickListener(this);

        Bundle example = getIntent().getExtras();
        if(example != null){
            mName = example.getString("StudentName");
            mGrade = example.getString("StudentGrade");
        }
        tvName.setText(mName);
        tvGrade.setText(mGrade);
    }

    @Override
    public void onClick(View v) {
        /*
        Intent intent =new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:"  + "22802608"));
        //startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:"  + response.getCellPhone())));
        startActivity(intent);
        */

        Uri uri = Uri.parse("http://www.google.com.ni");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }
}
