package hrms.kaynakyonetimi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.kaynakyonetimi.business.abstracts.PositionService;
import hrms.kaynakyonetimi.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")
public class PositionController {
	
	private PositionService positionService;

	@Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public List<Position> gelAll(){
		return this.positionService.getAll();
	}

}
