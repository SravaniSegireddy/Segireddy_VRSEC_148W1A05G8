import java.util.Date;
import java.util.Calendar;
import java.time.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */

public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length>0)
			return this.students;
        return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{
		// Add your implementation here
		if(students==null) throw new IllegalArgumentException("");
		int i;
		for(i=0;i<students.length;i++){
			this.students[i]=students[i];
			//System.out.println("heyy");
		}
	}

	
	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=students.length) throw new IllegalArgumentException("");
		else return students[index];
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null || index<0 || index>=students.length) throw new IllegalArgumentException("");
		else students[index]=student;
	}

	@Override
	public void addFirst(Student student)  throws IllegalArgumentException{
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException("");
		students=createNewArray(students,1);
		int len=students.length;
		for(int i=len-1;i>0;i--){
			students[i]=students[i-1];
		}
		students[0]=student;
		
	}

	@Override
	public void addLast(Student student)  throws IllegalArgumentException{
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException("");
		students=createNewArray(students,1);
		int len=students.length;
		students[len-1]=student;
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		if((student==null || index<0) || index>=students.length) 
			throw new IllegalArgumentException("");
		students=createNewArray(students,1);
		int len=students.length;
		for(int i=len-1;i>index;i--){
			students[i]=students[i-1];
		}
		students[index]=student;
	}

	@Override
	public void remove(int index)  throws IllegalArgumentException{
		if(index<0 || index>=students.length) throw new IllegalArgumentException("");
		// Add your implementation here
		for(int i=index;i<students.length-1;i++){
			students[i]=students[i+1];
		}
		students=createNewArray(students,-1);
	}

	@Override
	public void remove(Student student)  throws IllegalArgumentException{
		if(student==null) throw new IllegalArgumentException("");
		int flag=0;
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)){
				this.remove(i);
				flag=1;
			} 
		}
		if(flag==0)   throw new IllegalArgumentException("Student not exist");
		
	}

	@Override
	public void removeFromIndex(int index)  throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=students.length) throw new IllegalArgumentException("");
		int a=students.length-index-1;
		students=createNewArray(students,-1*a);
		
	}

	@Override
	public void removeFromElement(Student student)  throws IllegalArgumentException{
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException("");
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)) this.removeFromIndex(i);
		}
		
	}

	@Override
	public void removeToIndex(int index)  throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=students.length) throw new IllegalArgumentException("");
		int a=index-0;
		int p=0;
		for(int i=index;i<students.length;i++){
			students[p++]=students[i];
		}
		students=createNewArray(students,-1*a);
	}

	@Override
	public void removeToElement(Student student)  throws IllegalArgumentException{
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException("");
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)) this.removeToIndex(i);
		}
	}

	@Override
	public void bubbleSort() {
		Student tmp;
		// Add your implementation here
		for(int i=0;i<students.length;i++){
			
			for(int j=i+1;j<students.length;j++){
				if(students[i].getId()>students[j].getId()){
					tmp=students[i];
					students[i]=students[j];
					students[j]=tmp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date)  throws IllegalArgumentException{
		// Add your implementation here
		if(date==null) throw new IllegalArgumentException("");
		Student s[]=new Student[students.length];
		int p=0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().compareTo(date)==0) 
			s[p++]=students[i];
		}
		int a=students.length-p;
		s=createNewArray(s,-1*a);
		return s;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate)  throws IllegalArgumentException{
		// Add your implementation here
		if(firstDate==null || lastDate==null ) throw new IllegalArgumentException("");
		Student s[]=new Student[students.length];
		int p=0;
		for(int i=0;i<students.length;i++){
			if(!firstDate.after(students[i].getBirthDate()) && !lastDate.before(students[i].getBirthDate())) {
				s[p++]=students[i];
			} 
			
		}
		int a=students.length-p;
		s=createNewArray(s,-1*a);
		return s;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days)  throws IllegalArgumentException{
		// Add your implementation here
		if(date==null) throw new IllegalArgumentException("");
		long ltime=date.getTime()+days*24*60*60*1000;
		Date tmpd=new Date(ltime);
		return getBetweenBirthDates(date,tmpd);
	}

	@Override
	public int getCurrentAgeByDate(int i)  throws IllegalArgumentException{
		
		if(i==0) throw new IllegalArgumentException("");
		
		Calendar dob=Calendar.getInstance();
		dob.setTime(students[i].getBirthDate());
		
		Calendar today = Calendar.getInstance();
        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);
		int age=curYear-dobYear;
		
		return age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Student s[]=new Student[students.length];
		int p=0;
		
		for(int i=0;i<students.length;i++){
			if(this.getCurrentAgeByDate(i)==age)
				s[p++]=students[i];
		}
		int a=students.length-p;
		s=createNewArray(s,-1*a);
		return s;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double sum=0;
		for(int i=0;i<students.length;i++){
			sum+=students[i].getAvgMark();
		}
		Student s[]=new Student[students.length];
		int p=0;
		double avd=sum/students.length;
		for(int i=0;i<students.length;i++){
			if(students[i].getAvgMark()==sum)
				s[p++]=students[i];
		}
		int a=students.length-p;
		s=createNewArray(s,-1*a);
		return s;
	}

	@Override
	public Student getNextStudent(Student student)  throws IllegalArgumentException{
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException("");
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)) return students[i+1];
		}
		return null;
	}
	
	public static Student[] createNewArray(Student[] oldArray,int a){
		Student[] newArray = new Student[oldArray.length+a];
		for(int i = 0; i < Math.min(oldArray.length,newArray.length); i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
}


