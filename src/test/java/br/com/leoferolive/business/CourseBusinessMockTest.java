package br.com.leoferolive.business;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.leoferolive.service.CourseService;

class CourseBusinessMockTest {

	CourseService mockService;
	CourseBusiness courseBusiness;
	List<String> courses;

	@BeforeEach
	void setup() {
		// Given
		mockService = mock(CourseService.class);
		courseBusiness = new CourseBusiness(mockService);
		
		courses = Arrays.asList(
				"REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
                );
	}

	@Test
	void testCourseRelatedToSpring_When_UsingAMock() {
		// given
		when(mockService.retriveCurses("Leonardo"))
				.thenReturn(courses);
		// When
		var filteredCourses = courseBusiness.retriveCoursesRelatedToSpring("Leonardo");
		// Then
		Assertions.assertEquals(4, filteredCourses.size());
	}

}
