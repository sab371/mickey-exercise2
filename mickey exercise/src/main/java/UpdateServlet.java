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
import com.adventnet.ds.query.Table;
import com.adventnet.ds.query.UpdateQuery;
import com.adventnet.ds.query.UpdateQueryImpl;
import com.adventnet.persistence.DataAccess;
import com.adventnet.persistence.DataAccessException;
import com.adventnet.persistence.DataObject;
import com.adventnet.persistence.WritableDataObject;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		
		//needs to define query
//		DataObject dob;
//		Row r;
//		try {
//			dob = DataAccess.getD;
//			r = dob.getFirstRow("Marks");
//			r.set(3, 95);
//			dob.updateRow(r);
//			DataAccess.add(dob);
//		} catch (DataAccessException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		Criteria c = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211102, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 101, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq = new UpdateQueryImpl("Marks");
		uq.setUpdateColumn("MARK",28);
		
		uq.setCriteria(c);
		
		Criteria c1 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211102, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 102, QueryConstants.EQUAL));
		UpdateQuery uq1 = new UpdateQueryImpl("Marks");
		uq1.setUpdateColumn("MARK",47);
		
		uq1.setCriteria(c1);

		Criteria c11 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211102, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 103, QueryConstants.EQUAL));
		UpdateQuery uq11 = new UpdateQueryImpl("Marks");
		uq11.setUpdateColumn("MARK",36);
		
		uq11.setCriteria(c11);
		
		Criteria c2 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211104, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 101, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq2 = new UpdateQueryImpl("Marks");
		uq2.setUpdateColumn("MARK",84);
		
		uq2.setCriteria(c2);

		Criteria c3 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211104, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 102, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq3 = new UpdateQueryImpl("Marks");
		uq3.setUpdateColumn("MARK",58);
		
		uq3.setCriteria(c3);

		Criteria c4 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211104, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 103, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq4 = new UpdateQueryImpl("Marks");
		uq4.setUpdateColumn("MARK",65);
		
		uq4.setCriteria(c4);

		Criteria c5 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211202, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 101, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq5 = new UpdateQueryImpl("Marks");
		uq5.setUpdateColumn("MARK",39);
		
		uq5.setCriteria(c5);

		Criteria c6 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211202, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 103, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq6 = new UpdateQueryImpl("Marks");
		uq6.setUpdateColumn("MARK",73);
		
		uq6.setCriteria(c6);

		Criteria c7 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211202, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 102, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq7 = new UpdateQueryImpl("Marks");
		uq7.setUpdateColumn("MARK",75);
		
		uq7.setCriteria(c7);

		Criteria c8 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211203, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 101, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq8 = new UpdateQueryImpl("Marks");
		uq8.setUpdateColumn("MARK",79);
		
		uq8.setCriteria(c8);

		Criteria c9 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211203, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 102, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq9 = new UpdateQueryImpl("Marks");
		uq9.setUpdateColumn("MARK",73);
		
		uq9.setCriteria(c9);

		Criteria c10 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211203, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 103, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq10 = new UpdateQueryImpl("Marks");
		uq10.setUpdateColumn("MARK",78);
		
		uq10.setCriteria(c10);
		
		Criteria c12 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211204, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 101, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq12 = new UpdateQueryImpl("Marks");
		uq12.setUpdateColumn("MARK",77);
		
		uq12.setCriteria(c12);

		Criteria c13 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211204, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 102, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq13 = new UpdateQueryImpl("Marks");
		uq13.setUpdateColumn("MARK",83);
		
		uq13.setCriteria(c13);

		Criteria c14 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211204, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 103, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq14 = new UpdateQueryImpl("Marks");
		uq14.setUpdateColumn("MARK",78);
		
		uq14.setCriteria(c14);

		Criteria c15 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211205, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 101, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq15 = new UpdateQueryImpl("Marks");
		uq15.setUpdateColumn("MARK",57);
		
		uq15.setCriteria(c15);

		Criteria c16 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211205, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 102, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq16 = new UpdateQueryImpl("Marks");
		uq16.setUpdateColumn("MARK",53);
		
		uq16.setCriteria(c16);

		Criteria c17 = (new Criteria(Column.getColumn("Marks", "STUDENT_ID"), 211205, QueryConstants.EQUAL)).and(new Criteria(Column.getColumn("Marks", "SUBJECT_ID"), 103, QueryConstants.EQUAL)); 		
		
		UpdateQuery uq17 = new UpdateQueryImpl("Marks");
		uq17.setUpdateColumn("MARK",48);
		
		uq17.setCriteria(c17);
		try {
			DataAccess.update(uq);
			DataAccess.update(uq1);
			DataAccess.update(uq11);
			DataAccess.update(uq2);
			DataAccess.update(uq3);
			DataAccess.update(uq4);
			DataAccess.update(uq5);
			DataAccess.update(uq6);
			DataAccess.update(uq7);
			DataAccess.update(uq8);
			DataAccess.update(uq9);
			DataAccess.update(uq10);
			DataAccess.update(uq12);
			DataAccess.update(uq13);
			DataAccess.update(uq14);
			DataAccess.update(uq15);
			DataAccess.update(uq16);
			DataAccess.update(uq17);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
