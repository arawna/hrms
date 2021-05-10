package hrms.kaynakyonetimi.business.abstracts;

import java.util.List;

import hrms.kaynakyonetimi.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}
