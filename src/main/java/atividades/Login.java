package atividades;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Autenticacao", value = "/Autenticacao")
public class Login extends HttpServlet {
	Servico servicos= new Servico();
	User usuario = new User();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  HttpSession sessao = request.getSession();
		  String specified = (String) sessao.getAttribute("specified");
		  
		  if(specified==null) {
			  
			  if(servicos.validar(usuario)) {
				  
				  sessao.setAttribute("specified", specified);
				  
				  request.setAttribute("nome", usuario.getNome());
				  RequestDispatcher dis=getServletContext().getRequestDispatcher("/WEB-INF/Restrito.sjp");
				  dis.forward(request, response);
			  }else {
				  RequestDispatcher dis=getServletContext().getRequestDispatcher("/logout");
				  dis.forward(request, response);
			  }
		  }else {
			  RequestDispatcher dis=getServletContext().getRequestDispatcher("/logout");
			  dis.forward(request, response);
			  
			  
		  }
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 HttpSession sessao = request.getSession();
		 
		
		
		String user=request.getParameter("user");
		usuario.setNome(user);
		String password=request.getParameter("password");
		usuario.setSenha(password);
		
		if(servicos.validar(usuario)) {
			request.setAttribute("usuario",usuario.getNome());
			
			
			  RequestDispatcher rd= getServletContext().getRequestDispatcher("/WEB-INF/Restrito.jsp");
	            rd.forward(request, response);
		}else {
			RequestDispatcher rd= getServletContext().getRequestDispatcher("login.jsp");
            rd.forward(request, response);
			
		}
		
		
		
		
		

	}

}
