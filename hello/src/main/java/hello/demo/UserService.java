package hello.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;

    @Transactional
    public void insertTwo(){
        User UserA = new User();
        UserA.setName("First");
        UserA.setPassword("firstcode");
        UserRepository.save(UserA);

        User UserB = new User();
        UserB.setName("Second");
        UserB.setPassword("secondpass");
        UserRepository.save(UserB);

    }
}
