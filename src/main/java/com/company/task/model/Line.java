package com.company.task.model;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Think on 19.04.2017.
 */
public class Line implements Comparable<Line> {

    private String[] lineParts;

    public Line(String str) {
        StringTokenizer st = new StringTokenizer(str);
        this.lineParts = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            this.lineParts[i++] = st.nextToken();
        }
    }

    public String[] getLineParts() {
        return lineParts;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineParts=" + Arrays.toString(lineParts) +
                '}';
    }

    @Override
    public int compareTo(Line o) {
        int result;
        for (int i = 0; i < Math.min(this.lineParts.length, o.lineParts.length); i++) {
            if (isDouble(lineParts[i]) && isDouble(o.lineParts[i])) {
                result = Double.compare(Double.valueOf(lineParts[i]), Double.valueOf(o.lineParts[i]));
            } else if (!isDouble(lineParts[i]) && !isDouble(o.lineParts[i])) {
                result = lineParts[i].compareTo(o.lineParts[i]);
            } else if(isDouble(lineParts[i]) && !isDouble(o.lineParts[i])) {
                result = -1;
            } else {
                result = 1;
            }
            if (result == 0) continue;
            return result;
        }
        return 0;
    }

    boolean isDouble(String str) {
        if (str == null) return false;
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
