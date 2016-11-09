package com.example.student.sislerapplicationv3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class CalendarActivity extends AppCompatActivity{


    private List<CalendarPageCards> cardList;
    private CalendarAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_calendar);

        cardList = new ArrayList<>();
        adapter = new CalendarAdapter(cardList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareCards();




    }
    public void btnGoToHome(View vw){
        Intent goToHome = new Intent ();
        setResult(0,goToHome);
        finish();
        overridePendingTransition(R.anim.slide_to_left, R.anim.slide_back_right);
    }

    private void prepareCards() {
        CalendarPageCards a = new CalendarPageCards("October 31, 2016 \n" + "Happy Halloween!");
        cardList.add(a);

        a = new CalendarPageCards("November 1, 2016 \n" + "First day of November! \n" + "Early Dismissal at @ 2:30 PM");
        cardList.add(a);

        a = new CalendarPageCards("November 2, 2016 \n" + "There will be a University of Manitoba Orientation in the Taras Korol Theatre");
        cardList.add(a);

        a = new CalendarPageCards("November 3, 2016 \n" + "Grade Wars!");
        cardList.add(a);

        a = new CalendarPageCards("November 4, 2016 \n" + "Friday! \n" + "Red River College Orientation in the Taras Korol Theatre");
        cardList.add(a);

        a = new CalendarPageCards("November 9, 2016 \n" + "Report Card marks due");
        cardList.add(a);

        a = new CalendarPageCards("November 10, 2016 \n" + "Remembrance Day Ceremonies");
        cardList.add(a);

        a = new CalendarPageCards("November 11, 2016 \n" + "Remembrance Day, No Classes");
        cardList.add(a);

        a =  new CalendarPageCards("November 15, 2016 \n" + "Report Cards Issued");
        cardList.add(a);

        a = new CalendarPageCards("November 17, 2016 \n" + "Grade 9 to 12 Parent Teacher Meetings");
        cardList.add(a);

        a = new CalendarPageCards("November 18, 2016 \n" + "Non Instructional Day, No Classes");
        cardList.add(a);
    }


}
