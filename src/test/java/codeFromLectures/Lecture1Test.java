package codeFromLectures;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import beans.Person;
import mockdata.MockData;

class FindYoungPeople {
   // private Person person;

    public void getoutput() throws IOException {
        List<Person> allPersonData = MockData.getPeople();
        List<Person> filteredData=allPersonData.stream().filter(o->o.getAge()<=18).limit(4).collect(Collectors.toList());
        filteredData.forEach(System.out::println);
        
    }

}

public class Lecture1Test {
    public static void main(String[] args) throws IOException {
        FindYoungPeople fy = new FindYoungPeople();
        fy.getoutput();
    }

}

class Lecture1TestOfTest {

    @Test
    public void testOutput() {

    }
}