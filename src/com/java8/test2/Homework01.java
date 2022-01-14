package com.java8.test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DAO<T>{
    Map<String, T> maps;

    public void save(String id, T entity){
         maps.put(id, entity);
    }

    public T get(String id){
        return maps.get(id);
    }

    public void update(String id, T entity){
        maps.put(id, entity);
    }

    public List<T> list(){
        Collection<T> collection = maps.values();
        return (List<T>) collection;
    }

    public void delete(String id){
        maps.remove(id);
    }
}



public class Homework01 {

}
