
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Filmes;
import model.dao.FilmesDAO;


@WebServlet(name = "SakilaController", urlPatterns = {"/SakilaController", "/sakila", "/listarFilmes", "/cadastrarFilme", "/editar"})
public class SakilaController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
            case "/sakila":
                home(request, response);
                break;
             
            case "/listarFilmes":
                listarFilmes(request, response);
                break;
                
            case "/cadastrarFilme":
                cadastrarFilme(request, response);
                break;
                
            case "/editar":
                editar(request, response);
                break;
                
            default:
                System.out.println("Erro ao localizar página");
                break;
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
            
            case "/cadastrarFilme":
                
                Filmes filme = new Filmes();
                FilmesDAO dao = new FilmesDAO();
                
                filme.setTitulo(request.getParameter("titulo"));
                filme.setDescricao(request.getParameter("descricao"));
                filme.setAno(Integer.parseInt(request.getParameter("ano")));
                
                dao.cadastrar(filme);
                
                response.sendRedirect("listarFilmes"); 
                
                break;
            
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    private void home(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            
            request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    private void listarFilmes(HttpServletRequest request, HttpServletResponse response) {
        
        List<Filmes> list = new ArrayList();
            FilmesDAO dao = new FilmesDAO();
            
            try{
                
                list = dao.listar();
            
                request.setAttribute("filmes", list);
            
                request.getRequestDispatcher("WEB-INF/jsp/listarFilmes.jsp").forward(request, response);
                
            }catch(Exception e){
                e.printStackTrace();
            }
 
    }
    
    private void cadastrarFilme(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            
            request.getRequestDispatcher("WEB-INF/jsp/cadastrarFilme.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
 
    }
    private void editar(HttpServletRequest request, HttpServletResponse response) {
        
        try{
           
            Filmes filme = new Filmes();
            
            int id_filme = Integer.parseInt(request.getParameter("filme"));
            
            FilmesDAO dao = new FilmesDAO();
            
            filme = dao.selecionarFilmes(id_filme);
            
            dao.atualizarFilme(filme);
            
            request.getRequestDispatcher("WEB-INF/jsp/editar.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
 
    }

}
