/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.StockController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author lucas-souza
 */
public class IndexStockView extends javax.swing.JFrame {

    StockController stockCtrl;
    
    public IndexStockView() {
        this.stockCtrl = new StockController(); 
        initComponents();
        updateUserDataBar();
        updateStockDataBar();
        setResizable(false);
        stockCtrl.getTableModel().addRowStockDataTable();
        stockData.setModel(stockCtrl.getTableModel());
        
    }

    private void updateUserDataBar(){
        userName.setText(stockCtrl.getUserName());
        userRegister.setText(stockCtrl.getUserRegistration());
    }
    
    private void updateStockDataBar(){
        productQuantity.setText(Integer.toString(stockCtrl.getProductQuantity()));
        volumesQuantity.setText(Integer.toString(stockCtrl.getTotalVolumesQuantity()));
    }
    
    private void makeLineStockDataTable(Product prod){
        //stockData
    }
    
    public void newProduct(String prodReg,String prodNm, String prodDscpt, int prodQntd){
        stockCtrl.addProductToStock(prodReg, prodNm, prodDscpt, prodQntd);
        stockCtrl.getTableModel().addRowStockDataTable();
    }
    
    public void deleteSelectedProduct(int index){
        stockCtrl.removeProduct(index);
        stockCtrl.getTableModel().updateStockDataTable(index);
    }
    
    private void callFeedback(String message){
        JOptionPane.showMessageDialog(null,message);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userRegisterLabel = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userRegister = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        productTypeQuantity = new javax.swing.JLabel();
        totalProductQuantity = new javax.swing.JLabel();
        productQuantity = new javax.swing.JLabel();
        volumesQuantity = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        newProduct = new java.awt.Button();
        stockLabel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockData = new javax.swing.JTable();
        prodRemVolumn = new java.awt.Button();
        prodDelete = new java.awt.Button();
        prodUpdate1 = new java.awt.Button();
        prodAddVolumn1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Stoque");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 728));
        setMinimumSize(new java.awt.Dimension(1024, 728));
        setPreferredSize(new java.awt.Dimension(1024, 728));

        navBar.setBackground(new java.awt.Color(222, 184, 135));

        userNameLabel.setText("Usuário:");

        userRegisterLabel.setText("Registro:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        productTypeQuantity.setText("Quantidade de tipos de produtos:");

        totalProductQuantity.setText("Quantidade total de volumes:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        newProduct.setActionCommand("newProduct");
        newProduct.setLabel("Novo Produto");
        newProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userRegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addComponent(productTypeQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addComponent(totalProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volumesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(newProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(navBarLayout.createSequentialGroup()
                    .addGap(266, 266, 266)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(922, Short.MAX_VALUE)))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userNameLabel)
                                .addComponent(userName)
                                .addComponent(productTypeQuantity)))
                        .addGap(20, 20, 20)
                        .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userRegisterLabel)
                                .addComponent(userRegister)
                                .addComponent(totalProductQuantity))
                            .addComponent(volumesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(newProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );

        stockLabel.setBackground(new java.awt.Color(255, 255, 224));

        stockData.setBackground(new java.awt.Color(255, 255, 224));
        stockData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Produto", "Descrição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockData.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(stockData);
        if (stockData.getColumnModel().getColumnCount() > 0) {
            stockData.getColumnModel().getColumn(0).setResizable(false);
            stockData.getColumnModel().getColumn(0).setPreferredWidth(10);
            stockData.getColumnModel().getColumn(1).setResizable(false);
            stockData.getColumnModel().getColumn(1).setPreferredWidth(30);
            stockData.getColumnModel().getColumn(2).setResizable(false);
            stockData.getColumnModel().getColumn(2).setPreferredWidth(50);
            stockData.getColumnModel().getColumn(3).setResizable(false);
            stockData.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        prodRemVolumn.setLabel("Remover Volume");
        prodRemVolumn.setName(""); // NOI18N
        prodRemVolumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodRemVolumnActionPerformed(evt);
            }
        });

        prodDelete.setLabel("Deletar Produto");
        prodDelete.setName(""); // NOI18N
        prodDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodDeleteActionPerformed(evt);
            }
        });

        prodUpdate1.setLabel("Atualizar Produto");
        prodUpdate1.setName(""); // NOI18N

        prodAddVolumn1.setLabel("Adicionar Volume");
        prodAddVolumn1.setName(""); // NOI18N
        prodAddVolumn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodAddVolumn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stockLabelLayout = new javax.swing.GroupLayout(stockLabel);
        stockLabel.setLayout(stockLabelLayout);
        stockLabelLayout.setHorizontalGroup(
            stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLabelLayout.createSequentialGroup()
                .addGroup(stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stockLabelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(stockLabelLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addGroup(stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stockLabelLayout.createSequentialGroup()
                                .addComponent(prodRemVolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prodAddVolumn1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(stockLabelLayout.createSequentialGroup()
                                .addComponent(prodDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prodUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        stockLabelLayout.setVerticalGroup(
            stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLabelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prodRemVolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodAddVolumn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prodDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodUpdate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(stockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 639, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 87, Short.MAX_VALUE)
                    .addComponent(stockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductActionPerformed
        NewProductView newProduct = new NewProductView(this,true);
        newProduct.setResizable(false);
        newProduct.setLocationRelativeTo(null);
        newProduct.setVisible(true);
        updateStockDataBar();   
    }//GEN-LAST:event_newProductActionPerformed

    private void prodDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodDeleteActionPerformed
        if(stockData.getSelectedRow() != -1){
            this.deleteSelectedProduct(stockData.getSelectedRow());
            updateStockDataBar();
            callFeedback("Tipo de produto deletado com sucesso!");
        } else {
            callFeedback("Não foi possível deletar o produto!");
        }
    }//GEN-LAST:event_prodDeleteActionPerformed

    private void prodRemVolumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodRemVolumnActionPerformed
        int row = stockData.getSelectedRow();
        if(row != -1){
            if(getProductVolum(row) > 1){
                stockCtrl.getProductByIndex(row).removeQuantity();
                stockCtrl.getTableModel().updateStockDataTable(row);
                updateStockDataBar();
            } else {
                callFeedback("Impossível remover:\nO produto possui somente"
                        + "um único volume!");
            }
        } else {
            callFeedback("Nenhuma linha foi selecionada!");
        }
    }//GEN-LAST:event_prodRemVolumnActionPerformed

    private int getProductVolum(int index){
        return stockCtrl.getProductByIndex(index).getQuantity();
    }
    
    private void prodAddVolumn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodAddVolumn1ActionPerformed
        if(stockData.getSelectedRow() != -1){
           stockCtrl.getProductByIndex(stockData.getSelectedRow()).addQuantity();
           stockCtrl.getTableModel().updateStockDataTable(stockData.getSelectedRow());
           updateStockDataBar();
        } else {
            callFeedback("Nenhuma linha foi selecionada!");
        }
    }//GEN-LAST:event_prodAddVolumn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel navBar;
    private java.awt.Button newProduct;
    private java.awt.Button prodAddVolumn1;
    private java.awt.Button prodDelete;
    private java.awt.Button prodRemVolumn;
    private java.awt.Button prodUpdate1;
    private javax.swing.JLabel productQuantity;
    private javax.swing.JLabel productTypeQuantity;
    private javax.swing.JTable stockData;
    private javax.swing.JPanel stockLabel;
    private javax.swing.JLabel totalProductQuantity;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userRegister;
    private javax.swing.JLabel userRegisterLabel;
    private javax.swing.JLabel volumesQuantity;
    // End of variables declaration//GEN-END:variables
}
