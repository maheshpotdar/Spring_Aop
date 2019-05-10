package AtTheRateAopManajeServicePrivodeKaratoAdvice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import com.mahesh.model.Company;
@Aspect
public class MessageingService {

	// hi method call houde before execution of public void m1() method.
	/*
	 * @Before("execution(public Car getCar())") public void sayWelcome() {
	 * System.out.println("Welcome In Our World."); }
	 */
	@Before("execution(public Company getCompany())")
	public void sayGoodBye() {
		System.out.println("Good bye...see you again");
	}

}
