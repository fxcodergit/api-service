package cn.fxcoder.user;

import cn.fxcoder.JedisLock;
import cn.fxcoder.RedisClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import redis.clients.jedis.Jedis;
import static cn.fxcoder.constants.RedisConstants.*;

/**
 * @program: parent
 * @description: 用户前端控制器
 * @author: yunlongliu
 * @create: 2018-06-08 16:36
 **/
@Controller
@RequestMapping("/userController")
public class UserController {

    /**
     *  @Description    ：跳转登录页面
     *  @Method_Name    ：toLogin
     *  @return java.lang.String
     *  @Creation Date  ：2018年06月08日 17:05
     *  @Author         ：yunlongliu@hongkun.com.cn
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        System.out.println("test spring-mvc...");
        Jedis jedis = RedisClient.getClient().getJedis();
        JedisLock jedisLock = new JedisLock();
        boolean result = jedisLock.lock("Liu", LOCK_EXPIRES,LOCK_WAITTIME);
        System.out.println(result);
        System.out.println(jedis.set("1", "=============="));

        return "login";
    }








}
