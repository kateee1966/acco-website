package com.accommodation.web;

import com.accommodation.dao.AccommodationDao;
import com.accommodation.model.Accommodation;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

@WebServlet("/SearchFirstServlet")
public class SearchFirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String location = request.getParameter("location");
        System.out.println("location: " + location);
        String datefilter = request.getParameter("datefilter");
        System.out.println("datefilter: " + datefilter);
        //System.out.println("kk"+request.getParameter("guest"));
        Integer guestNum = Integer.parseInt(request.getParameter("guest"));
        System.out.println("guest: " + guestNum);

        // split the start date and end date
        String[] startAndEnd = datefilter.split(" - ");
        String startDate = startAndEnd[0];
        String endDate = startAndEnd[1];
        System.out.println("startDate: " + startDate + " endDate: " + endDate);

        Accommodation accom = new Accommodation();
        accom.setCity(location);
        try {
            accom.setStartDateString(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            accom.setEndDateString(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        accom.setGuestNum(guestNum);

        //String[] locationKwd = location.split(" ");

        AccommodationDao dao = new AccommodationDao();
        System.out.println("Check");
        Accommodation accomSearch1 = dao.searchLocation(accom);
        System.out.println("Check");

        // using for loop to match the keyword with city and suburb
        // to search for more intelligent results when input is not accurate
        /*
        for (int i = 0; i < location.length(); i++) {
            partLocation = locationKwd[i];
            accomSearch1 = dao.searchLocation(accom);
        }
*/
        JSONObject json = new JSONObject();
        if(accomSearch1 == null){
            System.out.println("Null");
            // 0 is false
            json.put("state", 0);
            json.put("accomSearch1", accomSearch1);
        }
        else{
            System.out.println("Not Null");
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
