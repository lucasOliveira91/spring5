package springfive.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;
import springfive.cms.domain.models.User;

/**
 * Created by loliveira on 01/11/18.
 */
@Service
public interface UserRepository extends ReactiveMongoRepository<User,String> {}
