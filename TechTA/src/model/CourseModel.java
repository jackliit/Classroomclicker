package model;

import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class CourseModel {
	private String coid ="";
	private String name ="";
	private String year ="";
	private String semester ="";
	private List<ClassModel> classes =null;
	
	/**
	 * @param coid
	 * @param name
	 * @param year
	 * @param semester
	 * @param classes
	 */
	public CourseModel(String coid, String name, String year, String semester,
			List<ClassModel> classes) {
		super();
		this.coid = coid;
		this.name = name;
		this.year = year;
		this.semester = semester;
		this.classes = classes;
	}
	
	
	public String getCoid() {
		return coid;
	}
	public void setCoid(String coid) {
		this.coid = coid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public List<ClassModel> getClasses() {
		return classes;
	}
	public void setClasses(List<ClassModel> classes) {
		this.classes = classes;
	}
	
	
	
	
}
