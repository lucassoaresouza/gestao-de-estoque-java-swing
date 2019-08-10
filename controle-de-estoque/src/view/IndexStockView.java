/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.StockController;
import java.util.ArrayList;
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
        stockCtrl.getTableModel().updateStockDataTable();
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
        stockCtrl.getTableModel().updateStockDataTable();
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(newProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
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
                        .addGap(28, 28, 28)
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

        javax.swing.GroupLayout stockLabelLayout = new javax.swing.GroupLayout(stockLabel);
        stockLabel.setLayout(stockLabelLayout);
        stockLabelLayout.setHorizontalGroup(
            stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLabelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        stockLabelLayout.setVerticalGroup(
            stockLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLabelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel navBar;
    private java.awt.Button newProduct;
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
