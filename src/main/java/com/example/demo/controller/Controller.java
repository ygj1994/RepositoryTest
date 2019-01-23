package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.ResourceDirMapper;
import com.example.demo.mapper.ResourceinfoMapper;
import com.example.demo.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Controller{
   @Autowired
   ResourceDirMapper resourceDirMapper;
  
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String dirIndex() {
        return "测试spring boot配置正确";
    }

    @RequestMapping(value="/resourceDir/getAll")
    public List<ResourceDir> dirGetAll(){
        
        List<ResourceDir> dirs=resourceDirMapper.getAll();
        return dirs;
    }
   
    @RequestMapping(value="/resourceDir/getOne",method=RequestMethod.GET)
    public ResourceDir dirGetOne(@RequestParam(value="id") int id){
        
        ResourceDir dir=resourceDirMapper.getOne(id);
        return dir;
        
    }
   
    @RequestMapping(value="/resourceDir/insert",method=RequestMethod.POST)
    public int Insert(@RequestBody ResourceDir resourcedir){
        
        resourceDirMapper.insert(resourcedir);
        if(resourceDirMapper.getOne(resourcedir.getResDir())!=null){
            return 1 ;
        }
        return 0;
    }
   
    @RequestMapping(value="/resourceDir/update", method=RequestMethod.POST)
    public int dirUpdate(@RequestBody ResourceDir resourcedir){
       resourceDirMapper.update(resourcedir);
        return 1;
    }
    
    @RequestMapping(value="/resourceDir/delete", method=RequestMethod.DELETE)
    public int dirDelete(@RequestParam Integer id) {
        resourceDirMapper.delete(id);
        
        return 1;
    }
    
//----------分界线1--上面为目录的增删改查-------------
    @Autowired
    ResourceinfoMapper resourceInfoMapper;
    @RequestMapping(value="resourceInfo/getAll")
    public List<Resourceinfo> infoGetAll(){
        List<Resourceinfo> resourceinfos=resourceInfoMapper.getAll();
        return resourceinfos;
    }
    
    @RequestMapping(value="resourceInfo/getOne", method=RequestMethod.GET)
    public Resourceinfo infoGetOne(@RequestParam int id ) {
        Resourceinfo resourceinfo= resourceInfoMapper.selectByPrimaryKey(id);
        return resourceinfo;
    }
    @RequestMapping(value="resourceInfo/insert", method=RequestMethod.POST)
    public int resourceInfoInsert(@RequestBody Resourceinfo resourceinfo) {
        if(resourceInfoMapper.selectByPrimaryKey(resourceinfo.getResId())==null){
            resourceInfoMapper.insert(resourceinfo);
            return 1;
        }
        return 0;
    }
    
    @RequestMapping(value="resourceInfo", method=RequestMethod.POST)
    public  int infoUpdate(@RequestBody Resourceinfo resourceinfo){
        resourceInfoMapper.updateByPrimaryKey(resourceinfo);
        return 1;
    }
    
    
    
}