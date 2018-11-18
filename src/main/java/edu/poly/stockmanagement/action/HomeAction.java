  package edu.poly.stockmanagement.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import edu.poly.stockmanagement.configuration.Page;

@Result(name = "indexPage", location = Page.INDEX_PAGE)
public class HomeAction {

	@Action("/")
	public String goHomePage() {
		return "indexPage";
	}
	
}
