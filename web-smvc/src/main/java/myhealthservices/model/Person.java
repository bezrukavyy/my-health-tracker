package myhealthservices.model;

import lombok.Builder;
import lombok.Data;
//hello man!

/**
 * Created by gbezruk on 10/25/16.
 */
@Data
@Builder
public class Person {

    private String firstName;

    private String lastName;

    private String email;
}
