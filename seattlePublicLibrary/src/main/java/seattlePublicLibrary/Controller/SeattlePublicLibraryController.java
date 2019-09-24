package seattlePublicLibrary.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Balvaishwer Singh
 *
 */

@RestController
public class SeattlePublicLibraryController {

	@RequestMapping("/getBooks")
	public String getBooksData() {
		return "Working";
	}
	
	@RequestMapping("/getBooksDetails")
	public String getBooksDetails() {
		return "Getting Book Details";
	}
}
