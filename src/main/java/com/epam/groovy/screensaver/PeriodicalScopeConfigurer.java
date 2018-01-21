package com.epam.groovy.screensaver;

import com.sun.jmx.snmp.Timestamp;
import javafx.util.Pair;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class PeriodicalScopeConfigurer implements Scope {
    Map<String, Pair<Timestamp, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Timestamp timestamp = new Timestamp();
        if (map.containsKey(name)) {
            Pair<Timestamp, Object> pair = map.get(name);
            Timestamp objectTimestamp = pair.getKey();
            long diff = timestamp.getDateTime() - objectTimestamp.getDateTime();
            if ((diff) > 3000) {
                map.put(name, new Pair<>(new Timestamp(), objectFactory.getObject()));
            }
        } else {
            map.put(name, new Pair<>(new Timestamp(), objectFactory.getObject()));
        }

        return map.get(name).getValue();
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String name) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
