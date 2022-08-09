package com.huseyin.service;

import com.huseyin.model.QuestionForm;
import com.huseyin.model.Result;

import java.util.List;

public interface ResultService {


    //  Sonuçları Getirme
    double getResult(QuestionForm qForm);

    void saveScore(Result result);

    List<Result> getTopScore();

    String getResultSatisfaction(QuestionForm qForm);

    String getMessage(QuestionForm questionForm);





}
