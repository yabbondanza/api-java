package estudos.yasmim.apijava.service;

import estudos.yasmim.apijava.domain.Alunos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    public List<Alunos> listAll(){
        return List.of(new Alunos(1L, "João"), new Alunos(2L, "Maria"));
    }
}
