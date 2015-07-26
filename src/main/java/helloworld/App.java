package helloworld;

import org.jooby.Jooby;

public class App extends Jooby{

  {

    get("/", req -> "Hello " + req.param("name").value("World") + "!");

  }

  public static void main(final String[] args) throws Exception {
    new App().start(args);
  }
}
