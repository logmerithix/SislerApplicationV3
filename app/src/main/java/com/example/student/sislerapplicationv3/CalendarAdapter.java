package com.example.student.sislerapplicationv3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by student on 19/10/2016.
 */
public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.MyViewHolder> {
    private List<CalendarPageCards> cardList;

    public CalendarAdapter(List<CalendarPageCards> cardList) {
        this.cardList = cardList;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView description;
        public ImageView calendarOverflow;

        public MyViewHolder(View itemView) {
            super(itemView);
            description = (TextView) itemView.findViewById(R.id.description);
            calendarOverflow = (ImageView) itemView.findViewById(R.id.calendarOverflow);
        }
    }


    @Override
    public CalendarAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calendar_card_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CalendarAdapter.MyViewHolder holder, int position) {
        CalendarPageCards calendarInfo = cardList.get(position);
        holder.description.setText(calendarInfo.getText());


    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

}
