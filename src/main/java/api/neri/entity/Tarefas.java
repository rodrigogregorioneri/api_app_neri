package api.neri.entity;

import javax.persistence.*;

/**
 * Created by NeriDev on 12/08/2018.
 */
@Entity
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome_tarefa;

    @Column
    private String descricao_tarefa;

    @Column
    private String tipo_tarefa;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    public String getDescricao_tarefa() {
        return descricao_tarefa;
    }

    public void setDescricao_tarefa(String descricao_tarefa) {
        this.descricao_tarefa = descricao_tarefa;
    }

    public String getTipo_tarefa() {
        return tipo_tarefa;
    }

    public void setTipo_tarefa(String tipo_tarefa) {
        this.tipo_tarefa = tipo_tarefa;
    }
}
