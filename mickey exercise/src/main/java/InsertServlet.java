import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adventnet.ds.query.UpdateQuery;
import com.adventnet.ds.query.UpdateQueryImpl;
import com.adventnet.persistence.DataAccess;
import com.adventnet.persistence.DataAccessException;
import com.adventnet.persistence.DataObject;
import com.adventnet.persistence.Row;
import com.adventnet.persistence.WritableDataObject;
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		DataObject dob = new WritableDataObject();
		Row r[] = new Row[3];
		for (int i=0;i<3;i++) {
			r[i] = new Row("StudentCocurrActivity");
			r[i].set(1, 211104L);
			r[i].set(2, 201+i);
			try {
				dob.addRow(r[i]);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Row r1[] = new Row[2];
		for (int i=0;i<2;i++) {
			r1[i] = new Row("StudentCocurrActivity");
			r1[i].set(1, 210903L);
			r1[i].set(2, 201+i);
			try {
				dob.addRow(r1[i]);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		Row r[] = new Row[20]; 
//		for(int i=0;i<20;i++) {
//			r[i] = new Row("StudentCocurrActivity");
//		}
//		for(int i=0;i<20;i++) {
//			if(i<5) {
//				r[i].set(1, 210901L+i);
//				r[i].set(2, 201+i);
//			}
//			else if(i<10) {
//				int j=i-5;
//				r[i].set(1, 211001L+j);
//				r[i].set(2, 201+j);
//			}
//			else if(i<15) {
//				int j=i-10;
//				r[i].set(1, 211101L+j);
//				r[i].set(2, 201+j);
//			}
//			else {
//				int j=i-15;
//				r[i].set(1, 211201L+j);
//				r[i].set(2, 201+j);
//			}
//			if(i<5) {
//				int j = i*3;
//				r[j].set(1, 210901L+i);
//				r[j].set(2, 101);
//				r[j].set(3, 90);
//				j++;
//				r[j].set(1, 210901L+i);
//				r[j].set(2, 102);
//				r[j].set(3, 84);
//				j++;
//				r[j].set(1, 210901L+i);
//				r[j].set(2, 103);
//				r[j].set(3, 95);
//			}
//			else if(i<10) {
//				int k =i-5;
//				int j=i*3;
//				r[j].set(1, 211001L+k);
//				r[j].set(2, 101);
//				r[j].set(3, 92);
//				j++;
//				r[j].set(1, 211001L+k);
//				r[j].set(2, 102);
//				r[j].set(3, 95);
//				j++;
//				r[j].set(1, 211001L+k);
//				r[j].set(2, 103);
//				r[j].set(3, 85);
//			}
//			else if(i<15) {
//				int j = i-10;
//				int k=i*3;
//				r[k].set(1, 211101L+j);
//				r[k].set(2, 101);
//				r[k].set(3, 84);
//				k++;
//				r[k].set(1, 211101L+j);
//				r[k].set(2, 102);
//				r[k].set(3, 94);
//				k++;
//				r[k].set(1, 211101L+j);
//				r[k].set(2, 103);
//				r[k].set(3, 97);
//			}
//			else {
//				int j = i-15;
//				int k=i*3;
//				r[k].set(1, 211201L+j);
//				r[k].set(2, 101);
//				r[k].set(3, 84);
//				k++;
//				r[k].set(1, 211201L+j);
//				r[k].set(2, 102);
//				r[k].set(3, 93);
//				k++;
//				r[k].set(1, 211201L+j);
//				r[k].set(2, 103);
//				r[k].set(3, 83);
//			}
//		}
		
		
//		try {
//			for(int i=0;i<20;i++) {
//				dob.addRow(r[i]);;
//			}
//			
//		} catch (DataAccessException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		// Store it in the DB
		try {
			DataAccess.add(dob);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
