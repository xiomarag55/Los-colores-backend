package com.aplication.inventorysystem.controller;

import com.aplication.inventorysystem.enums.StatusEnum;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class HandleResponse {

    public static ResponseEntity<Object> buildProductResponse(Map<String, Object> body){
        body.put("status", StatusEnum.OK);
        return ResponseEntity.ok(body);
    }

    public static ResponseEntity<Object> buildProductErrorResponse(Map<String, Object> body){
        body.put("status", StatusEnum.ERROR);
        return ResponseEntity.ok(body);
    }

}
