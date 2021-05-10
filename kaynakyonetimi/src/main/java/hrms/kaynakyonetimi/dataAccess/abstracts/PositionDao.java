package hrms.kaynakyonetimi.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.kaynakyonetimi.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer> {

}
