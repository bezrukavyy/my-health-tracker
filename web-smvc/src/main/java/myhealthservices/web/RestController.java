package myhealthservices.web;

import myhealthservices.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gbezruk on 10/25/16.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(path = "/person", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(@RequestParam(name="email") String email) {

        return Person.builder()
                .firstName("Tester")
                .lastName("Testoff")
                .email("tester.testoff@geemail.com")
                .build();
    }
}
