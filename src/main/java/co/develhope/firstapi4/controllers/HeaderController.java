package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getHost(@RequestHeader (name = "Host") String host){
        return host;
    }

}