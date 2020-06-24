package principe_de_segregation_des_interfaces_I_;

public class Test {

	public static void main(String[] args) {

		Service service = new ServiceImpl();

		AdaptateurA adaptateurA = new AdaptateurA(service);

		adaptateurA.method1();
		adaptateurA.method2();

		AdaptateurB adaptateurB = new AdaptateurB(service);

		adaptateurB.method3();
		adaptateurB.method4();

		AdaptateurC adaptateurC = new AdaptateurC(service);

		adaptateurC.method5();
		adaptateurC.method6();

	}

}
