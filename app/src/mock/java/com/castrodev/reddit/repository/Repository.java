package com.castrodev.reddit.repository;

import com.castrodev.reddit.repository.Implementation.FakeCommentRepositoryImpl;
import com.castrodev.reddit.repository.Implementation.FakePostRepositoryImpl;
import com.castrodev.reddit.repository.Interface.CommentRepository;
import com.castrodev.reddit.repository.Interface.PostRespository;

public class Repository {

    private static PostRespository postRespository;
    private static CommentRepository commentRepository;

    public static PostRespository providesPostRepository() {
        if (postRespository == null)
            postRespository = new FakePostRepositoryImpl();
        return postRespository;
    }

    public static CommentRepository providesCommentRepository() {
        if (commentRepository == null)
            commentRepository = new FakeCommentRepositoryImpl();
        return commentRepository;
    }
}