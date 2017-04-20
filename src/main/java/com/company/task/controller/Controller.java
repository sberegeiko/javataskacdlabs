package com.company.task.controller;

import com.company.task.model.Line;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by Think on 19.04.2017.
 */
@WebServlet("/action")
public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = req.getParameter("data");
        StringTokenizer st = new StringTokenizer(data, "\n");
        Line line;
        List<Line> lineList = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        while (st.hasMoreTokens()) {
            strings.add(st.nextToken());
        }

        for (String s : strings) {
            line = new Line(s);
            lineList.add(line);
        }
        Collections.sort(lineList);

        req.setAttribute("list", lineList);
        req.setAttribute("data", data);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
