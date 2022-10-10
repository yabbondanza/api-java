package estudos.yasmim.apijava.service;

import estudos.yasmim.apijava.domain.Alunos;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AlunoService {
    private static List<Alunos> aluno;

    static {
        aluno = new ArrayList<>(List.of(new Alunos(1L, "João",
                "123.456.789-10", "joao@gmail.com", "12/05/2001")));
    }

    public List<Alunos> listAll() {
        return aluno;
    }

    public Alunos findByid(long id) {
        return aluno.stream()
                .filter(alunos -> alunos.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Aluno não encontrado"));
    }

    public Alunos save(Alunos alunos) {
        alunos.setId(ThreadLocalRandom.current().nextLong(3, 10000));
        aluno.add(alunos);
        return alunos;
    }

    public void delete(long id) {
        aluno.remove(findByid(id));
    }

    public void replace(Alunos alunos) {
        delete(alunos.getId());
        aluno.add(alunos);
    }
}
