package hrms.kaynakyonetimi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.kaynakyonetimi.business.abstracts.PositionService;
import hrms.kaynakyonetimi.dataAccess.abstracts.PositionDao;
import hrms.kaynakyonetimi.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {
	
	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		return positionDao.findAll();
	}
	
	

}
