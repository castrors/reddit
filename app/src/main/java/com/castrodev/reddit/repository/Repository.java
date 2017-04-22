package com.castrodev.reddit.repository;

import com.castrodev.reddit.repository.Implementation.CommentRepositoryImpl;
import com.castrodev.reddit.repository.Implementation.PostRepositoryImpl;
import com.castrodev.reddit.repository.Interface.CommentRepository;
import com.castrodev.reddit.repository.Interface.PostRespository;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public class Repository {

    private static PostRespository postRespository;
    private static CommentRepository commentRepository;

    public static PostRespository providesPostRepository() {
        if (postRespository == null)
            postRespository = new PostRepositoryImpl();
        return postRespository;
    }

    public static CommentRepository providesCommentRepository() {
        if (commentRepository == null)
            commentRepository = new CommentRepositoryImpl();
        return commentRepository;
    }
}
