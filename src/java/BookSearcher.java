import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

public class BookSearcher {

    private String word = "";
    private String id   = "";
    private List list = null;
    private BookData book = null;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public List getBookList() {
        return list;
    }

    public BookData getBookData() {
        return book;
    }

    public String searchBooks() {
        searchBooks(word);
        return "success";
    }

    private void searchBooks(String word) {
        list = new ArrayList();
        try {
            Class.forName("org.mysqldb.jdbcDriver");
            String url = "jdbc:mysqldb:hsql://localhost";
            Connection con = DriverManager.getConnection(url, "sa", "");

            String selectStatement =
                "select * " +
                "from books where ndc           like ? " +
                              "or tyosya_hyouji like ? " +
                              "or id            like ? " +
                              "or title         like ? " +
                              "or author        like ? " +
                              "or publisher     like ? ";
            PreparedStatement prepStmt =
                con.prepareStatement(selectStatement);
            prepStmt.setString(1, appendPercent(word));
            prepStmt.setString(2, appendPercent(word));
            prepStmt.setString(3, appendPercent(word));
            prepStmt.setString(4, appendPercent(word));
            prepStmt.setString(5, appendPercent(word));
            prepStmt.setString(6, appendPercent(word));

            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                BookData book = new BookData();
                book.setNdc(rs.getString("ndc"));
                book.setTyosya_hyouji(rs.getString("tyosya_hyouji"));
                book.setId(rs.getString("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublisher(rs.getString("publisher"));
                list.add(book);
            }
            prepStmt.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String appendPercent(String from) {
        StringBuffer to = new StringBuffer();
        to.append("%");
        to.append(from);
        to.append("%");

        return new String(to);
    }

}