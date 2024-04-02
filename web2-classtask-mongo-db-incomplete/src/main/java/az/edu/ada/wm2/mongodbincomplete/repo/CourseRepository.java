package az.edu.ada.wm2.mongodbincomplete.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import az.edu.ada.wm2.mongodbincomplete.entity.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
}
