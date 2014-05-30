package edu.neumont.diyauto;

import java.util.ArrayList;

public interface DbContext {
	public Result getFirstResult(String keyword);
	public void addResult(String keyword, Result r);
	public void deleteResult(String keyword, String text);
	public ArrayList<Result> getAllResults(String keyword);
	public ArrayList<String> getMapKeys();
}
