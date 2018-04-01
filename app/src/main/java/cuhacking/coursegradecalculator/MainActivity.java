package cuhacking.coursegradecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addCourseButtonFromMain;

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

        addCourseButtonFromMain = findViewById(R.id.addCourseButton_FromMain);

        addCourseButtonFromMain.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddCourse.class);
            startActivity(intent);
        });

        ListView courseListView = findViewById(R.id.courseListView);

//        courseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                System.out.println(position);
//                Intent intent = new Intent(MainActivity.this, AddCourse.class);
//                startActivity(intent);
//            }
//        });
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                courseList);

        ListView lv= (ListView) findViewById(R.id.courseListView);
        courseListView.setAdapter(adapter);


    }
}
