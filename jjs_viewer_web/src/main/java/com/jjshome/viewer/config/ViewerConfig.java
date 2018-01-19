package com.jjshome.viewer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * 在线预览先关配置<br/>
 * 1.申明项目所涉及到配置项,用于ide智能提示<br/>
 * 2.可以使用validation对配置属性进行验证<br/>
 *
 * @author lenovo
 */
@ConfigurationProperties(prefix = "viewer")
public class ViewerConfig {

  /**
   * test
   */
  private String name;

  @NotNull
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
