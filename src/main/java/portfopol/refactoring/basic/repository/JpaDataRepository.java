package portfopol.refactoring.basic.repository;

import portfopol.refactoring.basic.domain.MyData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JpaDataRepository implements DataRepository{

    private static final Map<Long, MyData> store = new HashMap<>();
    private static long sequence = 0L;
    @Override
    public MyData save(MyData myData) {
        myData.setDataId(++sequence);
        store.put(myData.getDataId(), myData);
        return myData;

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
