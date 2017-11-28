/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import pr2.hashmap.PokemonAgua;
import pr2.hashmap.PokemonFuego;
import pr2.hashmap.PokemonPlanta;
import static views.Menu.playClick;

/**
 *
 * @author THOR
 */
public class AltaPkmn extends javax.swing.JDialog {

    private ImageIcon iconPkmn = null;

    /**
     * Creates new form AltaPkmn
     */
    public AltaPkmn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showOrHideElements();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPkmn = new javax.swing.ButtonGroup();
        tipoAgua = new javax.swing.ButtonGroup();
        lblTipo = new javax.swing.JLabel();
        salada = new javax.swing.JRadioButton();
        fuego = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        agua = new javax.swing.JRadioButton();
        planta = new javax.swing.JRadioButton();
        intAtaque = new javax.swing.JSpinner();
        intHabitat = new javax.swing.JTextField();
        intPtsSalud = new javax.swing.JSpinner();
        lblDefensa = new javax.swing.JLabel();
        intDefensa = new javax.swing.JSpinner();
        lblAtaque = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        intNombre = new javax.swing.JTextField();
        lblPtsSalud = new javax.swing.JLabel();
        lblHabitat = new javax.swing.JLabel();
        lblTipoAgua = new javax.swing.JLabel();
        dulce = new javax.swing.JRadioButton();
        image = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTipo.setText("Tipo:");

