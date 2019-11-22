package com.accommodation.web;

import com.accommodation.dao.Userdao;
import com.accommodation.model.Accommodation;
import com.accommodation.model.CompanyAccommodation;
import com.accommodation.model.PersonalAccommodation;
import com.accommodation.model.User;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/SearchSecondServlet")
public class SearchSecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        Integer lowprice = Integer.valueOf(request.getParameter("lowprice"));
        Integer pet = Integer.valueOf(request.getParameter("pet"));
        Integer guestNum = Integer.valueOf(request.getParameter("guest"));
        String accomType = request.getParameter("accomType");

        Integer star = Integer.valueOf(request.getParameter("star"));
        String hotelType = request.getParameter("hoteType");

        Integer park = Integer.valueOf(request.getParameter("park"));
        Integer gym = Integer.valueOf(request.getParameter("gym"));
        Integer wifi = Integer.valueOf(request.getParameter("wifi"));
        Integer lift = Integer.valueOf(request.getParameter("lift"));
        Integer tv = Integer.valueOf(request.getParameter("tv"));

        Integer bedroom = Integer.valueOf(request.getParameter("bedroom"));
        Integer bathroom = Integer.valueOf(request.getParameter("bathroom"));
        Integer kitchen = Integer.valueOf(request.getParameter("kitchen"));

        PersonalAccommodation accom1 = new PersonalAccommodation();
        CompanyAccommodation accom2 = new CompanyAccommodation();

        String personalOrCompany;

        if (lowprice) {
            accom1.setPricePerDay(120.0);
            accom2.setPricePerDay(120.0);
        }
        else {
            accom1.setPricePerDay(99999.0);
            accom2.setPricePerDay(99999.0);
        }
        if (rating4) {

        accom2.setStar(4);
        personalOrCompany = "Personal";
    }
        else {
        accom2.setStar(1);
        personalOrCompany = "Personal";
    }
        accom1.setGuestNum(guestNum);
        accom2.setGuestNum(guestNum);

        if (hotelType) {
            personalOrCompany = "Company";
        }
        if (privateType) {
            personalOrCompany = "Personal";
        }
        if (entireType) {
            personalOrCompany = "Personal";
        }
        if (kitchen) {
            personalOrCompany = "Personal";
            accom1.setKitchen(1);
        }
        if (heating) {
            accom1.setHeating(1);
            accom2.setHeating(1);
        }
        else {
            accom1.setHeating(0);
            accom2.setHeating(0);
        }
        if (fireplace) {
            accom1.setFireplace(1);
            accom2.setFireplace(1);
        }
        else {
            accom1.setFireplace(0);
            accom2.setFireplace(0);
        }
        if (wmachine) {
            accom1.setWmachine(1);
            accom2.setWmachine(1);
        }
        else {
            accom1.setWmachine(0);
            accom2.setWmachine(0);
        }
        if (aircond) {
            accom1.setAircond(1);
            accom2.setAircond(1);
        }
        else {
            accom1.setAircond(0);
            accom2.setAircond(0);
        }

        accom1.setbed(bed);
        accom2.setbed(bed);

        accom1.setSingleRm(singleRm);
        accom2.setSingleRm(singleRm);

        accom1.setDoubleRm(doubleRm);
        accom2.setDoubleRm(doubleRm);

        accom1.setPropertyType(propertyType);
        accom2.setPropertyType(propertyType);

        Accommodationdao dao = new Accommodationdao();

        if (personalOrCompany == "Personal") {
            Accommodation accomSearch2 = dao.searchOthersPersonal(accom1);
        }
        else if (personalOrCompany == "Company"){
            Accommodation accomSearch2 = dao.searchOthersCompany(accom2);
        }

        JSONObject json = new JSONObject();
        if(accomSearch2 == null){
            // 0 is false
            json.put("state", 0);
            json.put("accomSearch1", accomSearch1);
        }
        else{
            // 1 is true
            json.put("state", 1);
            json.put("accomSearch1", accomSearch1);
        }

        response.getWriter().write(json.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
