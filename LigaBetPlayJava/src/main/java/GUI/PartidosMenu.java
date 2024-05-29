/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DATA.ListaClase;
import DATA.ListaDGoles;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author camper
 */
public class PartidosMenu extends javax.swing.JFrame {

    ListaClase lista;
    ListaDGoles goles;

    public PartidosMenu(ListaClase lista, ListaDGoles goles) {
        initComponents();
        this.lista = lista;
        goles = new ListaDGoles();
        this.goles = goles;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVol = new javax.swing.JButton();
        btnGua = new javax.swing.JButton();
        txtGlocal = new javax.swing.JTextField();
        txtNvisitante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNLocal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGVisitante = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU PARTIDOS");

        jLabel2.setText("NOMBRE EQUIPO");

        jLabel3.setText("EQUIPO VISITENTE");

        btnVol.setText("VOLVER");
        btnVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolActionPerformed(evt);
            }
        });

        btnGua.setText("GUARDAR");
        btnGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuaActionPerformed(evt);
            }
        });

        txtGlocal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtGlocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGlocalActionPerformed(evt);
            }
        });

        txtNvisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNvisitanteActionPerformed(evt);
            }
        });

        jLabel4.setText("GOLES");

        jLabel5.setText("EQUIPO LOCAL");

        jLabel6.setText("EQUIPO VISITENTE");

        jLabel7.setText("GOLES");

        txtGVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGVisitanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnVol)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGlocal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(141, 141, 141)
                                .addComponent(txtNvisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGua)
                                    .addComponent(txtGVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGlocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNvisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtGVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVol)
                    .addComponent(btnGua))
                .addGap(21, 21, 21))
        );

        txtGlocal.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolActionPerformed
        dispose();

    }//GEN-LAST:event_btnVolActionPerformed

    private void txtGlocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGlocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGlocalActionPerformed

    private void txtGVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGVisitanteActionPerformed

    private void btnGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaActionPerformed

        String localN1 = txtNLocal.getText();
        String InvitadoN1 = txtNvisitante.getText();
//get  y parcear datos de la interfas
        Integer localG1 = Integer.parseInt(txtGlocal.getText());
        String golesL = String.valueOf(localG1);

        Integer InvitadoG1 = Integer.parseInt(txtGVisitante.getText());
        String golesI = String.valueOf(InvitadoG1);

        //logica y validacion 
        Boolean isActive = true;
        List<String> list = this.lista.getLista();
        boolean isActives = true;
        while (isActives == true) {
            //valida el registro de ambos equipos por igual
            if (list.contains(localN1) || list.contains(InvitadoN1)) {
                while (isActives == true) {
                    //valida que el nombre delos equipos no sean iguales
                    if (localN1.equals(InvitadoN1)) {
                        txtNLocal.setText("");
                        txtNvisitante.setText("");
                        JOptionPane.showMessageDialog(null, "El equuipo " + localN1 + " no puede jugar contra el mismo");
                        localN1 = JOptionPane.showInputDialog("Equipo local");
                        InvitadoN1 = JOptionPane.showInputDialog("Ingrese el nombre del equipo visitante");
                    } else {
                        //valida si ambos equipos estan registrados po individual
                        if (list.contains(localN1)) {
                            System.out.println("equipo " + localN1 + " registrado");
                            if (list.contains(InvitadoN1)) {
                                System.out.println("equipo " + InvitadoN1 + " registrado");
                            } else {
                                System.out.println("el equipo " + InvitadoN1 + " NO fue registrado");
                            }
                        } else {
                            System.out.println("el equipo " + localN1 + " No fue registrdo");
                        }
                        System.out.println("nombres OK los nombres son diferentes");
                        isActives = false;
                        Boolean key = true;
                    }
                }

            } else {
                System.out.println("Equipos no registrados");
                break;
            }
        }

        //parte 2 trabajo con listas y guardado 
        //los indexEquipo me dan la ubicaion para empezar para relacionar los goles con los equipos
        Integer indexEquiposL = list.indexOf(localN1);
        Integer indexEquiposI = list.indexOf(InvitadoN1);

        //goles.agregarDataG(indexEquiposL, 0, golesL);
     

        //obtengo el valor de las pocisiones ne las sublistas incremento los partidos jugados por el equipo local
        String valorL = goles.obtenerDatoSublista(indexEquiposL, 0);
        Integer PGl = Integer.valueOf(valorL);
        Integer PGl1 = (PGl + 1);
        String PG1 = String.valueOf(PGl1);
        goles.agregarDataG(indexEquiposL, 0, PG1);

//lo mismo pero para el equipo invitado
        String valorI = goles.obtenerDatoSublista(indexEquiposI, 0);
        Integer PGI = Integer.valueOf(valorI);
        Integer PGI1 = (PGI + 1);
        String PG2 = String.valueOf(PGI1);
        goles.agregarDataG(indexEquiposI, 0, PG2);

