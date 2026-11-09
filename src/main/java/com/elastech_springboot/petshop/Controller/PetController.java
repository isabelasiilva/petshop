package com.elastech_springboot.petshop.Controller;

import com.elastech_springboot.petshop.Model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String saudacao(){
        return "Bem-vinda ao Pet Shop Elas Tech!";
    }

    @GetMapping("/horario")
    public String horarioDeFuncionamento(){
        return "Abrimos de segunda a sábado, das 8h às 18h.";
    }

    @GetMapping("/destaque")
    public Pet retornarDadosPet(){
        return new Pet("Thor", "Cachorro", 3);
    }

    @GetMapping("/adotar/{nome}")
    public String adotar(@PathVariable String nome){
        return "Parabéns! Você adotou " + nome +"!";
    }

    @GetMapping("/banho")
    public String darBanho(@RequestParam(defaultValue = "Seu pet") String pet){
        return pet + " está tomando banho!";
    }

    @GetMapping("/novo/{nome}")
    public Pet novoGato(@PathVariable String nome){
        return new Pet(nome, "Gato", 1);
    }

    @GetMapping("/idade-humana")
    public String idadeHumana(@RequestParam int anos){
        int idadeHumana = anos * 7;
        return anos + " anos de pet equivalem a " + idadeHumana + " anos humanos!";
    }

    @GetMapping("/consulta")
    public String consulta(@RequestParam String pet, @RequestParam String vet){
        return pet + " tem consulta com a Dra. " + vet + "!";
    }
}
