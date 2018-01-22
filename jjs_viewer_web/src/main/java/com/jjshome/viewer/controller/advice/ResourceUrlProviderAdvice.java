package com.jjshome.viewer.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * 在说与controller中织入 静态资源路径处理器
 *
 * @author lhw
 */
@ControllerAdvice
public class ResourceUrlProviderAdvice {


  @Autowired
  private ResourceUrlProvider resourceUrlProvider;

  /**
   * ${urls.getForLookupPath('/js/common.js')} 在模板中调用 对资源内容hash
   */
  @ModelAttribute("urls")
  public ResourceUrlProvider urls() {
    return this.resourceUrlProvider;
  }
}