//para validar si el equipo local gana le sume un punto a PG
        if (localG1 > InvitadoG1) {
            valorL = goles.obtenerDatoSublista(indexEquiposL, 1);
            PGl = Integer.valueOf(valorL);
            PGl1 = (PGl + 1);
            PG1 = String.valueOf(PGl1);
            goles.agregarDataG(indexEquiposL, 1, PG1);

            // Agrega datos de partidos perdidos al equipo Invitado
            valorI = goles.obtenerDatoSublista(indexEquiposI, 2);
            PGI = Integer.valueOf(valorI);
            PGI1 = (PGI + 1);
            PG2 = String.valueOf(PGI1);
            goles.agregarDataG(indexEquiposI, 2, PG2);

        } else { // para validar si el equpo invitado gane le sume un punto a PG
            valorI = goles.obtenerDatoSublista(indexEquiposI, 1);
            PGI = Integer.valueOf(valorI);
            PGI1 = (PGI + 1);
            PG2 = String.valueOf(PGI1);
            goles.agregarDataG(indexEquiposI, 1, PG2);

            //Agregar datos de partidos perdidos al equipo local 
            valorL = goles.obtenerDatoSublista(indexEquiposL, 2);
            PGl = Integer.valueOf(valorL);
            PGl1 = (PGl + 1);
            PG1 = String.valueOf(PGl1);
            goles.agregarDataG(indexEquiposL, 2, PG1);

        }

        //Validar si los dos equipos estan empatados y incrementar el valor de los partido empatados 
        if (localG1.equals(InvitadoG1)) {
            //Agrea datos de empate a ambos equipos
            //LOCAL
            valorL = goles.obtenerDatoSublista(indexEquiposL, 3);
            PGl = Integer.valueOf(valorL);
            PGl1 = (PGI + 1);
            PG2 = String.valueOf(PGl1);
            goles.agregarDataG(indexEquiposL, 3, PG2);
            //INVITADOS

            valorI = goles.obtenerDatoSublista(indexEquiposI, 3);
            PGI = Integer.valueOf(valorI);
            PGI1 = (PGI + 1);
            PG2 = String.valueOf(PGI1);
            goles.agregarDataG(indexEquiposI, 3, PG2);
        }

        //Validar goles Afabor LOCAL
        Integer GFL = Math.abs(localG1 - InvitadoG1);

        valorL = goles.obtenerDatoSublista(indexEquiposL, 4);
        PGl = Integer.valueOf(valorL);
        PGl1 = (PGI - GFL);
        PG1 = String.valueOf(PGl1);
        goles.agregarDataG(indexEquiposL, 4, PG1);

        //Validar goles Afavor invitados
        valorI = goles.obtenerDatoSublista(indexEquiposI, 4);
        PGI = Integer.valueOf(valorI);
        PGI1 = (GFL - PGI);
        PG2 = String.valueOf(PGI1);
        goles.agregarDataG(indexEquiposI, 4, PG2);

        //Goles en contra
        goles.agregarDataG(indexEquiposL, 5, PG2);
        goles.agregarDataG(indexEquiposI, 5, PG2);

        //total puntos
        if (localG1.equals(InvitadoG1))
        {
            //Empdate Local
            valorL = goles.obtenerDatoSublista(indexEquiposL, 6);
            PGl = Integer.valueOf(valorL);
            PGl1 = (PGI + 1);
            PG1 = String.valueOf(PGl1);
            goles.agregarDataG(indexEquiposL, 6, PG1);
            //Empate Invitado
            valorI = goles.obtenerDatoSublista(indexEquiposI, 6);
            PGI = Integer.valueOf(valorI);
            PGI1 = (GFL +1);
            PG2 = String.valueOf(PGI1);
            goles.agregarDataG(indexEquiposI, 6, PG2);

            //local gana
        }else if (localG1>InvitadoG1){
               valorL = goles.obtenerDatoSublista(indexEquiposL, 6);
            PGl = Integer.valueOf(valorL);
            PGl1 = (PGI + 2);
            PG1 = String.valueOf(PGl1);
            goles.agregarDataG(indexEquiposL, 6, PG1);
        
            //Invitado gana
        }else if (localG1<InvitadoG1){
            valorI = goles.obtenerDatoSublista(indexEquiposI, 6);
            PGI = Integer.valueOf(valorI);
            PGI1 = (GFL +2);
            PG2 = String.valueOf(PGI1);
            goles.agregarDataG(indexEquiposI, 6, PG2);
        
        }


    }//GEN-LAST:event_btnGuaActionPerformed

    private void txtNvisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNvisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNvisitanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGua;
    private javax.swing.JButton btnVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtGVisitante;
    private javax.swing.JTextField txtGlocal;
    private javax.swing.JTextField txtNLocal;
    private javax.swing.JTextField txtNvisitante;
    // End of variables declaration//GEN-END:variables
}
