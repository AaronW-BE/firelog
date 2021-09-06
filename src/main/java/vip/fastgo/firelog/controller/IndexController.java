package vip.fastgo.firelog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.fastgo.firelog.mapper.UserMapper;

@RestController
@RequestMapping("/")
public class IndexController {

    private final UserMapper userMapper;

    public IndexController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/")
    public Object index() {
        return userMapper.selectList();
    }
}
