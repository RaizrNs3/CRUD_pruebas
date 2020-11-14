package com.pruebas.crud_prueba.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/api/bdm/crud")
public class CRUDService {
    static final Logger log = LoggerFactory.getLogger(CRUDService.class);

    @GetMapping("/saludar")
    public void saludar(){
        log.info("Hola si funciono.");
    }

}
