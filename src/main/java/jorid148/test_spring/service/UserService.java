package jorid148.test_spring.service;

import jorid148.test_spring.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List< UserDto > getAllUsers();
}