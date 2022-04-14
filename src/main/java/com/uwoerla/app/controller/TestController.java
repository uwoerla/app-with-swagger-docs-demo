package com.uwoerla.app.controller;

import com.uwoerla.app.param.TestParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author : uwoerla
 * @date : 2022/4/14
 */
@RestController
@RequestMapping("/api/uwoerla/")
@Slf4j
public class TestController {

  @PostMapping("/post")
  @ResponseBody
  public TestParam post(TestParam param) {
    log.info("param: {}",param);
    return param;
  }

  @GetMapping("/get")
  @ResponseBody
  public TestParam get(TestParam param) {
    log.info("param: {}",param);
    return param;
  }
}