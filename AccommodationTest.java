package com.accommodation.test;

import com.accommodation.dao.AccommodationDao;
import com.accommodation.dao.Userdao;
import com.accommodation.model.Accommodation;
import com.accommodation.model.IndividualUser;
import org.junit.Test;

import java.text.ParseException;

public class AccommodationTest {
    @Test
    
    public void testConcreteAccommodation(){
        Accommodation input = new Accommodation();
        input.setAccommodationID("haha");
        Accommodation output = new Accommodation();
        AccommodationDao dao = new AccommodationDao();
        output = dao.concreteAccommodation(input);
        System.out.println(output.toString());
    }

    public void testSearchFirst() throws ParseException {
        Accommodation input = new Accommodation();
        input.setCity("Sydney");
        input.setStartDateString("07/11/2019");
        input.setEndDateString("08/11/2019");
        input.setGuestNum(2);
        Accommodation output;
        AccommodationDao dao = new AccommodationDao();
        output = dao.searchLocation(input);
        System.out.println(output.toString());
    }
}
