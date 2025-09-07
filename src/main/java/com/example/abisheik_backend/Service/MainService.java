package com.example.abisheik_backend.Service;

import com.example.abisheik_backend.Model.MainModel;
import com.example.abisheik_backend.Repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    public MainRepository mainRepository;

    public MainModel postData(MainModel model){
        return mainRepository.save(model);
    }
public List<MainModel> getAllForm()
{
    return mainRepository.findAll();
}
}
