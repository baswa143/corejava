package com.example.client;

import com.example.DAOImpl.EmpDAOImpl;
import com.example.dao.EmpDAO;

import java.awt.dnd.DragSourceAdapter;

public class Tester {
    public static void main(String[] args) {
        EmpDAO dao=new EmpDAOImpl();
        dao.executeProcedure(101);
    }

}
