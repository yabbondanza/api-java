package estudos.yasmim.apijava.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Alunos {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String dataNascimento;
}
