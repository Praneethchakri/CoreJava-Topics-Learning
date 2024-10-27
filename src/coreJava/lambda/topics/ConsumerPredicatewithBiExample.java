package coreJava.lambda.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class ConsumerPredicatewithBiExample {

	BiPredicate<Double, String> salaryLocationPeedicate = (salary, location) -> salary > 10000
			&& location.equals("Germany");

	BiConsumer<String, List<String>> nameRoles = (name, roles) -> System.out
			.println(String.format("Name :: %s , Roles:: %s", name, roles));

	Consumer<BusinessUser> consumer = (businessUser -> {
		if (salaryLocationPeedicate.test(businessUser.getSalary(), businessUser.getLocation())) {
			nameRoles.accept(businessUser.getName(), businessUser.getRoles());
		}
	});

	public void printData(List<BusinessUser> user){
		user.forEach(consumer);
	}
	public static void main(String[] args) {
		List<String> roles = Arrays.asList("Developer", "ScrumMaster", "Architect", "SolutionArchitect");

		List<BusinessUser> listUsers = new ArrayList<>();
		listUsers.add(new BusinessUser(1, "Praneeth", 20000, roles, "Germany"));
		listUsers.add(new BusinessUser(2, "Ramesh", 12203, roles, "India"));
		listUsers.add(new BusinessUser(3, "Suresh", 9000, roles, "Singapor"));
		listUsers.add(new BusinessUser(4, "Harsih", 10100, roles, "China"));
		new ConsumerPredicatewithBiExample().printData(listUsers);

	}

}
