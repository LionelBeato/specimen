package works.lionel.specimen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempServiceImpl implements TempService {

    @Override
    public Number add(Number x, Number y) {
        return null;
    }

    @Override
    public String sayHi() {
        return "hello world";
    }
}