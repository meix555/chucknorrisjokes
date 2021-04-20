package meix.springframework.joke.dbaccess;

import meix.springframework.joke.model.ChuckNorrisJoke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<ChuckNorrisJoke, Integer> {

}
