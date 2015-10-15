package au.com.shadeven.development.builder;

import au.com.shadeven.development.model.SantasEvent;

import java.util.Map;

/**
 * Created by Steven on 15/10/2015.
 */
public interface EventBuilder<T> {

  SantasEvent build(T data, String name);
}
