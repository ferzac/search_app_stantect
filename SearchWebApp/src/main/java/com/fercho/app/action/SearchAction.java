package com.fercho.app.action;

import com.fercho.app.solr.SolrManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jorge
 * @version 1.0.0
 * Struts Action class
 */
public class SearchAction extends ActionSupport 
{
	private static final long serialVersionUID = -8160414590517326217L;
	
	private String item;
	private String results;
	
	/**
	 * Search into the collection for any patter similar to the input
	 * @return String with the transaction result Success or Error
	 */
	public String search()
	{
		try {
			SolrManager manager = new SolrManager();
			setResults(manager.searchData(getItem()));
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			addActionError("Unexpected Error happen Plese try again");
			return "error";
		}
		
	}
	/**
	 * Load fake data into Solr collection 
	 * @return String with the transaction result Success or Error
	 */
	public String loadData()
	{
		try {
			SolrManager manager = new SolrManager();
			setResults(manager.createData());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			addActionError("Unexpected Error happen Plese try again");
			return "error";
		}
	}
	
	//Setters and Getters
	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
}
