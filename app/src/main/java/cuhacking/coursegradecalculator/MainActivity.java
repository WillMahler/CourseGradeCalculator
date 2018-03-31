package cuhacking.coursegradecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> courseList = new ArrayList<String>();

        courseList.add("COURSE 1");
        courseList.add("COURSE 1");
        courseList.add("COURSE 1");
        courseList.add("COURSE 1");
        courseList.add("COURSE 1");
        courseList.add("COURSE 1");


        ListView courseListView = findViewById(R.id.courseListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                courseList);

        ListView lv= (ListView) findViewById(R.id.courseListView);
        courseListView.setAdapter(adapter);


    }
}
