package com.example.convertarray.services;

import com.example.convertarray.dtos.ArrayConversionDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ArrayConverterService {

    public static void main(String[] args) {
    }

    public ArrayConversionDTO flattenArray(ArrayConversionDTO arrayConversionDTO) {

        return new ArrayConversionDTO(convert(Arrays.asList(arrayConversionDTO.getArray())).toArray());
    }

    private Stream convert(List array) {
        return array.stream().flatMap(o -> o instanceof List ? convert((List) o): Stream.of(o));
    }
}
