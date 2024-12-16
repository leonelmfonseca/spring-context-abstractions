package com.leonelfonseca.java.springcontextabstractions.repositories;

import com.leonelfonseca.java.springcontextabstractions.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);

}
