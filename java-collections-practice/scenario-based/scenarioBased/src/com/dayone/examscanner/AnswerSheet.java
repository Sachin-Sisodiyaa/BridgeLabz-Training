package com.dayone.examscanner;

import java.util.List;

public interface AnswerSheet {
    List<String> getCorrectAnswers();
    String getSubjectName();
}