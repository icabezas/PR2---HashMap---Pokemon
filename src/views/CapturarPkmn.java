/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import pr2.hashmap.Pokemon;

/**
 *
 * @author THOR
 */
public class CapturarPkmn extends javax.swing.JDialog {

    /**
     * Creates new form CapturarPkmn
     */
    public CapturarPkmn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarLista();
        for (Pokemon p : Menu.pokemonsCapturados.values()) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listPkmn = new javax.swing.JList<>();
        image = new javax.swing.JLabel();
        btnCapturar = new javax.swing.JButton();
        lblCapturando = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listPkmn.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listPkmn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPkmnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPkmn);

        btnCapturar.setText("CAPTURAR!");
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });

        lblCapturando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Lista pkmns sin capturar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCapturando, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnCapturar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(lblCapturando, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        if (listPkmn.getSelectedValue() != null) {
            Pokemon pkmnCapturar = Menu.pokemons.get(listPkmn.getSelectedValue());
            boolean capturado = pkmnCapturar.capturar();
            if (capturado) {
                lblCapturando.setText("Capturado!");
                Menu.pokemonsCapturados.put(listPkmn.getSelectedValue(), pkmnCapturar);
                inicializarLista();
            } else {
                lblCapturando.setText("No capturado!");
            }
        }
    }//GEN-LAST:event_btnCapturarActionPerformed


    private void listPkmnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPkmnMouseClicked
        Pokemon pkmnSelected = null;
        if (listPkmn.getSelectedValue() != null) {
            pkmnSelected = Menu.pokemons.get(listPkmn.getSelectedValue());
            if (pkmnSelected.getIcon() != null) {
                image.setIcon(pkmnSelected.getIcon());
            } else {
                image.setText("No hay imagen");
                image.setIcon(null);
            }
        }
    }//GEN-LAST:event_listPkmnMouseClicked

    private void inicializarLista() {
        listPkmn.removeAll();
        DefaultListModel<String> demoList = new DefaultListModel<>();
        for (Pokemon pkmn : Menu.pokemons.values()) {
            if (Menu.pokemonsCapturados.get(pkmn.getNombre()) == null) {
                demoList.addElement(pkmn.getNombre());
            }
        }
        listPkmn.setModel(demoList);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapturar;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapturando;
    private javax.swing.JList<String> listPkmn;
    // End of variables declaration//GEN-END:variables
}
