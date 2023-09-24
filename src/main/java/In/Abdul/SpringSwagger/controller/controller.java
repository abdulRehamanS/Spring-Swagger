package In.Abdul.SpringSwagger.controller;


import In.Abdul.SpringSwagger.Entity.Contact;
import In.Abdul.SpringSwagger.Service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class controller {

    @Autowired
    contactService service;

    @GetMapping("/")
    String getController() {
        return "Hello World";
    }

    @PostMapping("/add")
    String addContact(@RequestBody Contact contact) {
        return service.addContact(contact);
    }


    @GetMapping("/get")
    List<Contact> getContactList() {
        return service.getContactList();
    }
}
