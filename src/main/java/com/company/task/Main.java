package com.company.task;

import com.company.task.model.Line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Think on 19.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        String bufferedLine;
        List<Line> lineList = new ArrayList<>();
        Line line;
        System.out.println("Unsorted data from file:");
        System.out.println("-----------------------------------");

        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while ((bufferedLine = reader.readLine()) != null) {
                line = new Line(bufferedLine);
                System.out.println(line);
                lineList.add(line);
            }
        } catch (IOException e){
            System.out.println(e);
        }
        System.out.println("-----------------------------------");
        System.out.println();

        Collections.sort(lineList);
        System.out.println("Sorted data:");
        System.out.println("-----------------------------------");
        for (Line l : lineList) {
            System.out.println(l);
        }
    }
}

