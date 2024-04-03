package kaem0n.u5w1d2;

import kaem0n.u5w1d2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D2Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2Application.class);

		Menu menu = ctx.getBean(Menu.class);
		System.out.println();
		System.out.println(menu);
	}

}
