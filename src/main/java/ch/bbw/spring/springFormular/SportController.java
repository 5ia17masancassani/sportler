package ch.bbw.spring.springFormular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SportController {

	@Autowired
	private SportlerService sportler;

	@GetMapping("/sportler")
	public String sportlerForm(Model model) {
		List<String> detailsAllValues = new ArrayList<>(Arrays.asList("Nothing", "Tennis", "Fussball", "Sonstiges"));
		List<String> successAllValues = new ArrayList<>(
				Arrays.asList("Olympia-Sieger", "Weltmeister", "Europameister", "Schweizermeister"));
		List<String> stateAllValues = new ArrayList<>(Arrays.asList("Profi", "Amateur", "Ehemaliger"));
		model.addAttribute("details", detailsAllValues);
		model.addAttribute("successes", successAllValues);
		model.addAttribute("states", stateAllValues);
		model.addAttribute("listOfSportler", this.sportler.getAllSportler());
		model.addAttribute("sportler", new Sportler());
		return "sportlerlist";
	}

	@PostMapping("/sportler")
	public String addSportler(@ModelAttribute Sportler sportler, Model model) {
		List<String> detailsAllValues = new ArrayList<>(Arrays.asList("Nothing", "Tennis", "Fussball", "Sonstiges"));
		List<String> successAllValues = new ArrayList<>(
				Arrays.asList("Olympia-Sieger", "Weltmeister", "Europameister", "Schweizermeister"));
		List<String> stateAllValues = new ArrayList<>(Arrays.asList("Profi", "Amateur", "Ehemaliger"));
		model.addAttribute("details", detailsAllValues);
		model.addAttribute("successes", successAllValues);
		model.addAttribute("states", stateAllValues);
		this.sportler.addSportler(sportler);
		model.addAttribute("listOfSportler", this.sportler.getAllSportler());
		return "sportlerlist";
	}

	@GetMapping("/deleteSportler")
	public String deleteSportler(Model model) {
		if ((sportler.getAllSportler()) != null && (sportler.getAllSportler().size() > 0)) {
			sportler.getAllSportler().remove(sportler.getAllSportler().size() - 1);
		}
		model.addAttribute("listOfSportler", this.sportler.getAllSportler());
		return "redirect:/sportler";
	}

}
