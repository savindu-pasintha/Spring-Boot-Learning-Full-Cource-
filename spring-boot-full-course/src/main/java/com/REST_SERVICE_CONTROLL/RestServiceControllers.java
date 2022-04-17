package com.savindupasintha.springbootserverapp.RestService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestServiceControllers {

    @GetMapping(value = "/selectors")
    public Map<String, String> selectors(String data) {
        //http://localhost:8080/api/selectors
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(i + "manufactures", i + "savindu");
        }
        return map;
    }

    @GetMapping(value = "/users")
    public ArrayList<Map> users(String data) {
        //[{}.{}] http://localhost:8080/api/users
        ArrayList<Map> list = new ArrayList<Map>();
        for (int i = 0; i < 20; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("id",String.valueOf(i));
            map.put("name","name");
            map.put("selector","selector");
            map.put("agree","true");
            list.add(map);
        }
        return list;
    }

    @PostMapping(value = "/create/{name}/{selector}/{agree}")
    public Map<String, String> create(@PathVariable("name") String name,@PathVariable("selector") String selector,@PathVariable("agree") String agree){
        //http://localhost:8080/api/create/name/slector/true
        HashMap<String, String> map = new HashMap<>();
        boolean status = true;
        if(!name.isBlank() && !agree.isBlank() && !selector.isBlank()) {
            map.put("status", "true");
            map.put("message", "create successful");
            map.put("name", name);

        }else{
            map.put("status", "false");
            map.put("message", "create fail !");
            map.put("name", name);

        }
        return map;
    }

    @DeleteMapping(value = "/delete/{id}/{name}")
    public Map<String, String> delete(@PathVariable("id") String id,@PathVariable("name") String name) {
        //http://localhost:8080/api/10/name
        HashMap<String, String> map = new HashMap<>();
        boolean status = true;
        if (!id.isEmpty() && !id.isBlank() && !name.isEmpty()) {
            map.put("status", "true");
            map.put("message", "delete successful");
            map.put("id", id);
            map.put("name", name);

        } else {
            map.put("status", "false");
            map.put("message", "delete fail !");
            map.put("id", id);
            map.put("name", name);

        }
        return map;
    }

    @PutMapping(value = "/update/{id}/{name}/{selector}/{agree}")
    public Map<String, String> update(@PathVariable("id") String id,@PathVariable("name") String name,@PathVariable("selector") String selector,@PathVariable("agree") String agree){
    //http://localhost:8080/api/update/10/name/slector/true
        HashMap<String, String> map = new HashMap<>();
    boolean status = true;
        if(!id.isEmpty() && !id.isBlank() && !name.isBlank() && !agree.isBlank() && !selector.isBlank()) {
        map.put("status", "true");
        map.put("message", "update successful");
        map.put("id", id);
    }else{
        map.put("status", "false");
        map.put("message", "update fail !");
        map.put("id", id);
    }
        return map;
}

}

//@CrossOrigin(origins = "http://localhost:8080")

