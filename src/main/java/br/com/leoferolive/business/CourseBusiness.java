package br.com.leoferolive.business;

import java.util.ArrayList;
import java.util.List;

import br.com.leoferolive.service.CourseService;

public class CourseBusiness {
	
	private CourseService service;

	public CourseBusiness(CourseService service) {
		this.service = service;
	}
	
	public List<String> retriveCoursesRelatedToSpring(String student){
		var filteredCourses = new ArrayList<String>();
		if("Foo Bar".equals(student)) {
			return filteredCourses;
		}
		var allCourses = service.retriveCurses(student);
		
		for (String course : allCourses) {
			if (course.contains("Spring")) {
				filteredCourses.add(course);
			}
		}
		return filteredCourses;
	}
	
}
