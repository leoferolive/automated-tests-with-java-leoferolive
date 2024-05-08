package br.com.leoferolive.business;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturn10() {
		// Given
		List<?> list = mock(List.class);

		// When
		when(list.size()).thenReturn(10);
		int sizeList = list.size();

		// Then
		Assertions.assertEquals(10, sizeList);
	}

	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues() {
		// Given
		List<?> list = mock(List.class);

		// When
		when(list.size()).thenReturn(10).thenReturn(20).thenReturn(30);

		// Then
		Assertions.assertEquals(10, list.size());
		Assertions.assertEquals(20, list.size());
		Assertions.assertEquals(30, list.size());
	}

	@Test
	void testMockingList_When_GetIsCalled_ShouldReturnLeonardo() {
		// Given
		var list = mock(List.class);

		// When
		when(list.get(0)).thenReturn("Leonardo");

		// Then
		Assertions.assertEquals("Leonardo", list.get(0));
		Assertions.assertNull(list.get(1));
	}

	@Test
	void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnLeonardo() {
		// Given
		var list = mock(List.class);

		when(list.get(anyInt())).thenReturn("Leonardo");

		// Then & When
		Assertions.assertEquals("Leonardo", list.get(anyInt()));
		Assertions.assertEquals("Leonardo", list.get(anyInt()));
	}

	@Test
	void testMockingList_When_ThrowsAnException() {
		// Given
		var list = mock(List.class);

		when(list.get(anyInt())).thenThrow(new RuntimeException("Error"));

		// Then
		Assertions.assertThrows(RuntimeException.class, 
				() -> {
					// When
					list.get(anyInt());
				}, () -> "Should have throw an RuntimeException");
	}
}
