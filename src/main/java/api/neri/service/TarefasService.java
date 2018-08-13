package api.neri.service;

import api.neri.entity.Tarefas;
import api.neri.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by NeriDev on 12/08/2018.
 */
@Service
public class TarefasService {

    @Autowired
    TarefasRepository repository;

    public Tarefas salvar(Tarefas tarefas){
      return repository.save(tarefas);
    }
}
