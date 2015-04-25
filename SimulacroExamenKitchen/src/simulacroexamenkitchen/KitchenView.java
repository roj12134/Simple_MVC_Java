/*
 * KitchenView.java
 * 24 Octubre 2012
 * Giovanni Rojas Mazariegos 12134
 * 
 */
package simulacroexamenkitchen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Giovanni Rojas 
 * 
 * Esta solo es la vista aqui no hay ningun metodo declarado, solo esta la interfaz como tal. 
 */
public class KitchenView extends JPanel {

   
    public KitchenView() {
        initComponents(); // esto es lo unico generado por Netbeans en todo el programa. 
    }

    
    // get y set de cada variable para obtenerlos en otra clase. 

    public JButton getCookButton() {
        return cookButton;
    }

    public void setCookButton(JButton cookButton) {
        this.cookButton = cookButton;
    }

    public JLabel getCupWaterLabel() {
        return cupWaterLabel;
    }

    public void setCupWaterLabel(JLabel cupWaterLabel) {
        this.cupWaterLabel = cupWaterLabel;
    }

    public JLabel getIntegraRiceLabel() {
        return integraRiceLabel;
    }

    public void setIntegraRiceLabel(JLabel integraRiceLabel) {
        this.integraRiceLabel = integraRiceLabel;
    }

    public JLabel getLabelOlla() {
        return labelOlla;
    }

    public void setLabelOlla(JLabel labelOlla) {
        this.labelOlla = labelOlla;
    }

    public JLabel getOatsLabel() {
        return oatsLabel;
    }

    public void setOatsLabel(JLabel oatsLabel) {
        this.oatsLabel = oatsLabel;
    }

    public JLabel getSpaguettiLabel() {
        return spaguettiLabel;
    }

    public void setSpaguettiLabel(JLabel spaguettiLabel) {
        this.spaguettiLabel = spaguettiLabel;
    }

    public JLabel getWaterLabel() {
        return waterLabel;
    }

    public void setWaterLabel(JLabel waterLabel) {
        this.waterLabel = waterLabel;
    }

    public JLabel getWhiteRiceLabel() {
        return whiteRiceLabel;
    }

    public void setWhiteRiceLabel(JLabel whiteRiceLabel) {
        this.whiteRiceLabel = whiteRiceLabel;
    }

    public JLabel getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(JLabel cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public JButton getRestarButton() {
        return restarButton;
    }

    public void setRestarButton(JButton restarButton) {
        this.restarButton = restarButton;
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEncabezado = new javax.swing.JLabel();
        labelOlla = new javax.swing.JLabel();
        cookButton = new javax.swing.JButton();
        spaguettiLabel = new javax.swing.JLabel();
        whiteRiceLabel = new javax.swing.JLabel();
        integraRiceLabel = new javax.swing.JLabel();
        oatsLabel = new javax.swing.JLabel();
        cupWaterLabel = new javax.swing.JLabel();
        waterLabel = new javax.swing.JLabel();
        titleLable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cantidadAgua = new javax.swing.JLabel();
        restarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        labelEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/background.jpeg"))); // NOI18N

        labelOlla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/olla.jpeg"))); // NOI18N

        cookButton.setBackground(new java.awt.Color(255, 255, 255));
        cookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/cook.png"))); // NOI18N
        cookButton.setText("Cook");
        cookButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        spaguettiLabel.setBackground(new java.awt.Color(255, 255, 255));
        spaguettiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spaguettiLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/rice.jpeg"))); // NOI18N
        spaguettiLabel.setText("Spaguetti");
        spaguettiLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        spaguettiLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spaguettiLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        spaguettiLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        whiteRiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        whiteRiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteRiceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/rice.jpeg"))); // NOI18N
        whiteRiceLabel.setText("White Rice");
        whiteRiceLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        whiteRiceLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whiteRiceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteRiceLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        integraRiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        integraRiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        integraRiceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/integralRice.jpeg"))); // NOI18N
        integraRiceLabel.setText("Integral Rice");
        integraRiceLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        integraRiceLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        integraRiceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        integraRiceLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        oatsLabel.setBackground(new java.awt.Color(255, 255, 255));
        oatsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oatsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/oats.jpeg"))); // NOI18N
        oatsLabel.setText("Oats");
        oatsLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        oatsLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oatsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oatsLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        cupWaterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/cupWater.jpeg"))); // NOI18N
        cupWaterLabel.setText("Cup Water");
        cupWaterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cupWaterLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        waterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/halfWater.jpeg"))); // NOI18N
        waterLabel.setText("1/2 Cup Water");
        waterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        waterLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        titleLable.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        titleLable.setText("Chocos's Cook");

        jLabel1.setText("Cups of Water : ");

        cantidadAgua.setText("0");

        restarButton.setBackground(new java.awt.Color(255, 255, 255));
        restarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesKitchen/restart.png"))); // NOI18N
        restarButton.setText("Restart");
        restarButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        restarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(labelEncabezado, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(titleLable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(cantidadAgua, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(39, 39, 39)
                                    .add(cupWaterLabel))
                                .add(layout.createSequentialGroup()
                                    .add(27, 27, 27)
                                    .add(waterLabel))))
                        .add(60, 60, 60))
                    .add(layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jLabel1)
                        .add(64, 64, 64)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(cookButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(restarButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(46, 46, 46))
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(labelOlla)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(whiteRiceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(spaguettiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(integraRiceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(oatsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(labelEncabezado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(layout.createSequentialGroup()
                                .add(82, 82, 82)
                                .add(cupWaterLabel)
                                .add(43, 43, 43)
                                .add(waterLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel1))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(96, 96, 96)
                                .add(labelOlla, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(cookButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(restarButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(titleLable)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(whiteRiceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(integraRiceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(oatsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(spaguettiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cantidadAgua)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void restarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidadAgua;
    private javax.swing.JButton cookButton;
    private javax.swing.JLabel cupWaterLabel;
    private javax.swing.JLabel integraRiceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEncabezado;
    private javax.swing.JLabel labelOlla;
    private javax.swing.JLabel oatsLabel;
    private javax.swing.JButton restarButton;
    private javax.swing.JLabel spaguettiLabel;
    private javax.swing.JLabel titleLable;
    private javax.swing.JLabel waterLabel;
    private javax.swing.JLabel whiteRiceLabel;
    // End of variables declaration//GEN-END:variables
}
