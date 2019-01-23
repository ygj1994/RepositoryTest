package com.example.demo.mapper;

import java.util.List;
import com.example.demo.model.ResourceDir;
/**
 * ResourceDirMapper
 * 
 * 
 */
public interface ResourceDirMapper {

   public List<ResourceDir> getAll();
    
   public ResourceDir getOne(int id);

   public void insert(ResourceDir resourcedir);

   public void update(ResourceDir resourcedir);

   public void delete(int id);

}