package com.example.alberto.guiaextra.acti.Violder;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.example.alberto.guiaextra.Modelos.Student;
import com.example.alberto.guiaextra.R;
import com.example.alberto.guiaextra.acti.Interface.ItemClickListener;


/**
 * Created by marioperezt on 10/11/17.
 */

public class GradesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private Student mItem;
    private Context mContext;
    private TextView tvName;
    private TextView tvSubject;
    private TextView tvGrade;
    private ItemClickListener<Student> mClickListener;

    public GradesViewHolder(View itemView, ItemClickListener<Student> clickListener) {
        super(itemView);
        mContext = itemView.getContext();
        itemView.setOnClickListener(this);
        mClickListener = clickListener;
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        tvSubject = (TextView) itemView.findViewById(R.id.tv_subject);
        tvGrade = (TextView) itemView.findViewById(R.id.tv_grades);

    }

    public void setItem(Student item){
        mItem = item;
        tvName.setText(item.getmName());
        tvSubject.setText(item.getmSubject());
        tvGrade.setText(Integer.toString(item.getmGrade()));
        if(item.getmGrade()<60){
            tvGrade.setTextColor(Color.parseColor("#B22222"));
        }
        else{
            tvGrade.setTextColor(Color.parseColor("#008000"));
        }


    }

    @Override
    public void onClick(View v) {
        if(mClickListener != null){
            mClickListener.OnClick(mItem);
        }
    }
}
