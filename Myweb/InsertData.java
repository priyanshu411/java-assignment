import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class InsertData extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name= req.getParameter("name");
        int rollNo=Integer.parseInt(req.getParameter("roll-no"));
        Connection con=null;
        Statement st=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
       if(con!=null){
          st=con.createStatement();
          int no=st.executeUpdate("insert into info(name,rollno) values ('"+name+"','"+rollNo+"');");
          if(no>0)
          out.println("data inserted succesfuly");
          else
          out.println("sorry,try again later..");
          con.close();
          st.close();
        }
        }catch(Exception e){
            out.println(e);
        }
    }
}