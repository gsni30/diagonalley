package com.diagonalley.configs;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class PostgresConfig {
  private String host;
  private String user;
  private String password;
  private String port;
}
