package com.example.alberto.guiaextra;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.alberto.guiaextra.Modelos.Student;
import com.example.alberto.guiaextra.acti.Adapter.StudentAdapter;

import java.util.List;

public class MainMenu extends AppCompatActivity {

    private List<Student> mItemList;
    private RecyclerView rvData;
    private StudentAdapter mStudentAdapter;
    private Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
}
