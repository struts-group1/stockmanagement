package edu.poly.stockmanagement.configuration;

/**
 * Lớp này lưu trữ đường dẫn các trang jsp.
 * 
 * @author Manh Nguyen
 *
 */
public interface Page {

	String INDEX_PAGE = "/WEB-INF/pages/index.jsp";

	String LOGIN_PAGE = "/WEB-INF/pages/login.jsp";

	// Mậu - Producer
	String PRODUCER_INDEX_PAGE = "/WEB-INF/pages/producer/producer_index.jsp";
	String PRODUCER_FORM_PAGE = "/WEB-INF/pages/producer/producer_form.jsp";
}
