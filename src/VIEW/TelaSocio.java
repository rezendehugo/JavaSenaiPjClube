/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VIEW;

import DAL.ModuloConexao;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class TelaSocio extends javax.swing.JInternalFrame {

    Connection conexao = null;      // abre conexao
    PreparedStatement pst = null;   //Executa Sql
    ResultSet rs = null;

    public TelaSocio() {
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

        btnCliCad = new javax.swing.JButton();
        btnCliPes = new javax.swing.JButton();
        btnCliEdi = new javax.swing.JButton();
        btnCliEx = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtTelRes = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsocios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        txtBai = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCid = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        cbbUf = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCel = new javax.swing.JFormattedTextField();

        setTitle("Funcionalidade de Socios");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(619, 490));

        btnCliCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userAdicionar.png"))); // NOI18N
        btnCliCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliCadActionPerformed(evt);
            }
        });

        btnCliPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userPesquisar.png"))); // NOI18N
        btnCliPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliPesActionPerformed(evt);
            }
        });

        btnCliEdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userEditar.png"))); // NOI18N
        btnCliEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEdiActionPerformed(evt);
            }
        });

        btnCliEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/userDeletar.png"))); // NOI18N
        btnCliEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel3.setText("Nome");

        jLabel4.setText("RG");

        jLabel5.setText("Data Nascimento");

        jLabel7.setText("Telefone");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNasc.setToolTipText("");
        txtDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascActionPerformed(evt);
            }
        });

        try {
            txtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelResActionPerformed(evt);
            }
        });

        tblsocios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsociosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsocios);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel8.setText("Logradouro");

        jLabel9.setText("Bairro");

        jLabel10.setText("Complemento");

        jLabel12.setText("Cidade");

        jLabel13.setText("CEP");

        jLabel14.setText("UF");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbbUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLog))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(22, 22, 22)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel2.setText("Celular");

        try {
            txtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 55, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnCliCad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCliPes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCliEdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCliEx, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCliPes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCliCad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCliEdi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCliEx, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCliPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliPesActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnCliPesActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascActionPerformed

    private void cbbUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbUfActionPerformed

    private void btnCliCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliCadActionPerformed
        // TODO add your handling code here:
        cadastrar();
    }//GEN-LAST:event_btnCliCadActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        pesquisar_clientes();
        
    }//GEN-LAST:event_txtNomeKeyReleased

    private void tblsociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsociosMouseClicked
        // TODO add your handling code here:
        buscar_dados_socios();
       
    }//GEN-LAST:event_tblsociosMouseClicked

    private void btnCliExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliExActionPerformed
        // TODO add your handling code here:
        remover();
    }//GEN-LAST:event_btnCliExActionPerformed

    private void btnCliEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliEdiActionPerformed
        // TODO add your handling code here:
        atualizar();
    }//GEN-LAST:event_btnCliEdiActionPerformed

    private void txtTelResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelResActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliCad;
    private javax.swing.JButton btnCliEdi;
    private javax.swing.JButton btnCliEx;
    private javax.swing.JButton btnCliPes;
    private javax.swing.JComboBox<String> cbbUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsocios;
    private javax.swing.JTextField txtBai;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelRes;
    // End of variables declaration//GEN-END:variables

     private String recuperarData(){ 
        Date date = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");  
        String strDate = dateFormat.format(date);  
        
        return strDate;
     }
    
     private void cadastrar() {
         

        String sql = "INSERT INTO socio (NOME, RG,DATAADM, DATANASC,"
                + "TELCEL, TELRES, BAIRRO, CEP, LOGRADOURO, "
                + "LOCALIDADE, UF, COMPLEMENTO) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(sql);            
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtRg.getText());            
            pst.setString(3, recuperarData());
            pst.setString(4, txtDataNasc.getText());
            pst.setString(5, txtCel.getText());
            pst.setString(6, txtTelRes.getText());
            pst.setString(7, txtBai.getText());
            pst.setString(8, txtCep.getText());
            pst.setString(9, txtLog.getText());
            pst.setString(10, txtCid.getText());
            pst.setString(11, cbbUf.getSelectedItem().toString()); // Pega posicao de um array e transforma em String
            pst.setString(12, txtComplemento.getText());
            System.out.println("Script add Socio: " + pst);

            int resultado = pst.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Socio Cadastrado");
                txtCodigo.setText(null);
                txtNome.setText(null);
                txtRg.setText(null);
                txtDataNasc.setText(null);
                txtCel.setText(null);
                txtTelRes.setText(null);
                txtBai.setText(null);
                txtCep.setText(null);
                txtLog.setText(null);
                txtCid.setText(null);
                cbbUf.setSelectedItem(null);
                txtComplemento.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Socio nao Cadastrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void pesquisar_clientes() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //String sql = " SELECT COD,NOME,CPF,UF FROM e2cliente WHERE NOME like ? ";
        String sql = " SELECT * FROM socio WHERE NOME like ? ";
   
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1, txtNome.getText() + "%"     );
             rs = pst.executeQuery();
             
             tblsocios.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    
    
    
    
    
    }

    private void buscar_dados_socios() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int buscar = tblsocios.getSelectedRow();
        txtCodigo.setText(tblsocios.getModel().getValueAt(buscar,0).toString());
        txtNome.setText(tblsocios.getModel().getValueAt(buscar,1).toString());
        txtRg.setText(tblsocios.getModel().getValueAt(buscar,2).toString());
        txtDataNasc.setText(tblsocios.getModel().getValueAt(buscar,3).toString());
        //txtDataAdm.setText(tblsocios.getModel().getValueAt(buscar,3).toString());
        txtCel.setText(tblsocios.getModel().getValueAt(buscar,4).toString());
        txtTelRes.setText(tblsocios.getModel().getValueAt(buscar,5).toString());
        txtBai.setText(tblsocios.getModel().getValueAt(buscar,6).toString());
        txtCep.setText(tblsocios.getModel().getValueAt(buscar,7).toString());
        txtLog.setText(tblsocios.getModel().getValueAt(buscar,8).toString());
        txtCid.setText(tblsocios.getModel().getValueAt(buscar,9).toString());
        cbbUf.setSelectedItem(tblsocios.getModel().getValueAt(buscar,10).toString());
        txtComplemento.setText(tblsocios.getModel().getValueAt(buscar,11).toString());
    
    }

    private void consultar() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       String sql ="SELECT * FROM socio WHERE COD=?";
       
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1, txtCodigo.getText());
             rs = pst.executeQuery();
            
             if (rs.next()){
             txtNome.setText(rs.getString("nome"));
             txtCodigo.setText(rs.getString("cod"));
             txtBai.setText(rs.getString("bairro"));
             txtCodigo.setText("codigo");
             txtDataNasc.setText(rs.getString("datanasc"));
             txtCel.setText(rs.getString("telcel"));
             txtTelRes.setText(rs.getString("telres"));
             txtLog.setText(rs.getString("logradouro"));
             txtComplemento.setText(rs.getString("complemento"));
             txtCep.setText("cep");
             
             }else {
             JOptionPane.showMessageDialog(null, "Socio nao Localizado");
              txtNome.setText(null);
              txtCodigo.setText(null);
             
             }
             
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }

    private void remover() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql ="DELETE FROM socio WHERE COD=?";
       
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1, txtCodigo.getText());
             rs = pst.executeQuery();
             
             int apagado = pst.executeUpdate();
            
             if (apagado >0 ){
                JOptionPane.showMessageDialog(null, "socio Excluido");
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
        String sql = "UPDATE socio SET NOME =?, RG=?, "
                + " DATANASC=? ,"
                + "TELCEL=?, TELRES=?, BAIRRO=?, CEP=?, LOGRADOURO=?, "
                + "LOCALIDADE=?, UF=?  WHERE COD=?";

        try {
            pst = conexao.prepareStatement(sql);            
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtRg.getText());
            pst.setString(3, txtDataNasc.getText());
            pst.setString(4, txtCel.getText());
            pst.setString(5, txtTelRes.getText());
            pst.setString(6, txtBai.getText());
            pst.setString(7, txtCep.getText());
            pst.setString(8, txtLog.getText());
            pst.setString(9, txtCid.getText());
            pst.setString(10, cbbUf.getSelectedItem().toString()); // Pega posicao de um array e transforma em String
            pst.setString(11, txtComplemento.getText());
             pst.setString(12, txtCodigo.getText());
            System.out.println("Script atualizar Socio: " + pst);

            int atualizado = pst.executeUpdate();

            if (atualizado == 1) {
                JOptionPane.showMessageDialog(null, "Socio Atualizado");
                txtNome.setText(null);
                txtRg.setText(null);
                txtDataNasc.setText(null);
                txtCel.setText(null);
                txtTelRes.setText(null);
                txtBai.setText(null);
                txtCep.setText(null);
                txtLog.setText(null);
                txtCid.setText(null);
                cbbUf.setSelectedItem(null);
                txtComplemento.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "Socio nao Atualizado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
        
    }

        /*
    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private void setString(int i, String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int executeUpadate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }
    }
}
*/
