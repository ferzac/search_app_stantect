package com.fercho.app.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fercho.app.solr.SolrManager;
import org.apache.solr.common.SolrDocument;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jorge
 * @version 1.0.0
 * Struts Action class
 */
public class SearchAction extends ActionSupport implements ServletRequestAware, ServletResponseAware 
{
	private HttpServletRequest  request;
	private HttpServletResponse  response;
	
	private String item;
	private String results;
	
	public String search()
	{
		try {
			SolrManager manager = new SolrManager();
			setResults(manager.searchData(getItem()));
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	
	public String loadData()
	{
		try {
			SolrManager manager = new SolrManager();
			setResults(manager.createData());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
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
	
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}
}
