package cuhacking.coursegradecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AddEvaluation extends AppCompatActivity {

    private Button addEvaluationFromAddEvaluation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_evaluation);

        addEvaluationFromAddEvaluation = findViewById(R.id.addEvaluationButton_FromAddEvaluation);

        addEvaluationFromAddEvaluation.setOnClickListener(v -> {
            Intent intent = new Intent(AddEvaluation.this, CourseInformation.class);
            startActivity(intent);
        });

    }
}
