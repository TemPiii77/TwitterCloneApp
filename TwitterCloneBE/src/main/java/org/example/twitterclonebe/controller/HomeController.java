package org.example.twitterclonebe.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.twitterclonebe.domain.Usr;
import org.example.twitterclonebe.dto.UsrDto;
import org.example.twitterclonebe.repository.UsrRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UsrRepository usrRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UsrRepository userRepository;
    @Autowired
    ObjectMapper objectMapper;


    @RequestMapping("/")
    public UsrDto home(){

        Usr user = userRepository.test();
        return modelMapper.map(user, UsrDto.class);

    }

}
