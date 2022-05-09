/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VIEW;

import DAL.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hugor
 */
public class TelaAutomovel extends javax.swing.JInternalFrame {
    
    
    Connection conexao = null;      // abre conexao
    PreparedStatement pst = null;   //Executa Sql
    ResultSet rs = null;


    /**
     * Creates new form TelaAutomovel
     */
    public TelaAutomovel() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JLabel();
        txtRenavam = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        txtAno = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        BtnAutCad = new javax.swing.JButton();
        BtnAutPes = new javax.swing.JButton();
        BtnAutEdi = new javax.swing.JButton();
        BtnAutEx = new javax.swing.JButton();
        BtnAutImp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Funcionalidade de Automoveis");
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setText("Codigo");

        txtCodigo.setToolTipText("");
        txtCodigo.setName("txtCodigo"); // NOI18N

        txtPlaca.setText("Placa");

        txtRenavam.setText("Renavam");

        txtFabricante.setText("Fabricante");

        txtModelo.setText("Modelo");

        txtAno.setText("Ano");

        jTextField2.setName(""); // NOI18N

        BtnAutCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/add.png"))); // NOI18N
        BtnAutCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutCadActionPerformed(evt);
            }
        });

        BtnAutPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/pesquisar.png"))); // NOI18N
        BtnAutPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutPesActionPerformed(evt);
            }
        });

        BtnAutEdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/editar.png"))); // NOI18N
        BtnAutEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutEdiActionPerformed(evt);
            }
        });

        BtnAutEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/remover.png"))); // NOI18N
        BtnAutEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutExActionPerformed(evt);
            }
        });

        BtnAutImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userImpressora.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnAutCad)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAutPes)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAutEdi)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAutEx)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAutImp)
                                .addGap(756, 756, 756))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPlaca))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jTextField2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFabricante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRenavam)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtModelo)
                                        .addGap(25, 25, 25)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRenavam))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFabricante)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAutImp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnAutPes)
                        .addComponent(BtnAutCad, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnAutEdi, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnAutEx, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(76, 76, 76))
        );

        getAccessibleContext().setAccessibleName("Funcionalidade de Automoveis");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAutCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutCadActionPerformed
        cadastrar();
    }//GEN-LAST:event_BtnAutCadActionPerformed

    private void BtnAutPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutPesActionPerformed
        pesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAutPesActionPerformed

    private void BtnAutExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutExActionPerformed
        excluir();
    }//GEN-LAST:event_BtnAutExActionPerformed

    private void BtnAutEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutEdiActionPerformed
        atualizar();
    }//GEN-LAST:event_BtnAutEdiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAutCad;
    private javax.swing.JButton BtnAutEdi;
    private javax.swing.JButton BtnAutEx;
    private javax.swing.JButton BtnAutImp;
    private javax.swing.JButton BtnAutPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel txtAno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtFabricante;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtRenavam;
    // End of variables declaration//GEN-END:variables


private void cadastrar() {

        String sql = "INSERT INTO `e1automovel` ( `placa`, `renavam`, `fabricante`, `modelo`, `ano`)"
                + " VALUES ( ?, ?, ?, ?, ?)";
              
        try {
            pst = conexao.prepareStatement(sql);
           // pst.setString(1, txtCodigo.getText());
            pst.setString(1, txtPlaca.getText());
            pst.setString(2, txtRenavam.getText());
            pst.setString(3, txtFabricante.getText());
            pst.setString(4, txtModelo.getText());
            pst.setString(5, txtAno.getText());
            
            System.out.println("pst");

            int resultado = pst.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Automovel Cadastrado");
                txtCodigo.setText(null);
                txtPlaca.setText(null);
                txtRenavam.setText(null);
                txtFabricante.setText(null);
                txtModelo.setText(null);
                txtAno.setText(null);
                

            } else {
                JOptionPane.showMessageDialog(null, "Automovel nao Cadastrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

private void pesquisar() {
        String sql ="SELECT * FROM e1automovel WHERE COD=?";
       
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1, txtCodigo.getText());
             rs = pst.executeQuery();
            
             if (rs.next()){
             txtModelo.setText(rs.getString("modelo"));
             txtAno.setText(rs.getString("ano"));
             txtCodigo.setText(rs.getString("cod"));
             txtPlaca.setText(rs.getString("placa"));
             txtRenavam.setText(rs.getString("renavam"));
             txtFabricante.setText(rs.getString("fabricante"));
                        
             }else {
             JOptionPane.showMessageDialog(null, "Automovel nao Localizado");
              txtModelo.setText(null);
              txtAno.setText(null);
              txtCodigo.setText(null);
              txtPlaca.setText(null);
              txtRenavam.setText(null);
              txtFabricante.setText(null);
                          
             }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }

private void excluir() {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBodyy
        String sql ="DELETE FROM e1automovel WHERE COD=?";
       
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1, txtCodigo.getText());
             rs = pst.executeQuery();
             
             int apagado = pst.executeUpdate();
            
             if (apagado >0 ){
                JOptionPane.showMessageDialog(null, "Automovel Excluido");
                txtCodigo.setText(rs.getString("codigo"));
                //txtNome.setText(rs.getString("nome"));
                //collocar os demais campos
             
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    
    }

private void atualizar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         String sql = "UPDATE e1automovel SET PLaca=?, renavam=?, "
                + "fabricante=?, modelo=?, ano=? WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setString(6,txtCodigo.getText());
            pst.setString(1, txtPlaca.getText());
            pst.setString(2,txtRenavam.getText());
            pst.setString(3,txtFabricante.getText());
            pst.setString(4, txtModelo.getText());
            pst.setString(5, txtAno.getText());

            int atualizado = pst.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Automovel Atualizado");
                txtCodigo.setText(null);
                txtPlaca.setText(null);
                txtRenavam.setText(null);
                txtFabricante.setText(null);
                txtModelo.setText(null);
                txtAno.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Automovel nao Atualizado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}