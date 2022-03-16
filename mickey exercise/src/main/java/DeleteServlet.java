import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adventnet.ds.query.Column;
import com.adventnet.ds.query.Criteria;
import com.adventnet.ds.query.QueryConstants;
import com.adventnet.ds.query.SelectQuery;
import com.adventnet.ds.query.SelectQueryImpl;
import com.adventnet.persistence.DataAccess;
import com.adventnet.persistence.DataAccessException;
import com.adventnet.persistence.Row;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		

		try {
			Criteria c = new Criteria(Column.getColumn("StudentCocurrActivity", "ACTIVITY_ID"), 201, QueryConstants.NOT_EQUAL);
//			SelectQuery query = new SelectQueryImpl();
			DataAccess.delete(new Criteria(Column.getColumn("StudentCocurrActivity", "STUDENT_ID"),21100, QueryConstants.BEGIN_WITH).and(c));
//			DataAccess.delete(new Criteria(Column.getColumn("StudentCocurrActivity", "STUDENT_ID"),210000, QueryConstants.GREATER_THAN));
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
