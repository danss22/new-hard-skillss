package by.mtereshchenko.Lesson22;



import by.mtereshchenko.Lesson20.model.City;
import by.mtereshchenko.Lesson20.repository.CityRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/cities")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        CityRepository repository = new CityRepository();
        try {
            List<City> cities = repository.readAll();
            request.setAttribute("cities", cities);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("index.jsp").forward(request, resp);
//        resp.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = resp.getWriter();
//        out.println("<!DOCTYPE html>\n" +
//                "<html lang=\"en\">\n" +
//                "<head>\n" +
//                "    <meta charset=\"UTF-8\">\n" +
//                "    <title>Title</title>\n" +
//                "</head>\n" +
//                "<body>\n");
//        out.println("<table border=\"1\">");
////        out.println("<table>");
//        CityRepository repository = new CityRepository();
//        List<City> cities = null;
//        try {
//            cities = repository.readAll();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        out.println("<tr>");
//            out.println("<th>Id</th>");
//            out.println("<th>Name</th>");
//            out.println("</tr>");
//            for (City city : cities) {
//                out.println("<tr>"); // table row
//                out.println("<td>" + city.id + "</td>"); // table data
//                out.println("<td>" + city.name + "</td>"); // table data
//                out.println("</tr>");
//            }
//
//        out.println("<table>");
//        out.println("</body>\n" +
//                "</html> ");
//        out.close();
    }
}
