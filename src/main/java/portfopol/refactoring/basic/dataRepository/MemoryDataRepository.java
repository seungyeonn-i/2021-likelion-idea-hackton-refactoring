package portfopol.refactoring.basic.dataRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import portfopol.refactoring.basic.domain.MyData;

import java.util.*;

@Slf4j
@Repository
public class MemoryDataRepository implements DataRepository {


    private static final Map<Long, MyData> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public MyData save(MyData myData) {
        //dataid, userid 지정!@@
        myData.setDataId(++sequence);
        store.put(myData.getDataId(), myData);
        log.info("save!!!!!");
        return myData;
    }

    @Override
    public Optional<MyData> findById(Long userId) {
        return Optional.ofNullable(store.get(userId));
    }

    @Override
    public List<MyData> findAll() {
        return new ArrayList<>(store.values());
    }
}
