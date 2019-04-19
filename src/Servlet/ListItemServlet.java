package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ItemDao;
import model.ItemVo;

/**
 * Servlet implementation class ListItemServlet
 */
@WebServlet("/ListItemServlet")
public class ListItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemDao itemdao = new ItemDao();
		try {
			ArrayList<ItemVo> itemList = itemdao.selectAllItem();



			HttpSession session = req.getSession(true);
			session.setAttribute("itemList", itemList);
			//ServletContextオブジェクトを取得
		    ServletContext sc = this.getServletContext();
			//RequestDispatcherオブジェクトを取得
			RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/list.jsp");
			/
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
