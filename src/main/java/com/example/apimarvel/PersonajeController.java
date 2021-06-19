package com.example.apimarvel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PersonajeController {

    //JSON beautiful https://jsonformatter.curiousconcept.com/

    @GetMapping
    public String verAlgo(){
        RestTemplate apiMarvel = new RestTemplate();

        String apiKeyPublica ="de729d544b2934715e21b14bb57015e8";
        String apiKeyPrivada = "";
        String ts ="1624114662";
        String todo="";
        String hashMD5 ="4886c7bffab4c02f79d59a994c7a4f01";  //el hash es de la variable de ts+apiKeyPrivada+apiKeyPublica

        String urlAPI ="https://gateway.marvel.com:443/v1/public/characters?apikey=" + apiKeyPublica+"&ts="+ts+"&hash="+hashMD5;

        String algo = apiMarvel.getForObject(urlAPI, String.class);

        return algo;
    }
}
