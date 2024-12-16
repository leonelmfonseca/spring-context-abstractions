package com.leonelfonseca.java.springcontextabstractions.withspring.main;

import com.leonelfonseca.java.springcontextabstractions.withspring.model.Comment;
import com.leonelfonseca.java.springcontextabstractions.withspring.services.CommentService;
import com.leonelfonseca.java.springcontextabstractions.withspring.config.AbstractionsConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(AbstractionsConfiguration.class);

    var comment = new Comment();
    comment.setAuthor("Bugs Bunny");
    comment.setText("That's all folks!");

    var commentService = context.getBean(CommentService.class);
    commentService.publishComment(comment);
  }
}
