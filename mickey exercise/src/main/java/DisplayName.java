import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
import com.adventnet.persistence.DataAccess;
import com.adventnet.persistence.DataAccessException;
import com.adventnet.persistence.DataObject;
import com.adventnet.persistence.Row;
@WebServlet("/")
public class DisplayName extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		SelectQuery query = new SelectQueryImpl(Table.getTable("StudentDetails"));
		query.addSelectColumn(Column.getColumn(null,"*"));
//		Criteria c=new Criteria(Column.getColumn("StudentDetails","DOB"),  Calendar.getInstance().get(Calendar.MONTH) , QueryConstants.EQUAL);
//		query.setCriteria(c);
		try {
			DataObject dob = DataAccess.get(query);
			PrintWriter pw = res.getWriter();
			Iterator i = dob.getRows("StudentDetails");
			Long id = null;
			while(i.hasNext()) {
				Row r = (Row)i.next();
				Date d = (Date)r.get(5);
				Calendar cal = Calendar.getInstance();
				cal.setTime(d);
				int month = cal.get(Calendar.MONTH);
				if(month == Calendar.getInstance().get(Calendar.MONTH)) {
					id = (Long)r.get(1);
					pw.write("<b>"+id+"</b><br>");
				}
				
			}
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		SelectQuery query = new SelectQueryImpl(Table.getTable("StudentDetails"));
//		query.addSelectColumn(Column.getColumn(null,"*"));
//		Criteria c=new Criteria(Column.getColumn("StudentDetails","DOB"),Column.getColumn("StudentDetails","DOA") , QueryConstants.EQUAL);
//		query.setCriteria(c);
//		try {
//			DataObject dob = DataAccess.get(query);
//			PrintWriter pw = res.getWriter();
//			Iterator i = dob.getRows("StudentDetails");
//			Long id = null;
//			while(i.hasNext()) {
//				Row r = (Row)i.next();
//				id = (Long)r.get(1);
//				pw.write("<b>"+id+"</b><br>");
//			}
//			
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		PrintWriter pw = res.getWriter();
//		for(int i=0;i<5;i++) {
//			SelectQuery query = new SelectQueryImpl(Table.getTable("StudentCocurrActivity"));
//			query.addSelectColumn(Column.getColumn("StudentCocurrActivity","STUDENT_ID"));
//			query.addSelectColumn(Column.getColumn("StudentCocurrActivity","ACTIVITY_ID"));
//			query.setCriteria(new Criteria(Column.getColumn("StudentCocurrActivity","ACTIVITY_ID"), 201+i, QueryConstants.EQUAL));
//			
//				try {
//					int count = 0;
//					
//					DataObject dob = DataAccess.get(query);
//					Iterator it = dob.getRows("StudentCocurrActivity");
//					Long id = null;
//					while(it.hasNext()) {
//						Row r = (Row)it.next();
//						id = (Long)r.get(2);
//						count++;
//						
//					}
//					pw.write(id +" - "+count+"\n");
//				} catch (DataAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//		
//		}
		
//		Long sid[] = new Long[4];
//		int max[] = new int[4];
//		PrintWriter pw = res.getWriter();
//		for(int i=0;i<20;i++) {
//			SelectQuery query = new SelectQueryImpl(Table.getTable("Marks"));
//			query.addSelectColumn(Column.getColumn("Marks","STUDENT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","SUBJECT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","MARK"));
//			int j;
//			if(i<5) {
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 210901+i, QueryConstants.EQUAL));
//			
//				try {
//					int total = 0;
//					
//					DataObject dob = DataAccess.get(query);
//					Iterator it = dob.getRows("Marks");
//					Long id = null;
//					while(it.hasNext()) {
//						Row r = (Row)it.next();
//						int n = (int)r.get(3);
//						id = (Long)r.get(1);
//						total += n;
//						
//					}
//					if(total>max[0]) {
//						max[0] = total;
//						sid[0] = id;
//					}
//				} catch (DataAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			else if(i<10) {
//				j=i-5;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211001+j, QueryConstants.EQUAL));
//			
//				try {
//					int total = 0;
//					DataObject dob = DataAccess.get(query);
//					Iterator it = dob.getRows("Marks");
//					Long id = null;
//					while(it.hasNext()) {
//						Row r = (Row)it.next();
//						int n = (int)r.get(3);
//						id = (Long)r.get(1);
//						total += n;
//						
//					}
//					if(total>max[1]) {
//						max[1] = total;
//						sid[1] = id;
//					}
//				} catch (DataAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			else if(i<15) {
//				j=i-10;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211101+j, QueryConstants.EQUAL));
//		
//				try {
//					int total = 0;
//					DataObject dob = DataAccess.get(query);
//					Iterator it = dob.getRows("Marks");
//					Long id = null;
//					while(it.hasNext()) {
//						Row r = (Row)it.next();
//						int n = (int)r.get(3);
//						id = (Long)r.get(1);
//						total += n;
//						
//					}
//					if(total>max[2]) {
//						max[2] = total;
//						sid[2] = id;
//					}
//				} catch (DataAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			else if(i<20){
//				j=i-15;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211201+j, QueryConstants.EQUAL));
//				
//				try {
//					int total = 0;
//					DataObject dob = DataAccess.get(query);
//					Iterator it = dob.getRows("Marks");
//					Long id = null;
//					while(it.hasNext()) {
//						Row r = (Row)it.next();
//						int n = (int)r.get(3);
//						id = (Long)r.get(1);
//						total += n;
//						
//					}
//					if(total>max[3]) {
//						max[3] = total;
//						sid[3] = id;
//					}
//				} catch (DataAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//		
//		
//		}
//		for(int k = 0; k<4; k++) {
//			pw.write(sid[k]+"\n");
//		}
		
