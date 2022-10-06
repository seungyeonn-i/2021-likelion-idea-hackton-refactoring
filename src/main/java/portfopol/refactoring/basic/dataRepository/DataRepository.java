package portfopol.refactoring.basic.dataRepository;

import portfopol.refactoring.basic.domain.MyData;

import java.util.List;
import java.util.Optional;

public interface DataRepository {
    MyData save(MyData myData);

    Optional<MyData> findById(Long userId);

    //    Optional<MyData> findBy
    List<MyData> findAll();
}
