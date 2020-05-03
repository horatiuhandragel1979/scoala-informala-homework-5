package ro.siit.age;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ServletAge extends HttpServlet {
    private String birthDate;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        birthDate = servletConfig.getInitParameter("birthDate");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestBirthDate = request.getParameter("birthDate");

        LocalDate date = LocalDate.parse((requestBirthDate == null) ? birthDate : requestBirthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate now = LocalDate.now();
        int numberOfYears = (int) ChronoUnit.YEARS.between(date, now);
        int numberOfDays = (int) ChronoUnit.DAYS.between(date, now);

        request.setAttribute("years", numberOfYears);
        request.setAttribute("days", numberOfDays);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("showAge.jsp");
        requestDispatcher.forward(request, response);
    }

    }
