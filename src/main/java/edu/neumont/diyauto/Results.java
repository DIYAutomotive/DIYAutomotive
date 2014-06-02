package edu.neumont.diyauto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Results implements DbContext {
	// map with keyword to a list of potential problems
	private HashMap<String, ArrayList<Result>> results;
	
	public Results(){
		results = new HashMap<String, ArrayList<Result>>();
	}

	@Override
	public Result getFirstResult(String keyword) {
		Result r = null;
		
		if(results.containsKey(keyword)){
			r = results.get(keyword).get(0);
		}
		
		return r;
	}

	@Override
	public void addResult(String key, Result r) {
		if(results.containsKey(key) && results.get(key) != null){
			results.get(key).add(r);
		}
		else{
			ArrayList<Result> list = new ArrayList<Result>();
			list.add(r);
			results.put(key, list);
		}
	}

	@Override
	public void deleteResult(String key, String text) {
		if(results.get(key) != null){
			for(int i = 0; i < results.get(key).size(); i++){
				if(results.get(key).get(i).getSolution().contains(text)){
					results.get(key).remove(i);
				}
			}
		}
	}

	@Override
	public ArrayList<Result> getAllResults(String key) {
		ArrayList<Result> list = new ArrayList<Result>();
		
		if(results.get(key) != null){
			list = results.get(key);
		}
		
		return list;
	}

	@Override
	public ArrayList<String> getMapKeys() {
		ArrayList<String> keys = new ArrayList<String>(results.keySet());
		
		return keys;
	}
	
}
