package com.example.bootdd2;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public class Customers {
}

@RestController
//@RequestMapping("/")
@ResponseBody
class CustomersController {
    CustomerRepo cr;

    public CustomersController(CustomerRepo cr) {
        this.cr = cr;
    }

    //@RequestMapping(method = RequestMethod.GET, produces = "text/html")
    @GetMapping("/")
    Collection<Customer> getCustomers(){
        return cr.findAll();
    }
}

@Repository
interface CustomerRepo extends ListCrudRepository<Customer, Integer>{}

@Table("customer")
record Customer (@Id Integer id, String name){}
