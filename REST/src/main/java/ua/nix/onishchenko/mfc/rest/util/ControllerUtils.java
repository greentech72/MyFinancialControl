package ua.nix.onishchenko.mfc.rest.util;

import ua.nix.onishchenko.mfc.rest.entity.UUIDEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ControllerUtils {

    public static Map<String, Object> getMap(String string, Object object) {
        Map<String, Object> map = new HashMap<>();
        map.put(string, object);
        return map;
    }

    public static Map<String, Object> getMap(UUIDEntity entity) {
        return getMap(entity.getId());
    }

    public static Map<String, Object> getMap(UUID id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return map;
    }

}
