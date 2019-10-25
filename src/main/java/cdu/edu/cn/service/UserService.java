package cdu.edu.cn.service;


import cdu.edu.cn.entity.User;
import cdu.edu.cn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;
    public boolean checkUser(User user){

        if(userRepository.checkUser(user)!=null){
            return  true;
        }
        return  false;
    }

}
