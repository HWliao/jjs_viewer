package com.jjshome.viewer.controller;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试用controller
 *
 * @author lhw
 */
@Controller
public class TestController {

  @Value("${viewer.name}")
  private String name;

  @RequestMapping("/test")
  @ResponseBody
  public Object getTestData() {
    Map<String, String> result = new HashMap<String, String>(12);
    result.put("test", this.name);
    result.forEach((entry, test) -> {
      System.out.println(entry);
      System.out.println(test);
    });

    List<String> tests = Lists.newArrayList("test1", "test2", "test3");
    int sum = tests.stream()
      .mapToInt(str -> 1)
      .sum();
    System.out.println(sum);
    return result;
  }

  @RequestMapping("/testTmp")
  public ModelAndView getTestTemplate(Map<String, String> map, ModelAndView mav) {
    map.put("name", "[Angel -- 守护天使]");
    mav.setViewName("test");
    mav.addAllObjects(map);
    return mav;
  }

  @RequestMapping("/testError")
  public String getTestError() {
    throw new RuntimeException("test error");
  }

}
