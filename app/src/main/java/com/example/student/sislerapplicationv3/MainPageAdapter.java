package com.example.student.sislerapplicationv3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import com.bumptech.glide.Glide;

/**
 * Created by student on 17/10/2016.
 */
public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.MyViewHolder> {

    private Context mContext;
    private List<MainPageCards> cardList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }


    public MainPageAdapter(Context mContext, List<MainPageCards> cardList) {
        this.mContext = mContext;
        this.cardList = cardList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_page_card_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        MainPageCards images = cardList.get(position);
        holder.title.setText(images.getName());

        // loading images cover using Glide library
        Glide.with(mContext).load(images.getThumbnail()).into(holder.thumbnail);
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    public int getItemCount() {
        return cardList.size();
    }
}
