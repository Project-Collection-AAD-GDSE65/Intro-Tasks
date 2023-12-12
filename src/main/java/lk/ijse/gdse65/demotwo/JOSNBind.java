package lk.ijse.gdse65.demotwo;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "jsonb",urlPatterns = "/jsonb")
public class JOSNBind extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getContentType() == null ||
                !req.getContentType().toLowerCase().startsWith("application/json")){
            resp.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
        }
        //json obj manipulation
        Jsonb jsonb = JsonbBuilder.create();
        List<Student> stuList = jsonb.fromJson(req.getReader(),
                new ArrayList<Student>(){
        }.getClass().getGenericSuperclass());
        stuList.forEach(System.out::println);






    }
}
