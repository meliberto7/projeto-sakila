
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Filmes;


public class FilmesDAO {
    
    public List<Filmes> listar() {
        
        List<Filmes> list = new ArrayList();

        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM film");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Filmes filme = new Filmes();
                filme.setAno(rs.getInt("release_year"));
                filme.setDescricao(rs.getString("description"));
                filme.setId_filme(rs.getInt("film_id"));
                filme.setTitulo(rs.getString("title"));
                
                list.add(filme);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
           e.printStackTrace();
        }
        
        return list;
    }
    
    public void cadastrar(Filmes filme) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO film(title,description,release_year) VALUES(?,?,?)");
            
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getDescricao());
            stmt.setInt(3, filme.getAno());
            
            System.out.println("Teste");
            
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public Filmes selecionarFilmes(int id) {
        
        Filmes filme = new Filmes();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("select * from film where film_id = ?");
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                filme.setAno(rs.getInt("release_year"));
                filme.setTitulo(rs.getString("title"));
                filme.setDescricao(rs.getString("description"));
                filme.setId_filme(rs.getInt("film_id"));
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return filme;
    }
    
    public boolean atualizarFilme(Filmes filme) {
        
        boolean very = false;
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("update film set title = ?, description = ?, release_year = ? where film_id = ?");
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getDescricao());
            stmt.setInt(3, filme.getAno());
            stmt.setInt(4, filme.getId_filme());
            
            System.out.println(filme.getTitulo());
            System.out.println(filme.getId_filme());
            System.out.println("zé");
            
            stmt.executeUpdate();
            
            very = true;
            
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return very;
    }
    
}
