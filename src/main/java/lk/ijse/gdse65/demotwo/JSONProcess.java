package lk.ijse.gdse65.demotwo;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "jsonProcess",urlPatterns = "/jsonu")
public class JSONProcess extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       if(req.getContentType() == null ||
               !req.getContentType().toLowerCase().startsWith("application/json")){
           resp.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
       }
//        BufferedReader reader = req.getReader();
//        StringBuilder sb = new StringBuilder();
//        reader.lines().forEach(line-> sb.append(line+"\n"));
//        System.out.println(sb);

//        JsonReader reader = Json.createReader(req.getReader());
//        JsonObject jsonObj = reader.readObject();
//        System.out.println(jsonObj.getString("name"));
//        System.out.println(jsonObj.getString("city"));
//        System.out.println(jsonObj.getString("email"));

        //if there is an array
//        JsonReader reader = Json.createReader(req.getReader());
//        JsonArray jsonValues = reader.readArray();
//        for (int i = 0; i < jsonValues.size(); i++) {
//            JsonObject jsonObj = jsonValues.getJsonObject(i);
//            System.out.println(jsonObj.getString("name"));
//            System.out.println(jsonObj.getString("city"));
//            System.out.println(jsonObj.getString("email"));
//        }

    }
}
