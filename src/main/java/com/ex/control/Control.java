package com.ex.control;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.classes.Ev;
import com.ex.classes.Vnf;
import com.exception.model.Source;
@RestController
public class Control {
private static Map<String, Source> d = new HashMap<>();
static {
Source a = new Source();
a.setId("1");
a.setName("bhavya");
d.put(a.getId(), a);
Source b = new Source();
b.setId("2");
b.setName("sri");
d.put(b.getId(), b);
}
@PostMapping("/upload")
public ResponseEntity<Object> addUser(@Valid @RequestBody Source data,
BindingResult result) {
if (result.hasErrors()) throw new Ev();
else {
d.put(data.getId(), data);}
return ResponseEntity.ok("Uploaded");
}
@GetMapping("getdetails")
public Map<String, Source> getdetails(){
return d;
}
@PutMapping("show/{id}")
public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,
@RequestBody Source data) {
if(!d.containsKey(id))throw new Vnf();
d.remove(id);
d.put(id, data);
return new ResponseEntity<>("data is updated", HttpStatus.OK);
}

}