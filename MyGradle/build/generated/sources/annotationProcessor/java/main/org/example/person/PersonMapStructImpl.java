package org.example.person;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-11T21:58:07+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 11.0.1 (Oracle Corporation)"
)
public class PersonMapStructImpl implements PersonMapStruct {

    @Override
    public Person personDtoToPerson(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFullName( personDto.getName() );
        person.setYears( personDto.getAge() );

        return person;
    }
}
