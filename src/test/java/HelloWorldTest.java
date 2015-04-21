import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {

		assertThat(HelloWorld.sayHello()).isEqualTo("Hello Duchess");
	}
}
