package com.example.flashcardquizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvQuestion, tvAnswer;
    Button btnShow, btnNext, btnPrev, btnAdd, btnEdit, btnDelete;

    ArrayList<Flashcard> flashcards = new ArrayList<>();
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQuestion = findViewById(R.id.tvQuestion);
        tvAnswer = findViewById(R.id.tvAnswer);
        btnShow = findViewById(R.id.btnShow);
        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
        btnAdd = findViewById(R.id.btnAdd);
        btnEdit = findViewById(R.id.btnEdit);
        btnDelete = findViewById(R.id.btnDelete);

        flashcards.add(new Flashcard("What is Android?", "Mobile OS"));
        flashcards.add(new Flashcard("What is Java?", "Programming language"));

        loadCard();

        btnShow.setOnClickListener(v -> tvAnswer.setVisibility(View.VISIBLE));
        btnNext.setOnClickListener(v -> { if(index < flashcards.size()-1){ index++; loadCard(); }});
        btnPrev.setOnClickListener(v -> { if(index > 0){ index--; loadCard(); }});
    }

    void loadCard(){
        tvQuestion.setText(flashcards.get(index).getQuestion());
        tvAnswer.setText(flashcards.get(index).getAnswer());
        tvAnswer.setVisibility(View.GONE);
    }
}
