package estudos.yasmim.apijava.controller;

import estudos.yasmim.apijava.domain.Alunos;
import estudos.yasmim.apijava.service.AlunoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
@Log4j2
@RequiredArgsConstructor
public class AlunoController {
    private final AlunoService alunoService;
    @GetMapping
    public ResponseEntity<List<Alunos>> list(){
        return new ResponseEntity<>(alunoService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Alunos> findById(@PathVariable long id){
        return new ResponseEntity<>(alunoService.findByid(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Alunos> save(@RequestBody Alunos alunos){
        return ResponseEntity.ok(alunoService.save(alunos));
    }
}
