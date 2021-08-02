package com.example.convertarray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.example.convertarray.dtos.ArrayConversionDTO;
import com.example.convertarray.services.ArrayConverterService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverterServiceTest {

    @InjectMocks
    private ArrayConverterService underTest;

    @Test
    public void flattenArrayShouldReturnCorrectAnswer() {
        // GIVEN
        Object[] array = {1, 2, new ArrayList<>(Arrays.asList(3,4, new ArrayList<>(Arrays.asList(5, 6, 7)), 8)), 9, 10};
        ArrayConversionDTO arrayConversionDTO = new ArrayConversionDTO(array);
        Object[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // WHEN
        MockitoAnnotations.openMocks(this);
        ArrayConversionDTO result = underTest.flattenArray(arrayConversionDTO);

        // THEN
        assertArrayEquals(expected, result.getArray());
    }
}
