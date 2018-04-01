package cuhacking.coursegradecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AddCourse extends AppCompatActivity {

    private Button addCourseButtonFromAddCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        addCourseButtonFromAddCourse = findViewById(R.id.addCourseButton_FromAddCourse);

        addCourseButtonFromAddCourse.setOnClickListener(v -> {
            Intent intent = new Intent(AddCourse.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
