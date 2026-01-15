package com.rodrigo.workshopmongo.services;

import com.rodrigo.workshopmongo.domain.Post;
import com.rodrigo.workshopmongo.repository.PostRepository;
import com.rodrigo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
