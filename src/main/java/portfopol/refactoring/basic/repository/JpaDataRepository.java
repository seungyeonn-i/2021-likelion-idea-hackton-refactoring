package portfopol.refactoring.basic.repository;

import portfopol.refactoring.basic.domain.MyData;

import java.util.List;
import java.util.Optional;

public class JpaDataRepository implements DataRepository{
    @Override
    public MyData save(MyData myData) {
        return null;
    }

    @Override
    public Optional<MyData> findById(Long userId) {
        return Optional.empty();
    }

    @Override
    public List<MyData> findAll() {
        return null;
    }
}
