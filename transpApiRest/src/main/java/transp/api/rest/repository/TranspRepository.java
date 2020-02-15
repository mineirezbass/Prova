package transp.api.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import transp.api.rest.model.dadosTransportadoraView;

@Repository
public interface TranspRepository extends CrudRepository<dadosTransportadoraView, Integer>{

	

	
}
