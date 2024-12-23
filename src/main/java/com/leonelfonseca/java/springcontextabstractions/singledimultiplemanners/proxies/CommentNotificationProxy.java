package com.leonelfonseca.java.springcontextabstractions.singledimultiplemanners.proxies;

import com.leonelfonseca.java.springcontextabstractions.singledimultiplemanners.model.Comment;

/** Interfaces are abstract. We never use stereotype annotations on interfaces. */
public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
