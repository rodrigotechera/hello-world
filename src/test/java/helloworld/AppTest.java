package helloworld;

import org.junit.Test;

public class AppTest extends BaseTest {

  @Test
  public void shouldSayHello() throws Exception {
    server.get("/")
        .expect("Hello World!")
        .header("Content-Type", "text/html;charset=UTF-8");
  }

  @Test
  public void shouldSayHelloToSomeOne() throws Exception {
    server.get("/?name=Jooby")
        .expect("Hello Jooby!")
        .header("Content-Type", "text/html;charset=UTF-8");
  }

}
