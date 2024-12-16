package com.leonelfonseca.java.springcontextabstractions.proxies;

import com.leonelfonseca.java.springcontextabstractions.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                + comment.getText());
    }
}
