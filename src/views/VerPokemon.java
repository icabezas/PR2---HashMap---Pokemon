/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pr2.hashmap.Pokemon;
import static views.Menu.playClick;

/**
 *
 * @author THOR
 */
public class VerPokemon extends javax.swing.JDialog {

    ArrayList<Pokemon> pokemonTipo = new ArrayList<>();
    private int position = 0;

    /**
     * Creates new form VerPokemon
     */
    public VerPokemon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controlButtons(0);
        if (!Menu.pokemons.isEmpty()) {
            showInfoPkmn(0, getTipoSelected());
        }
        log();
    }

    public void log() {
        if (!pokemonTipo.isEmpty()) {
            for (Pokemon p : pokemonTipo) {
                System.out.println(p.getNombre());
            }
            System.out.println("tamaño pokemonTipo = " + pokemonTipo.size());
        }
    }

    public String getTipoSelected() {
        String tipo = "";
        if (rdBtnTodos.isSelected()) {
            tipo = "TODOS";
        } else if (rdBtnAgua.isSelected()) {
            tipo = "AGUA";
        } else if (rdBtnFuego.isSelected()) {
            tipo = "FUEGO";
        } else {
            tipo = "PLANTA";
        }
        return tipo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTipoPkmn = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblAtaque = new javax.swing.JLabel();
        lblDefensa = new javax.swing.JLabel();
        lblPtsSalud = new javax.swing.JLabel();
        lblExtraInfo = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        textTipo = new javax.swing.JLabel();
        textAtaque = new javax.swing.JLabel();
        textDefensa = new javax.swing.JLabel();
        textPtsSalud = new javax.swing.JLabel();
        rdBtnTodos = new javax.swing.JRadioButton();
        rdBtnFuego = new javax.swing.JRadioButton();
        rdBtnAgua = new javax.swing.JRadioButton();
        rdBtnPlanta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selecciona el tipo de pokemon:");

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setText("ANTERIOR");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        image.setBackground(new java.awt.Color(0, 0, 0));

        lblNombre.setText("NOMBRE:");

        lblTipo.setText("TIPO:");

        lblAtaque.setText("ATAQUE");

        lblDefensa.setText("DEFENSA");

        lblPtsSalud.setText("PTS SALUD:");

        lblExtraInfo.setText(" ");

        textNombre.setText(" ");

        textTipo.setText(" ");

        textAtaque.setText(" ");

        textDefensa.setText(" ");

        textPtsSalud.setText(" ");

        groupTipoPkmn.add(rdBtnTodos);
        rdBtnTodos.setSelected(true);
        rdBtnTodos.setText("TODOS");
        rdBtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnTodosActionPerformed(evt);
            }
        });

        groupTipoPkmn.add(rdBtnFuego);
        rdBtnFuego.setText("FUEGO");
        rdBtnFuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnFuegoActionPerformed(evt);
            }
        });

        groupTipoPkmn.add(rdBtnAgua);
        rdBtnAgua.setText("AGUA");
        rdBtnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnAguaActionPerformed(evt);
            }
        });

        groupTipoPkmn.add(rdBtnPlanta);
        rdBtnPlanta.setText("PLANTA");
        rdBtnPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnPlantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rdBtnTodos)
                        .addGap(18, 18, 18)
                        .addComponent(rdBtnFuego)
                        .addGap(18, 18, 18)
                        .addComponent(rdBtnAgua)
                        .addGap(18, 18, 18)
                        .addComponent(rdBtnPlanta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblExtraInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblTipo)
                                    .addComponent(lblAtaque)
                                    .addComponent(lblDefensa)
                                    .addComponent(lblPtsSalud))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPtsSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtnTodos)
                    .addComponent(rdBtnFuego)
                    .addComponent(rdBtnAgua)
                    .addComponent(rdBtnPlanta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(textNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(textTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtaque)
                            .addComponent(textAtaque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDefensa)
                            .addComponent(textDefensa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPtsSalud)
                            .addComponent(textPtsSalud))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExtraInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        playClick("sounds/apress.wav");
        position++;
        showInfoPkmn(position, getTipoSelected());
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        playClick("sounds/apress.wav");
        position--;
        showInfoPkmn(position, getTipoSelected());
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void rdBtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnTodosActionPerformed
        playClick("sounds/apress.wav");
        position = 0;
        showInfoPkmn(0, "todos");
    }//GEN-LAST:event_rdBtnTodosActionPerformed

    private void rdBtnFuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnFuegoActionPerformed
        playClick("sounds/apress.wav");
        position = 0;
        showInfoPkmn(0, "fuego");
    }//GEN-LAST:event_rdBtnFuegoActionPerformed

    private void rdBtnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnAguaActionPerformed
        playClick("sounds/apress.wav");
        position = 0;
        showInfoPkmn(0, "agua");
    }//GEN-LAST:event_rdBtnAguaActionPerformed

    private void rdBtnPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnPlantaActionPerformed
        playClick("sounds/apress.wav");
        position = 0;
        showInfoPkmn(0, "planta");
    }//GEN-LAST:event_rdBtnPlantaActionPerformed

    public void showInfoPkmn(int position, String tipo) {
        controlButtons(position);
        if (tipo.equalsIgnoreCase("TODOS")) {
            pokemonTipo.clear();
            for (Pokemon p : Menu.pokemons.values()) {
                pokemonTipo.add(p);
            }
        } else {
            pokemonTipo.clear();
            for (Pokemon p : Menu.pokemons.values()) {
                if (p instanceof pr2.hashmap.PokemonFuego && tipo.equalsIgnoreCase("fuego")) {
                    pokemonTipo.add(p);
                } else if (p instanceof pr2.hashmap.PokemonAgua && tipo.equalsIgnoreCase("agua")) {
                    pokemonTipo.add(p);
                } else if (p instanceof pr2.hashmap.PokemonPlanta && tipo.equalsIgnoreCase("planta")) {
                    pokemonTipo.add(p);
                }
            }
        }
        Pokemon pokemonActual = pokemonTipo.get(position);
        textNombre.setText(pokemonActual.getNombre());
        textAtaque.setText(String.valueOf(pokemonActual.getAtaque()));
        textDefensa.setText(String.valueOf(pokemonActual.getDefensa()));
        textPtsSalud.setText(String.valueOf(pokemonActual.getPtsSalud()));
        image.setIcon(pokemonActual.getIcon());
        if (pokemonActual instanceof pr2.hashmap.PokemonAgua) {
            this.getContentPane().setBackground(Color.decode("#77CBFF"));
            textTipo.setText("Agua");
            lblExtraInfo.setText(((pr2.hashmap.PokemonAgua) pokemonActual).getTipoAgua());
        } else if (pokemonActual instanceof pr2.hashmap.PokemonPlanta) {
            this.getContentPane().setBackground(Color.decode("#90FF77"));
            textTipo.setText("Planta");
            lblExtraInfo.setText(((pr2.hashmap.PokemonPlanta) pokemonActual).getHabitat());
        } else {
            this.getContentPane().setBackground(Color.decode("#FF8F77"));
            textTipo.setText("Fuego");
        }
        System.out.println("log: ");
        log();
    }

    public void controlButtons(int position) {
        if (position == 0) {
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(true);
        } else if (position == pokemonTipo.size() - 1) {
            btnSiguiente.setEnabled(false);
            btnAnterior.setEnabled(true);
        } else {
            btnAnterior.setEnabled(true);
            btnSiguiente.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup groupTipoPkmn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblExtraInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPtsSalud;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rdBtnAgua;
    private javax.swing.JRadioButton rdBtnFuego;
    private javax.swing.JRadioButton rdBtnPlanta;
    private javax.swing.JRadioButton rdBtnTodos;
    private javax.swing.JLabel textAtaque;
    private javax.swing.JLabel textDefensa;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textPtsSalud;
    private javax.swing.JLabel textTipo;
    // End of variables declaration//GEN-END:variables
}
