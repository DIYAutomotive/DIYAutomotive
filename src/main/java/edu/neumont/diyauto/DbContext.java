package edu.neumont.diyauto;

import java.util.ArrayList;
import java.util.HashMap;

public interface DbContext
{
	public Result getFirstResult(String keyword);
	public void addResult(String keyword, Result r);
	public void deleteResult(String keyword, String text);
	public ArrayList<Result> getAllResults(String keyword);
	public ArrayList<String> getMapKeys();
	public HashMap<String, ArrayList<Result>> getMap();
}
