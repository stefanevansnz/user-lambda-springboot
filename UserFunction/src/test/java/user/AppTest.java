package user;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import user.App;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    // to be done.
  }
}
