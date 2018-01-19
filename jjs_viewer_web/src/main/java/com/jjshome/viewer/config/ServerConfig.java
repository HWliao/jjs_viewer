package com.jjshome.viewer.config;


import io.undertow.Undertow;
import io.undertow.UndertowOptions;
import org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 服务器先关配置类
 *
 * @author lenovo
 */
@Configuration
public class ServerConfig {

  @Bean
  UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
    UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
    factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
      @Override
      public void customize(Undertow.Builder builder) {
        // 开启对http2.0的支持
        builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true);
      }
    });
    return factory;
  }
}
