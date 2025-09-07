package com.example.abisheik_backend.Controller;

import com.example.abisheik_backend.Model.MainModel;
import com.example.abisheik_backend.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/form")
@CrossOrigin("*")
public class MainController {
    @Autowired
    private MainService mainService;
    @PostMapping
    public ResponseEntity postData(@RequestBody MainModel model){
        return new ResponseEntity(mainService.postData(model),HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getAllFormData()
    {
        return new ResponseEntity(mainService.getAllForm(),HttpStatus.OK);
    }
}
