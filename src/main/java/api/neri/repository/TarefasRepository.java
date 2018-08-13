package api.neri.repository;

import api.neri.entity.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by NeriDev on 12/08/2018.
 */
@Repository
public interface TarefasRepository extends CrudRepository<Tarefas, Long> {
}
