package com.aplication.inventorysystem.utils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    public static Map<String, Object> buildEmptyMap() {
        return new HashMap<>();
    }

    public static Map<String, Object> buildMap(@NotBlank String key, @NotNull Object object) {
        Map<String, Object> map = buildEmptyMap();
        map.put(key, object);

        return map;
    }
}
