package api.cloudfoundry.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;



/**
 * Servlet implementation class Servlet1
 */

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		Resource res = new ClassPathResource("bean-conf.xml");
		XmlBeanFactory beanfact = new XmlBeanFactory(res);
		TestBean testb=(TestBean)beanfact.getBean("testbean1");
		List list = testb.getAll();
		out.println("<html><body>");
		this.pringAll(list,out);
		out.println("</body></html>");
	}
		public void pringAll(List list,PrintWriter out){
			out.println("<table border=1");
			out.println("<tr><th>ID</th>");
			out.println("<th>Name</th>");
			out.println("<th>Memo</th></tr>");
			for (Iterator it = list.iterator(); it.hasNext();) {
				Map map = (Map) it.next();
				out.println("<tr>");
				out.println("<td>"+map.get("id")+"</td>");
				out.println("<td>"+map.get("name")+"</td>");
				out.println("<td>"+map.get("memo")+"</td>");
			}
			out.println("</table>")	;
				
				
			}
			
			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
