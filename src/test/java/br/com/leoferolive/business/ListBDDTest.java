package br.com.leoferolive.business;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListBDDTest {

	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturn10() {
		// Given
		List<?> list = mock(List.class);

		// When
		given(list.size()).willReturn(10);
		int sizeList = list.size();

		// Then
		assertThat(sizeList, is(10));
	}

	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues() {
		// Given
		List<?> list = mock(List.class);

		// When
		given(list.size()).willReturn(10).willReturn(20).willReturn(30);

		// Then
		assertThat(list.size(), is(10));
		assertThat(list.size(), is(20));
		assertThat(list.size(), is(30));
	}

	@Test
	void testMockingList_When_GetIsCalled_ShouldReturnLeonardo() {
		// Given
		var list = mock(List.class);

		// When
		given(list.get(0)).willReturn("Leonardo");

		// Then
		assertThat(list.get(0), is("Leonardo"));
		assertThat(list.get(1), is(nullValue()));
	}

	@Test
	void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnLeonardo() {
		// Given
		var list = mock(List.class);

		given(list.get(anyInt())).willReturn("Leonardo");

		// Then & When
		assertThat(list.get(anyInt()), is("Leonardo"));
		assertThat(list.get(anyInt()), is("Leonardo"));
	}

	@Test
	void testMockingList_When_ThrowsAnException() {
		// Given
		var list = mock(List.class);

		given(list.get(anyInt())).willThrow(new RuntimeException("Error"));

		// Then
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            // When
            list.get(anyInt());
        });
		
        assertThat(exception.getMessage(), is(equalTo("Error")));
        assertThat(RuntimeException.class, is(exception.getClass()));
	}
}
