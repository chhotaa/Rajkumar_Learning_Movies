package dev.rajkumar.movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ReviewRepository extends MongoRepository<Review, Object> {
}
