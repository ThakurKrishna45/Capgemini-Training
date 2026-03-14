package com.capgi.controller;

import com.capgi.entity.Panda;
import com.capgi.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/panda")
@RequiredArgsConstructor
public class PandaController {
private final PandaService pandaService;


    @PostMapping("/save")
    public String savePanda(@RequestBody Panda panda){
        pandaService.save(panda);
        return "Panda saved in DB!!!";
    }

}
