/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloController
 * Author:   Cenmom
 * Date:     2019/8/14 16:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Cenmom
 * @create 2019/8/14
 * @since 1.0.0
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";

    }
}