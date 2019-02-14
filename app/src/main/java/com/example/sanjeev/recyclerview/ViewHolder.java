package com.example.sanjeev.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sanjeev.recyclerview.R;

public class ViewHolder  extends RecyclerView.ViewHolder{

    public ImageView imageView;
    public TextView name;
    public TextView desc;
public LinearLayout linearLayout;

    public ViewHolder(View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.image_id);
        name=(TextView)itemView.findViewById(R.id.name_id);
        desc=(TextView)itemView.findViewById(R.id.discription_id);
        linearLayout=(LinearLayout)itemView.findViewById(R.id.recycleritem_id);
    }
}