//		for(int i=0;i<20;i++) {
//			SelectQuery query = new SelectQueryImpl(Table.getTable("Marks"));
//			query.addSelectColumn(Column.getColumn("Marks","STUDENT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","SUBJECT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","MARK"));
//			int j;
//			if(i<5) {
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 210901+i, QueryConstants.EQUAL));
//			}
//			else if(i<10) {
//				j=i-5;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211001+j, QueryConstants.EQUAL));
//			}
//			else if(i<15) {
//				j=i-10;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211101+j, QueryConstants.EQUAL));
//			}
//			else if(i<20){
//				j=i-15;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211201+j, QueryConstants.EQUAL));
//			}
//	
//		
//		PrintWriter pw = res.getWriter();
//		try {
//			int count = 0;
//			Long id = null;
//			DataObject dob = DataAccess.get(query);
//			Iterator it = dob.getRows("Marks");
//			while(it.hasNext()) {
//				Row r = (Row)it.next();
//				int n = (int)r.get(3);
//				id = (Long)r.get(1);
//				if(n>50) {
//					count++;
//				}
//			}
//			if(count == 3) {
//				pw.write(id+"\n");
//			}
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
		
//		for(int i=0;i<20;i++) {
//			SelectQuery query = new SelectQueryImpl(Table.getTable("StudentCocurrActivity"));
//			query.addSelectColumn(Column.getColumn("StudentCocurrActivity","STUDENT_ID"));
//			query.addSelectColumn(Column.getColumn("StudentCocurrActivity","ACTIVITY_ID"));
//			int j;
//			if(i<5) {
//				query.setCriteria(new Criteria(Column.getColumn("StudentCocurrActivity","STUDENT_ID"), 210901+i, QueryConstants.EQUAL));
//			}
//			else if(i<10) {
//				j=i-5;
//				query.setCriteria(new Criteria(Column.getColumn("StudentCocurrActivity","STUDENT_ID"), 211001+j, QueryConstants.EQUAL));
//			}
//			else if(i<15) {
//				j=i-10;
//				query.setCriteria(new Criteria(Column.getColumn("StudentCocurrActivity","STUDENT_ID"), 211101+j, QueryConstants.EQUAL));
//			}
//			else if(i<20){
//				j=i-15;
//				query.setCriteria(new Criteria(Column.getColumn("StudentCocurrActivity","STUDENT_ID"), 211201+j, QueryConstants.EQUAL));
//			}
//	
//		
//		PrintWriter pw = res.getWriter();
//		try {
//			int count = 0;
//			Long id = null;
//			DataObject dob = DataAccess.get(query);
//			Iterator it = dob.getRows("StudentCocurrActivity");
//			while(it.hasNext()) {
//				Row r = (Row)it.next();
//				id = (Long)r.get(1);
//				count++;	
//			}
//			if(count > 3) {
//				pw.write(id+"\n");
//			}
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
		
//		for(int i=0;i<20;i++) {
//			SelectQuery query = new SelectQueryImpl(Table.getTable("Marks"));
//			query.addSelectColumn(Column.getColumn("Marks","STUDENT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","SUBJECT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","MARK"));
//			int j;
//			if(i<5) {
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 210901+i, QueryConstants.EQUAL));
//			}
//			else if(i<10) {
//				j=i-5;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211001+j, QueryConstants.EQUAL));
//			}
//			else if(i<15) {
//				j=i-10;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211101+j, QueryConstants.EQUAL));
//			}
//			else if(i<20){
//				j=i-15;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211201+j, QueryConstants.EQUAL));
//			}
//	
//		
//		PrintWriter pw = res.getWriter();
//		try {
//			int count = 0;
//			Long id = null;
//			DataObject dob = DataAccess.get(query);
//			Iterator it = dob.getRows("Marks");
//			while(it.hasNext()) {
//				Row r = (Row)it.next();
//				int n = (int)r.get(3);
//				id = (Long)r.get(1);
//				if(n<50) {
//					count++;
//				}
//			}
//			if(count == 2) {
//				pw.write(id+"\n");
//			}
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
		
