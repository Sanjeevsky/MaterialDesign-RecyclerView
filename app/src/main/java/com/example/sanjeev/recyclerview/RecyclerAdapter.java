package com.example.sanjeev.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<User> users;
    private Context context;

    public RecyclerAdapter(Context context,List<User> users) {
        this.context=context;
        this.users = users;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        User sampleuser=users.get(i);
        viewHolder.name.setText(sampleuser.userName);
        viewHolder.desc.setText(sampleuser.userdesc);
        //viewHolder.imageView.setImageResource(sampleuser.userimage);
/*Fast Image Loading*/
        Glide.with(context).load(sampleuser.userimage).into(viewHolder.imageView);



        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"item"+i+" clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }





    @Override
    public int getItemCount() {
        return users.size();
    }
}
