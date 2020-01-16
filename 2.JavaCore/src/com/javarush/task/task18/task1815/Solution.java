package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface component;

        public TableInterfaceWrapper(TableInterface component) {
            this.component = component;
        }

        public void setModel(List rows) {
            int count = 0;
            for (int i = 0; i < rows.size(); i++) {
                count++;
            }
            System.out.println(count);
            component.setModel(rows);

        }

        public String getHeaderText() {
            return component.getHeaderText().toUpperCase();
        }

        public void setHeaderText(String newHeaderText) {
            component.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}