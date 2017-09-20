package mainsurvey;

import java.util.ArrayList;
import java.util.List;

public class compare {
	static List<Integer> listOfAverages = new ArrayList<Integer>();
	public static List<Integer> overallResult(List<List<String>> listOfListOfString) {
		int numOfLists = listOfListOfString.size();
		int numOfQuestions = listOfListOfString.get(0).size();
		for (int i = 0; i < numOfLists; i++) {
			int sumOfResponse = 0;
			for (int j = 0; j < numOfQuestions; j++) {
				sumOfResponse = sumOfResponse + Integer.parseInt(listOfListOfString.get(j).get(i));
			}
			int questionAverage = sumOfResponse / numOfQuestions;
			listOfAverages.add(questionAverage);
		}
		return listOfAverages;
	}
}
