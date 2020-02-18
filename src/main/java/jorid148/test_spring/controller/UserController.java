package jorid148.test_spring.controller;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
    @RequestMapping(Constants.GET_ALL_USERS)
    public List < UserDto > getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
