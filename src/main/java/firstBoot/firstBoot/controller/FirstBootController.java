package firstBoot.firstBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maguobao
 * @date 2018/08/01
 * @time 10:27
 */
@RestController
@RequestMapping("/firstBoot")
public class FirstBootController {

@RequestMapping(value = "/sayHello",method = RequestMethod.GET)
public String sayHello() {
		return "hello,this is guobao's first boot program!!! hahahaha";
	}
}