        tipoAgua.add(salada);
        salada.setText("salada");
        salada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saladaActionPerformed(evt);
            }
        });

        tipoPkmn.add(fuego);
        fuego.setSelected(true);
        fuego.setText("FUEGO");
        fuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuegoActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tipoPkmn.add(agua);
        agua.setText("AGUA");
        agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguaActionPerformed(evt);
            }
        });

        tipoPkmn.add(planta);
        planta.setText("PLANTA");
        planta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantaActionPerformed(evt);
            }
        });

        intAtaque.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        intPtsSalud.setModel(new javax.swing.SpinnerNumberModel(20, 20, 100, 1));

        lblDefensa.setText("Defensa");

        intDefensa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        lblAtaque.setText("Ataque");

        jLabel1.setText("Nombre:");
        jSplitPane1.setLeftComponent(jLabel1);
        jSplitPane1.setRightComponent(intNombre);

        lblPtsSalud.setText("Puntos de salud");

        lblHabitat.setText("Habitat:");

        lblTipoAgua.setText("Tipo de agua:");

        tipoAgua.add(dulce);
        dulce.setSelected(true);
        dulce.setText("dulce");
        dulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dulceActionPerformed(evt);
            }
        });

        image.setBackground(new java.awt.Color(0, 0, 0));

        btnImage.setText("IMAGE");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(lblHabitat))
                                .addComponent(lblTipoAgua))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dulce)
                                    .addComponent(salada)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(intAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDefensa)
                                    .addComponent(intDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPtsSalud)
                                    .addComponent(intPtsSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(fuego)
                        .addGap(53, 53, 53)
                        .addComponent(agua))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblAtaque))
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(planta)
                    .addComponent(btnImage))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImage)
                        .addGap(64, 64, 64)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(fuego)
                            .addComponent(agua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAtaque)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(intAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDefensa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(intDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPtsSalud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(intPtsSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHabitat)
                            .addComponent(intHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoAgua)
                                .addGap(18, 18, 18)
                                .addComponent(dulce)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salada))
                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saladaActionPerformed
    }//GEN-LAST:event_saladaActionPerformed

    private void fuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuegoActionPerformed
        this.getContentPane().setBackground(Color.decode("#FF8F77"));
        showOrHideElements();
    }//GEN-LAST:event_fuegoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        playClick("sounds/apress.wav");
        if (Menu.pokemons.containsKey(intNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Este nombre ya existe");
        } else if (intNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Introduce un nombre!");
        } else {
            if (fuego.isSelected()) {
                PokemonFuego pkmnFuego = new PokemonFuego(intNombre.getText(), (Integer) intAtaque.getValue(), (Integer) intDefensa.getValue(), (Integer) intPtsSalud.getValue(), iconPkmn);
                Menu.pokemons.put(intNombre.getText(), pkmnFuego);
                JOptionPane.showMessageDialog(null, "Pokemon añadido correctamente");
                dispose();
            } else if (agua.isSelected()) {
                if (dulce.isSelected()) {
                    PokemonAgua pkmnAgua = new PokemonAgua(dulce.getText(), intNombre.getText(), (Integer) intAtaque.getValue(), (Integer) intDefensa.getValue(), (Integer) intPtsSalud.getValue(), iconPkmn);
                    Menu.pokemons.put(intNombre.getText(), pkmnAgua);
                    JOptionPane.showMessageDialog(null, "Pokemon añadido correctamente");
                    dispose();
                } else {
                    PokemonAgua pkmnAgua = new PokemonAgua(salada.getText(), intNombre.getText(), (Integer) intAtaque.getValue(), (Integer) intDefensa.getValue(), (Integer) intPtsSalud.getValue(), iconPkmn);
                    Menu.pokemons.put(intNombre.getText(), pkmnAgua);
                    JOptionPane.showMessageDialog(null, "Pokemon añadido correctamente");
                    dispose();
                }
            } else if (planta.isSelected()) {
                if (intHabitat.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Introduce un habitat!");
                } else {
                    PokemonPlanta pkmnPlanta = new PokemonPlanta(intHabitat.getText(), intNombre.getText(), (Integer) intAtaque.getValue(), (Integer) intDefensa.getValue(), (Integer) intPtsSalud.getValue(), iconPkmn);
                    Menu.pokemons.put(intNombre.getText(), pkmnPlanta);
                    JOptionPane.showMessageDialog(null, "Pokemon añadido correctamente");
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void aguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguaActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.decode("#77CBFF"));
        lblTipoAgua.setVisible(true);
        dulce.setVisible(true);
        salada.setVisible(true);
        if (lblHabitat.isVisible()) {
            lblHabitat.setVisible(false);
            intHabitat.setVisible(false);
        }
    }//GEN-LAST:event_aguaActionPerformed

    private void plantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantaActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.decode("#90FF77"));
        lblHabitat.setVisible(true);
        intHabitat.setVisible(true);
        if (lblTipoAgua.isVisible()) {
            lblTipoAgua.setVisible(false);
            dulce.setVisible(false);
            salada.setVisible(false);
        }
    }//GEN-LAST:event_plantaActionPerformed

    private void dulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dulceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dulceActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        playClick("sounds/apress.wav");
        JFileChooser fc = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        fc.setFileFilter(filter);
        int response = fc.showOpenDialog(null);
        try {
            if (response == JFileChooser.APPROVE_OPTION) {
                String pathName = fc.getSelectedFile().getPath();
                BufferedImage profile = ImageIO.read(fc.getSelectedFile());
                Image dimg = profile.getScaledInstance(image.getWidth(), image.getHeight(),
                        Image.SCALE_SMOOTH);
                iconPkmn = new ImageIcon(dimg);
                image.setIcon(iconPkmn);
            } else {
                JOptionPane.showMessageDialog(null, "Error subiendo la foto");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnImageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaPkmn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPkmn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPkmn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPkmn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaPkmn dialog = new AltaPkmn(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void showOrHideElements() {
        if (fuego.isSelected()) {
            lblHabitat.setVisible(false);
            intHabitat.setVisible(false);
            lblTipoAgua.setVisible(false);
            dulce.setVisible(false);
            salada.setVisible(false);
            this.getContentPane().setBackground(Color.decode("#FF8F77"));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agua;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImage;
    private javax.swing.JRadioButton dulce;
    private javax.swing.JRadioButton fuego;
    private javax.swing.JLabel image;
    private javax.swing.JSpinner intAtaque;
    private javax.swing.JSpinner intDefensa;
    private javax.swing.JTextField intHabitat;
    private javax.swing.JTextField intNombre;
    private javax.swing.JSpinner intPtsSalud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblHabitat;
    private javax.swing.JLabel lblPtsSalud;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoAgua;
    private javax.swing.JRadioButton planta;
    private javax.swing.JRadioButton salada;
    private javax.swing.ButtonGroup tipoAgua;
    private javax.swing.ButtonGroup tipoPkmn;
    // End of variables declaration//GEN-END:variables
}
