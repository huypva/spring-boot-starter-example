package io.codebyexample.springbootstarter.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author huypva
 */
@Getter
@Setter
@ConfigurationProperties("sample-code")
public class SampleProperties {

  public boolean active;
  public String value;

}
