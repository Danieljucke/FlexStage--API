package com.infosetgroup.FlexStage.Controller;

import com.infosetgroup.FlexStage.Entity.Service;
import com.infosetgroup.FlexStage.Repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping(value = "/getAll",headers = "Accept=application/json")
    private @ResponseBody
    ResponseEntity<Iterable<Service>> getAllService () {
        try {
            Iterable<Service> services = new ArrayList<>();
            services = serviceRepository.findAll();
            return new ResponseEntity<>(services, HttpStatus.OK);
        } catch (Exception exception) {
          throw new IllegalStateException(exception) ;
        }
    }
}
