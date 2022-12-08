package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javabeans.SanPham;
import models.Loai;
import models.LoaiBL;
import models.QuangCao;
import models.QuangCaoBL;
import models.SanPhamBL;
import models.ThuongHieu;
import models.ThuongHieuBL;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class GioHangServlet
 */
public class GioHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("views/gio-hang-content.jsp").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
}
