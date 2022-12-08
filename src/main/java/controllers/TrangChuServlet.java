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

@WebServlet(urlPatterns = "/home")
public class TrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        
        List<QuangCao> dsqc = QuangCaoBL.docTatCa();
        List<ThuongHieu> dsth = ThuongHieuBL.docTatCa();
        List<javabeans.SanPham> dssp = SanPhamBL.docTatCa();
        List<Loai> dsloai = LoaiBL.docTatCa();
        List<SanPham> dsspm = SanPhamBL.sanPhamMoi(10);
        
        req.setAttribute("dsqc", dsqc);
        req.setAttribute("dsth", dsth);
        req.setAttribute("dssp", dssp);
        req.setAttribute("dsloai", dsloai);
        req.setAttribute("dsspm", dsspm);
        
        req.getRequestDispatcher("views/home.jsp").include(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }

}
