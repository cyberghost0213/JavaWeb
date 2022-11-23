package org.zerock.jdbcex.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        log.info("todo list....................");

        try {
            List<TodoDTO> dtoList = todoService.listAll();
            req.setAttribute("dtoList", dtoList);                                    // TodoService가 반환하는 데이터를 저장
            req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req, resp);   // RequestDispatcher로 JSP로 전달
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServletException("list error");
        }
    }
    // ㅇㅇㅇㅇㅇ
    /** 안녕 나는 Crow야 */
    //  testing
    /** 나는 까마귀야 */
    
    // 추가추가
    // 냥냥펀치
    
    // 영진이형 점심 뭐먹어요
    // ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
    
    //작업 작업

    // for if 

}