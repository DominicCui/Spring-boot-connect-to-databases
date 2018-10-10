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
        UserA.setEmail("first@gamil.com");
        UserRepository.save(UserA);

        User UserB = new User();
        UserB.setName("Second");
        UserB.setEmail("second@hotmail.com");
        UserRepository.save(UserB);

    }
}
