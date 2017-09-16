import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws ParseException {
		/*Scanner sc = new Scanner(System.in);
		 
		 int n=sc.nextInt();
		  StudentGroup ob=new StudentGroup(n);
		  Student[] s=new Student[n];
		  for(int i=0;i<n;i++){
			  int id=sc.nextInt();
			  String name=sc.next();
			  String startDateString = sc.next();
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
				Date dt=null;
				try {
					dt= df.parse(startDateString);
					String newDateString = df.format(dt);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			  double avg=sc.nextDouble();
			  
			  s[i]=new Student(id,name,dt,avg);
			  s[i].setId(id);
			  s[i].setFullName(name);
			  s[i].setBirthDate(dt);
			  s[i].setAvgMark(avg);
		  }
		  /*for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		  }
		  
		  ob.setStudents(s);
		  Student[] s1=new Student[n];
		  s1=ob.getStudents();
		  for(int i=0;i<n;i++){
			  System.out.println(s1[i].getId()+" "+s1[i].getFullName()+" "+s1[i].getBirthDate()+" "+s1[i].getAvgMark());
		  }
		Student tmp=ob.getStudent(1);
		/*System.out.println(tmp.getId()+" "+tmp.getFullName()+" "+tmp.getBirthDate()+" "+tmp.getAvgMark());
		
		tmp=new Student(sc.nextInt(),sc.next(),new SimpleDateFormat("MM/dd/yyyy").parse(sc.next()),sc.nextDouble());
		ob.setStudent(tmp,1);
		
		for(int i=0;i<n;i++){
			  System.out.println(s1[i].getId()+" "+s1[i].getFullName()+" "+s1[i].getBirthDate()+" "+s1[i].getAvgMark());
		}*/
		
		/*
		n++;
		s=createNewArray(s);
		s[n-1]=new Student(sc.nextInt(),sc.next(),new SimpleDateFormat("MM/dd/yyyy").parse(sc.next()),sc.nextDouble());
		ob.addLast(s[n-1]);  
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		
		
	
		tmp=new Student(sc.nextInt(),sc.next(),new SimpleDateFormat("MM/dd/yyyy").parse(sc.next()),sc.nextDouble());
		n++;
		s=createNewArray(s);
		ob.addFirst(tmp);  
		s=ob.getStudents();

		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		tmp=new Student(sc.nextInt(),sc.next(),new SimpleDateFormat("MM/dd/yyyy").parse(sc.next()),sc.nextDouble());
		n++;
		s=createNewArray(s);
		ob.add(tmp,2);  
		s=ob.getStudents();
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		ob.setStudents(s);

		/*ob.remove(s[1]);  
		s=ob.getStudents();
		n=s.length;
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		
		
		int ind=1;
		ob.removeFromIndex(ind);
		s=ob.getStudents();
		n=s.length;
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		ob.removeFromElement(s[1]);  
		s=ob.getStudents();
		n=s.length;
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		int ind=2;
		ob.removeToIndex(ind);
		s=ob.getStudents();
		n=s.length;
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		ob.removeToElement(s[1]);  
		s=ob.getStudents();
		n=s.length;
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		ob.bubbleSort();
		s=ob.getStudents();
		for(int i=0;i<n;i++){
			  System.out.println(s[i].getId()+" "+s[i].getFullName()+" "+s[i].getBirthDate()+" "+s[i].getAvgMark());
		}
		Student[] stmp=ob.getByBirthDate(s[2].getBirthDate());
		for(int i=0;i<stmp.length;i++){
			  System.out.println(stmp[i].getId()+" "+stmp[i].getFullName()+" "+stmp[i].getBirthDate()+" "+stmp[i].getAvgMark());
		}
		
		Student[] stmp=ob.getBetweenBirthDates(s[0].getBirthDate(),s[2].getBirthDate());
		for(int i=0;i<stmp.length;i++){
			  System.out.println(stmp[i].getId()+" "+stmp[i].getFullName()+" "+stmp[i].getBirthDate()+" "+stmp[i].getAvgMark());
		}*/
	}
	
	public static Student[] createNewArray(Student[] oldArray){
		Student[] newArray = new Student[oldArray.length+1];
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
	

}
