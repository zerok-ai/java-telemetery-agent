package src.main.topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

    @Query(value = "SELECT t FROM topic t where t.name=?1")
    public List<Topic> findAllSortedByName(String name);

}
