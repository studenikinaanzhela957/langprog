import java.util.List;
import java.util.ArrayList;
class Kurs {
	static List<String> replan (List <String> plan, String newChapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		plan.add(newChaptIndex, newChapt);
		return plan;
	}
}
