package hello.jdbc.connection;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DBConnectionUtilTest {

  @Test
  void getConnection() {
    assertNotNull(DBConnectionUtil.getConnection());
  }
}