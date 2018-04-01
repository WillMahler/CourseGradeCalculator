package cuhacking.coursegradecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CourseInformation extends AppCompatActivity {

    private Button addCourseFromCourseInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_information);

        addCourseFromCourseInfo = findViewById(R.id.addCourseButton_FromCourseInfo);

        addCourseFromCourseInfo.setOnClickListener(v -> {
            Intent intent = new Intent(CourseInformation.this, AddEvaluation.class);
            startActivity(intent);
        });

    }
}
