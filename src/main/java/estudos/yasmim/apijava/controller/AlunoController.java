package estudos.yasmim.apijava.controller;

import estudos.yasmim.apijava.domain.Alunos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("alunos")
@Log4j2
@RequiredArgsConstructor
public class AlunoController {

    @GetMapping(path = "list")
    public List<Alunos> list(){
        return List.of(new Alunos("João"), new Alunos("Maria"));
    }
}
