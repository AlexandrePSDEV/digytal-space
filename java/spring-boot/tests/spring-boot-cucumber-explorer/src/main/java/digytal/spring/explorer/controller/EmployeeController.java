package digytal.spring.explorer.controller;

import java.net.URI;
import java.util.List;

import digytal.spring.explorer.model.Employee;
import digytal.spring.explorer.model.Profissao;
import digytal.spring.explorer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity create(@RequestBody Employee employee, UriComponentsBuilder uriComponentsBuilder) {
        Integer id = repository.save(employee);

        final URI uri = uriComponentsBuilder.path("/v1/employees/{id}")
                .build(id);

        return ResponseEntity.created(uri)
                .build();
    }
    @GetMapping
    public List<Employee> getAll(){
        return repository.getEmployees();
    }

}
