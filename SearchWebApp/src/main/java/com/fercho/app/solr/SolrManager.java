package com.fercho.app.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import com.fercho.app.bean.DataBean;
import com.fercho.app.tools.FakeData;

/**
 * @author ferzac
 * @version 1.0.0
 * Class to handler/Manager the communication with Sorl server.
 * create core:
 *  $>bin/solr start 
 *  $>bin/solr create -c 'tecdictionary'
 */
public class SolrManager 
{
	private final String sorlUtl = "http://localhost:8983/solr/tecdictionary";
	
	public String searchData (String value) throws IOException, SolrServerException
	{
		HttpSolrClient solr = new HttpSolrClient.Builder(sorlUtl).build();
		SolrQuery query = new SolrQuery();
		String rows = "";
		
		query.set("q", value);
		QueryResponse response = solr.query(query);
		 
		SolrDocumentList docList = response.getResults();
		if (docList.getNumFound() == 0)
		{
			rows = "No records found";
		}else{
			for (SolrDocument doc : docList) 
			{
				rows += doc.getFieldValue("id") + "\n" +
						doc.getFieldValue("name") + "\n" +
						doc.getFieldValue("email") + "\n" +
						doc.getFieldValue("address") + "\n" +
						doc.getFieldValue("phone") + "\n" +
						"============= \n";
			}
			rows = rows.replace("]", "");
			rows = rows.replace("[", "");
		}
		
		return rows;
	}
	
	/**
	 * Create Fake Data for the fields: Id, name, email, address and phone number
	 * @return
	 * @throws IOException
	 * @throws SolrServerException
	 */
	public String createData() throws IOException, SolrServerException
	{
		HttpSolrClient solr = new HttpSolrClient.Builder(sorlUtl).build();
		FakeData d = new FakeData();
		int i;
		
		for (i = 0; i < 900; i++) {	
			solr.addBean(new DataBean(d.id(), d.name(), d.email(), d.address(), d.phone()));
			solr.commit();
		}
		return "Records loaded " + i; 
	}
}
