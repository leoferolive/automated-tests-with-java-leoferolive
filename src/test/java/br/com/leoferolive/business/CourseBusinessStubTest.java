package br.com.leoferolive.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.leoferolive.service.CourseService;
import br.com.leoferolive.service.stubs.CourseServiceStub;

class CourseBusinessStubTest {

	
	@Test
	void testCourseRelatedToSpring_When_UsingAsStub() {
		//Given
		CourseService stubService = new CourseServiceStub();
		CourseBusiness courseBusiness = new CourseBusiness(stubService);
		//When
		var filteredCourses = courseBusiness.retriveCoursesRelatedToSpring("Leonardo");
		//Then
		Assertions.assertEquals(4, filteredCourses.size());
	}
	@Test

	void testCourseRelatedToSpring_When_UsingFooBarStudent() {
		//Given
		CourseService stubService = new CourseServiceStub();
		CourseBusiness courseBusiness = new CourseBusiness(stubService);
		
		//When
		var filteredCourses = courseBusiness.retriveCoursesRelatedToSpring("Foo Bar");
		
		//Then
		Assertions.assertEquals(0, filteredCourses.size());
	}
	
}
