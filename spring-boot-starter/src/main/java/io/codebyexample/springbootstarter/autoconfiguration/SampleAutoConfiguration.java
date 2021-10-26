package io.codebyexample.springbootstarter.autoconfiguration;

import io.codebyexample.springbootstarter.properties.SampleProperties;
import io.codebyexample.springbootstarter.services.SampleService;
import io.codebyexample.springbootstarter.services.SampleServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huypva
 */
@Configuration
@ConditionalOnProperty(name = "active", prefix = "sample-code", havingValue = "true")
@EnableConfigurationProperties(SampleProperties.class)
public class SampleAutoConfiguration {

  @ConditionalOnMissingBean
  @Bean
  SampleService sampleService(SampleProperties sampleProperties) {
    return new SampleServiceImpl(sampleProperties);
  }

}
