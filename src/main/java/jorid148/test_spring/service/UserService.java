package jorid148.test_spring.service;

public class UserService {
    public interface UserService {
        UserDto getUserById(Integer userId);
        void saveUser(UserDto userDto);
        List < UserDto > getAllUsers();
    }
    @Service
    public class UserServiceimpl implements UserService {
        @Autowired
        UserRepository userRepository;
        @Override
        public UserDto getUserById(Integer userId) {
            return UserConverter.entityToDto(userRepository.getOne(userId));
        }
        @Override
        public void saveUser(UserDto userDto) {
            userRepository.save(UserConverter.dtoToEntity(userDto));
        }
        @Override
        public List < UserDto > getAllUsers() {
            return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
        }
    }
}
