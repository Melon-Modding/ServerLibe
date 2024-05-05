package org.useless.serverlibe.config.adapters;

import java.util.Map;

public interface YamlAdapter<T> {
	Map<String, Object> serialize(T object);
	T deserialize(Map<String, Object> data);
}
