package cn.tedu.jsd2307enjoymall.controller;

import cn.tedu.jsd2307enjoymall.common.response.JsonResult;
import cn.tedu.jsd2307enjoymall.pojo.param.UserLoginParam;
import cn.tedu.jsd2307enjoymall.pojo.param.UserRegParam;
import cn.tedu.jsd2307enjoymall.pojo.vo.UserVO;
import cn.tedu.jsd2307enjoymall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@RestController
@RequestMapping("/v1/users")
public class UserController implements Serializable {
    @Autowired
    IUserService userService;

    @PostMapping("reg")
    public JsonResult reg(UserRegParam userRegParam){

        //检验前端数据是否能传递过来
        System.out.println("userRegParam = " + userRegParam);

        userService.reg(userRegParam);

        return JsonResult.ok();
    }

    @PostMapping("login")
    public JsonResult login(UserLoginParam userLoginParam){

        UserVO userVO = userService.login(userLoginParam);

        return JsonResult.ok(userVO);
    }
}
