package com.example.convertarray.controllers;

import com.example.convertarray.dtos.ArrayConversionDTO;
import com.example.convertarray.services.ArrayConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ArrayController {

    private static final String CONVERT_ARRAY = "api/convert/array/flatten";

    private ArrayConverterService arrayConverterService;

    @Autowired
    public ArrayController(ArrayConverterService arrayConverterService) {
        this.arrayConverterService = arrayConverterService;
    }

    @GetMapping(CONVERT_ARRAY)
    public ArrayConversionDTO flattenArray(@RequestBody ArrayConversionDTO arrayConversionDTO) {
        return arrayConverterService.flattenArray(arrayConversionDTO);
    }
}

