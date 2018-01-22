package com.jjshome.viewer.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 在线预览先关配置<br/>
 * 1.支持meta-data,用于ide智能提示<br/>
 * 2.可以使用validation对配置属性进行验证<br/>
 * 3.类型安全
 *
 * @author lhw
 */
@Component
@ConfigurationProperties(prefix = "viewer")
@Validated
public class ViewerConfig {

  /**
   * test
   */
  @NotEmpty
  private String name;

  private String notNull;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNotNull() {
    return notNull;
  }

  public void setNotNull(String notNull) {
    this.notNull = notNull;
  }
}
