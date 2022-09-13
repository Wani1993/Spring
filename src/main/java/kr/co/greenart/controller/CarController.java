package kr.co.greenart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarService;

@Controller
@RequestMapping("/car")
@ResponseBody // 모든 메소드가 응답 바디로 보낸다면 위에다 언급해도 된다.
public class CarController {
	@Autowired
	private CarService service;
	
	@GetMapping
	public List<Car> view() {
		return service.list();
	}
	
	@GetMapping("/{id}")
	public Car carById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<String> add(@RequestBody Car car) {
		service.add(car);
		
		return ResponseEntity.ok("{ \"result\" : \"ok\" }");
	}
	
	@PutMapping // 수정은 보통 post나 put 방식을 사용한다.
	public ResponseEntity<String> update(@RequestBody Car car) {
		service.update(car);
		
		return ResponseEntity.ok("{ \"result\" : \"ok\" }");
	}
	
	@DeleteMapping("/{id}") // delete 맵핑으로 지우는 방식을 사용한다.
	public ResponseEntity<String> delete(@PathVariable int id) {
		service.delete(id);
		
		return ResponseEntity.ok("{ \"result\" : \"ok\" }");
	}
}
