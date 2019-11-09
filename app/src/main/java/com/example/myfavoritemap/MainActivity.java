package com.example.myfavoritemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Question question = new Question(R.string.question_text, true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView questionString = findViewById(R.id.text_view);
        questionString.setText(question.getQuestionResId());

        Button trueButton = findViewById(R.id.button_true);
        Button falseButton = findViewById(R.id.button_false);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClicked(true);
            }
        });
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClicked(false);
                            }
        });
    }

    private void onButtonClicked(boolean answer){
        int toastMessage = (question.isCorrectAnser() == answer) ?
                R.string.correct_toast :
                R.string.incorrect_toast;

        Toast.makeText(
                MainActivity.this,
                        toastMessage,
                        Toast.LENGTH_LONG)
                .show();

    }
}
