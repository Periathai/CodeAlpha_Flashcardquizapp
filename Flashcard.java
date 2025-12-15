package com.example.flashcardquizapp;

public class Flashcard {
    String question, answer;

    public Flashcard(String q, String a){
        question = q;
        answer = a;
    }

    public String getQuestion(){ return question; }
    public String getAnswer(){ return answer; }
}