//		for(int i=0;i<5;i++) {
//		SelectQuery query = new SelectQueryImpl(Table.getTable("StudentCocurrActivity"));
//		query.addSelectColumn(Column.getColumn(null,"*"));
//		query.setCriteria(new Criteria(Column.getColumn("StudentCocurrActivity","ACTIVITY_ID"), 201+i, QueryConstants.EQUAL)); 
//		PrintWriter pw = res.getWriter();
//		try {
//			DataObject dob = DataAccess.get(query);
//			pw.println(dob);
//			Iterator it = dob.getRows("StudentCocurrActivity");
//			int n=0;
//			while(it.hasNext()) {
//				Row r = (Row)it.next();
//				n+=1;
//			}
//			pw.write(n+"\n");
//			
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//		SelectQuery query = new SelectQueryImpl(Table.getTable("StudentDetails"));
//		query.addSelectColumn(Column.getColumn(null,"*"));
//		query.setCriteria(new Criteria(Column.getColumn("StudentDetails","STUDENT_ID"), 211001, QueryConstants.EQUAL)); 
//		PrintWriter pw = res.getWriter();
//		try {
//			DataObject dob = DataAccess.get(query);
//			pw.println(dob);
//			Iterator i = dob.getRows("StudentDetails");
//			while(i.hasNext()) {
//				Row r = (Row)i.next();
//				List a = r.getValues();
//				pw.write("<b>"+a+"</b><br>");
//			}
//			
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
			
//		SelectQuery query = new SelectQueryImpl(Table.getTable("Marks"));
//		query.addSelectColumn(Column.getColumn("Marks","STUDENT_ID"));
//		query.addSelectColumn(Column.getColumn("Marks","SUBJECT_ID"));
//		query.addSelectColumn(Column.getColumn("Marks","MARK"));
//		PrintWriter pw = res.getWriter();
//		try {
//			DataObject dob = DataAccess.get(query);
//			Iterator it = dob.getRows("Marks");
//			while(it.hasNext()) {
//				Row r = (Row)it.next();
//				int n = (int)r.get(3);
//				if(n>90) {
//					pw.write("O Grade\n");
//				}
//				else if(n>80) {
//					pw.write("A+ Grade\n");
//				}
//				else if(n>70) {
//					pw.write("A Grade\n");
//				}
//			}
//			
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		for(int i=0;i<20;i++) {
//			SelectQuery query = new SelectQueryImpl(Table.getTable("Marks"));
//			query.addSelectColumn(Column.getColumn("Marks","STUDENT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","SUBJECT_ID"));
//			query.addSelectColumn(Column.getColumn("Marks","MARK"));
//			int j;
//			if(i<5) {
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 210901+i, QueryConstants.EQUAL));
//			}
//			else if(i<10) {
//				j=i-5;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211001+j, QueryConstants.EQUAL));
//			}
//			else if(i<15) {
//				j=i-10;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211101+j, QueryConstants.EQUAL));
//			}
//			else if(i<20){
//				j=i-15;
//				query.setCriteria(new Criteria(Column.getColumn("Marks","STUDENT_ID"), 211201+j, QueryConstants.EQUAL));
//			}
//	
//		
//		PrintWriter pw = res.getWriter();
//		try {
//			int total = 0;
//			DataObject dob = DataAccess.get(query);
//			Iterator it = dob.getRows("Marks");
//			while(it.hasNext()) {
//				Row r = (Row)it.next();
//				int n = (int)r.get(3);
//				total += n;
//			}
//			pw.write(Integer.toString(total)+"\n");
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//		
//		SelectQuery query = new SelectQueryImpl(Table.getTable("StudentDetails"));
//		query.addSelectColumn(Column.getColumn("StudentDetails","STUDENT_ID"));
//		query.addSelectColumn(Column.getColumn("StudentDetails","STUDENT_NAME"));
//		query.addSelectColumn(Column.getColumn("StudentDetails","CLASS_ID"));
//		query.setCriteria(new Criteria(Column.getColumn("StudentDetails","STUDENT_ID"), 2110, QueryConstants.BEGIN_WITH)); 
//		PrintWriter pw = res.getWriter();
//		//OutputStream os = res.getOutputStream();
//		
//		try {
//			DataObject dob = DataAccess.get(query);
//			pw.println(dob);
//			Iterator i = dob.getRows("StudentDetails");
//			while(i.hasNext()) {
//				Row r = (Row)i.next();
//				String str = (String)r.get(3);
//				
//				System.out.println(str+"\n");
////				os.write("hello".getBytes());
//				pw.write("<b>"+str+"</b><br>");
////				os.write((str+"/n").getBytes());
////				os.write("hello".getBytes());
//			}
//			
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
