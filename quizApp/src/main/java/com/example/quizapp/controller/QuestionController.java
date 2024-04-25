package com.example.quizapp.controller;


import com.example.quizapp.entity.Question;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
            return questionService.getAllQeustions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    @GetMapping("findbyId/{id}")
    public ResponseEntity<Optional<Question>> getQuestionById(@PathVariable int id){
        return questionService.getQuestionById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestions(@RequestBody Question question){
     return questionService.addQuestions(question);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return questionService.deleteById(id);
    }

}
