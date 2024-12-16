package com.leonelfonseca.java.springcontextabstractions.proxies;

import com.leonelfonseca.java.springcontextabstractions.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
