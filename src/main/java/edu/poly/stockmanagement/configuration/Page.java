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

	// Manh - Goods
	String GOODS_LIST_PAGE = "/WEB-INF/pages/goods/goods_list.jsp";
	String GOODS_FORM_PAGE = "/WEB-INF/pages/goods/goods_form.jsp";

	// Mậu - Producer
	String PRODUCER_INDEX_PAGE = "/WEB-INF/pages/producer/producer_index.jsp";
	String PRODUCER_FORM_PAGE = "/WEB-INF/pages/producer/producer_form.jsp";
}
