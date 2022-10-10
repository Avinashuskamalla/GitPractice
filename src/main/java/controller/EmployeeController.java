package controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.stackify.EmpRespository;
import com.example.blog.stackify.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmpRespository empRespository;

	@GetMapping("/find")
	public void empFind() {

		Integer[] i = { 1, 2,3 };

		List<Optional<Employee>> empOptionasl = Stream.of(i).map(empRespository::findById).filter(e->!(e.isEmpty()) && e.get().getSalary()>30 ).collect(Collectors.toList());

System.out.println(	Stream.of(i).map(empRespository::findById).filter((e->!(e.isEmpty()) && e.get().getSalary()>25)).findFirst().orElseGet(null));
		
		
		
		System.out.println(empOptionasl);

	}

}
