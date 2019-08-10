/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas-souza
 */
public class TableModel extends AbstractTableModel{

    private ProductStock stock = ProductStock.getStock();
    private String[] columns = {"Registro","Produto","Descrição","Quantidade"};
    
    @Override
    public String getColumnName(int column){
        return columns[column];
    }
    
    @Override
    public int getRowCount() {
        return stock.getProducts().size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
               return stock.getProducts().get(rowIndex).getRegistration();
            case 1:
                return stock.getProducts().get(rowIndex).getName();
            case 2:
                return stock.getProducts().get(rowIndex).getDescription();
            case 3:
                return stock.getProducts().get(rowIndex).getQuantity();
            default:
                return "Error";
        }
        
    }
    
    public void updateStockDataTable(){
        this.fireTableDataChanged();
    }
    
}
