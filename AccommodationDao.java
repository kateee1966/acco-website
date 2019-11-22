package com.accommodation.dao;

import com.accommodation.model.Accommodation;
import com.accommodation.model.CompanyAccommodation;
import com.accommodation.model.PersonalAccommodation;
import com.accommodation.model.User;
import com.accommodation.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccommodationDao {
    private JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

    //Give an accommodationID return full information of this accommodation
    public Accommodation concreteAccommodation(Accommodation inputAccommodation){
        String sql = "select * from accommodation where accommodationID = ? and whetherComplete = ?";
        Accommodation returnAccommodation = template.queryForObject(sql,  new BeanPropertyRowMapper<Accommodation>(Accommodation.class), inputAccommodation.getAccommodationID(), 0);
        return returnAccommodation;
    }

    public CompanyAccommodation concreteCompanyAccommodation(Accommodation inputAccommodation){
        String sql = "select * from accommodation where accommodationID = ? and whetherComplete = ?";
        CompanyAccommodation returnCompanyAccommodation = template.queryForObject(sql, new BeanPropertyRowMapper<CompanyAccommodation>(CompanyAccommodation.class),inputAccommodation.getAccommodationID(), 0);
        return returnCompanyAccommodation;
    }

    public PersonalAccommodation concretePersonalAccommodation(Accommodation inputAccommodation){
        String sql = "select * from accommodation where accommodationID = ? and whetherComplete = ?";
        PersonalAccommodation returnPersonalAccommodation = template.queryForObject(sql, new BeanPropertyRowMapper<PersonalAccommodation>(PersonalAccommodation.class),inputAccommodation.getAccommodationID(), 0);
        return returnPersonalAccommodation;
    }

    public Accommodation searchLocation(Accommodation searchFirst) {
        String sql1 = "select * from accommodation where city = ? and guestNum = ? and startDateString = ? and endDateString = ?";
        System.out.println("after sql");
        List<Accommodation> resultList = template.query(sql1, new BeanPropertyRowMapper<Accommodation>(Accommodation.class), searchFirst.getCity(), searchFirst.getGuestNum(), searchFirst.getStartDateString(), searchFirst.getEndDateString());
        System.out.println("after query");
        // attempt to search the keyword and find matches from also suburb
        /*
        String sql2 = "select * from accommodation where suburb = ? and guestNum = ? and startDate = ? and endDate = ?";
        Accommodation resultTwo = template.queryForObject(sql2, searchFirst.getCity(), searchFirst.getGuestNum(), searchFirst.getStartDateString(), searchFirst.getEndDateString());

        result = resultOne + resultTwo;*/
        return (Accommodation) resultList;
    }

    public Accommodation searchOthersPersonal(PersonalAccommodation searchSecond) {
        String sql = "select * from accommodation where pricePerDay <= ? and guestNum = ? and heating = ? and FirePlace = ?" +
                "and Wmachine = ? and airCond = ? and bed = ? and singleRm = ? and doubleRm = ? and propertyType = ?";
        List<Accommodation> resultList = template.queryForObject(sql, searchSecond.getPricePerDay(), searchSecond.getGuestNum(), searchSecond.getHeating(),
                searchSecond.getFirePlace(), searchSecond.getWmachine(), searchSecond.getAirCond(), searchSecond.getBed(), searchSecond.getSingleRm(),
                searchSecond.getDoubleRm(), searchSecond.getPropertyType());
        return (Accommodation) resultList;
    }

    public Accommodation searchOthersCompany(CompanyAccommodation searchSecond) {
        String sql = "select * from accommodation where pricePerDay <= ? and star >= ? and guestNum = ? and heating = ? and FirePlace = ?" +
                "and Wmachine = ? and airCond = ? and bed = ? and singleRm = ? and doubleRm = ? and propertyType = ?";
        List<Accommodation> resultList = template.queryForObject(sql, searchSecond.getPricePerDay(), searchSecond.getStar(), searchSecond.getGuestNum(),
                searchSecond.getHeating(), searchSecond.getFirePlace(), searchSecond.getWmachine(), searchSecond.getAirCond(), searchSecond.getBed(),
                searchSecond.getSingleRm(), searchSecond.getDoubleRm(), searchSecond.getPropertyType());
        return (Accommodation) resultList;
    }


}
