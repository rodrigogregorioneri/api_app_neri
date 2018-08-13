package api.neri.controller;

import api.neri.entity.Tarefas;
import api.neri.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NeriDev on 12/08/2018.
 */

@RestController
@RequestMapping("/api")
public class ControllerTarefas {

    @Autowired
    TarefasService service;

    @PostMapping("/tarefas")
    public Tarefas salvarTarefas(@RequestBody Tarefas tarefa){
        return service.salvar(tarefa);
    }
}
